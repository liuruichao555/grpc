package io.grpc.examples.helloworld2;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.1.3-SNAPSHOT)",
    comments = "Source: helloworld2.proto")
public class UserRoleServiceGrpc {

  private UserRoleServiceGrpc() {}

  public static final String SERVICE_NAME = "helloworld.UserRoleService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld2.User,
      io.grpc.examples.helloworld2.Role> METHOD_GET_USER_ROLES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "helloworld.UserRoleService", "getUserRoles"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld2.User.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.helloworld2.Role.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserRoleServiceStub newStub(io.grpc.Channel channel) {
    return new UserRoleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserRoleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserRoleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static UserRoleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserRoleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserRoleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserRoles(io.grpc.examples.helloworld2.User request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld2.Role> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_ROLES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_USER_ROLES,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld2.User,
                io.grpc.examples.helloworld2.Role>(
                  this, METHODID_GET_USER_ROLES)))
          .build();
    }
  }

  /**
   */
  public static final class UserRoleServiceStub extends io.grpc.stub.AbstractStub<UserRoleServiceStub> {
    private UserRoleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserRoleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRoleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserRoleServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserRoles(io.grpc.examples.helloworld2.User request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld2.Role> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_ROLES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserRoleServiceBlockingStub extends io.grpc.stub.AbstractStub<UserRoleServiceBlockingStub> {
    private UserRoleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserRoleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRoleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserRoleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.helloworld2.Role getUserRoles(io.grpc.examples.helloworld2.User request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_ROLES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserRoleServiceFutureStub extends io.grpc.stub.AbstractStub<UserRoleServiceFutureStub> {
    private UserRoleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserRoleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserRoleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserRoleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld2.Role> getUserRoles(
        io.grpc.examples.helloworld2.User request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_ROLES, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_ROLES = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserRoleServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(UserRoleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_ROLES:
          serviceImpl.getUserRoles((io.grpc.examples.helloworld2.User) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld2.Role>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class UserRoleServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.helloworld2.HelloWorldProto2.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserRoleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserRoleServiceDescriptorSupplier())
              .addMethod(METHOD_GET_USER_ROLES)
              .build();
        }
      }
    }
    return result;
  }
}
