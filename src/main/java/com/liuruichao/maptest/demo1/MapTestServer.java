package com.liuruichao.maptest.demo1;

import com.liuruichao.helloworld2.HelloWorldServer2;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.examples.maptest1.MapReply;
import io.grpc.examples.maptest1.MapRequest;
import io.grpc.examples.maptest1.MapTestService1Grpc;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * MapTestServer
 *
 * @author liuruichao
 * Created on 2017/4/28 15:25
 */
public class MapTestServer {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServer2.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new MapService())
                .build().start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                logger.info("*** shutting down gRPC server since JVM is shutting down");
                if (server != null) {
                    server.shutdown();
                }
                logger.info("*** server shut down");
            }
        });
        server.awaitTermination();
    }

    private static class MapService extends MapTestService1Grpc.MapTestService1ImplBase {
        @Override
        public void getRoles(MapRequest request, StreamObserver<MapReply> responseObserver) {
            String name = request.getName();
            // putAllMap()
            MapReply mapReply = MapReply.newBuilder().putMap("name", name).putMap("1", "1").build();
            responseObserver.onNext(mapReply);
            responseObserver.onCompleted();
        }
    }
}
