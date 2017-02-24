package com.liuruichao.helloworld2;

import com.google.protobuf.ProtocolStringList;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.helloworld2.Role;
import io.grpc.examples.helloworld2.User;
import io.grpc.examples.helloworld2.UserRoleServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.AbstractCollection;
import java.util.function.Consumer;

/**
 * HelloWorldClient2
 *
 * @author liuruichao
 * Created on 2017/2/23 16:00
 */
public class HelloWorldClient2 {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldClient2.class);

    public static void main(String[] args) {
        int port = 50051;
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext(true).build();
        UserRoleServiceGrpc.UserRoleServiceBlockingStub blockingStub = UserRoleServiceGrpc.newBlockingStub(channel);

        User user = User.newBuilder().setUsername("liuruichao").setAge(20).build();
        try {
            Role role = blockingStub.getUserRoles(user);
            ProtocolStringList list = role.getRolenameList();
            list.forEach(System.out::println);
        } finally {
            channel.shutdown();
        }
    }
}
