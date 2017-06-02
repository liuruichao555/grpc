package com.liuruichao.helloworld;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.helloworld.GreeterGrpc;
import io.grpc.examples.helloworld.HelloReply;
import io.grpc.examples.helloworld.HelloRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * HelloWorldClient
 *
 * @author liuruichao
 * Created on 2016/12/8 12:19
 */
public class HelloWorldClient {
    private final Logger logger = LoggerFactory.getLogger(HelloWorldClient.class);

    private final ManagedChannel channel;

    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    public HelloWorldClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build();
        blockingStub = GreeterGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void greet(String name) {
        logger.info("Will try to greet {} ...", name);
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response = blockingStub.sayHello(request);
        if (response == null) {
            throw new RuntimeException("RPC faild.");
        }
        logger.info("Greeting: {}", response.getMessage());
    }

    public static void main(String[] args) throws InterruptedException {
        HelloWorldClient client = new HelloWorldClient("127.0.0.1", 50051);
        client.greet("liuruichao");
        //ExecutorService exec = Executors.newFixedThreadPool(5);
        /*try {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                //exec.execute(() -> {
                    client.greet("liuruichao");
                //});
            }
            //exec.shutdown();
            long end = System.currentTimeMillis();
            System.out.println(end - start);
        } finally {
            client.shutdown();
        }*/

    }
}
