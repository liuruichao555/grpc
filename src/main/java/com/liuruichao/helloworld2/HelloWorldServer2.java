package com.liuruichao.helloworld2;

import com.liuruichao.helloworld.HelloWorldServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.examples.helloworld2.Role;
import io.grpc.examples.helloworld2.User;
import io.grpc.examples.helloworld2.UserRoleServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * HelloWorldServer2
 *
 * @author liuruichao
 * Created on 2017/2/23 15:53
 */
public class HelloWorldServer2 {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServer2.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new UserRoleServiceImpl())
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

    private static class UserRoleServiceImpl extends UserRoleServiceGrpc.UserRoleServiceImplBase {
        @Override
        public void getUserRoles(User request, StreamObserver<Role> responseObserver) {
            logger.info("username: {}, age: {}.", request.getUsername(), request.getAge());
            Role role = Role.newBuilder().addRolename("超级管理员").addRolename("客户经理").build();
            responseObserver.onNext(role);
            responseObserver.onCompleted();
        }
    }
}
