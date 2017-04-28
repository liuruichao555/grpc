package com.liuruichao.maptest.demo1;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.maptest1.MapReply;
import io.grpc.examples.maptest1.MapRequest;
import io.grpc.examples.maptest1.MapTestService1Grpc;

import java.util.Map;

/**
 * MapTestClient
 *
 * @author liuruichao
 * Created on 2017/4/28 15:26
 */
public class MapTestClient {
    public static void main(String[] args) {
        int port = 50051;
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext(true).build();
        MapTestService1Grpc.MapTestService1BlockingStub blockingStub = MapTestService1Grpc.newBlockingStub(channel);

        try {
            MapRequest mapRequest = MapRequest.newBuilder().setName("liuruichao").build();
            MapReply mapReply = blockingStub.getRoles(mapRequest);
            Map<String, String> map = mapReply.getMapMap();
            map.forEach((s, s2) -> System.out.printf("key: %s, value: %s.\n", s, s2));
        } finally {
            channel.shutdown();
        }
    }
}
