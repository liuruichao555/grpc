package io.grpc.examples.maptest1;

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
    comments = "Source: maptest1.proto")
public class MapTestService1Grpc {

  private MapTestService1Grpc() {}

  public static final String SERVICE_NAME = "com.lliuruichao.maptest1.MapTestService1";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.examples.maptest1.MapRequest,
      io.grpc.examples.maptest1.MapReply> METHOD_GET_ROLES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.lliuruichao.maptest1.MapTestService1", "getRoles"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.maptest1.MapRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.examples.maptest1.MapReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MapTestService1Stub newStub(io.grpc.Channel channel) {
    return new MapTestService1Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MapTestService1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MapTestService1BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static MapTestService1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MapTestService1FutureStub(channel);
  }

  /**
   */
  public static abstract class MapTestService1ImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRoles(io.grpc.examples.maptest1.MapRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.maptest1.MapReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ROLES, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ROLES,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.maptest1.MapRequest,
                io.grpc.examples.maptest1.MapReply>(
                  this, METHODID_GET_ROLES)))
          .build();
    }
  }

  /**
   */
  public static final class MapTestService1Stub extends io.grpc.stub.AbstractStub<MapTestService1Stub> {
    private MapTestService1Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private MapTestService1Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapTestService1Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MapTestService1Stub(channel, callOptions);
    }

    /**
     */
    public void getRoles(io.grpc.examples.maptest1.MapRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.maptest1.MapReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ROLES, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MapTestService1BlockingStub extends io.grpc.stub.AbstractStub<MapTestService1BlockingStub> {
    private MapTestService1BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MapTestService1BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapTestService1BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MapTestService1BlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.maptest1.MapReply getRoles(io.grpc.examples.maptest1.MapRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ROLES, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MapTestService1FutureStub extends io.grpc.stub.AbstractStub<MapTestService1FutureStub> {
    private MapTestService1FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MapTestService1FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapTestService1FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MapTestService1FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.maptest1.MapReply> getRoles(
        io.grpc.examples.maptest1.MapRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ROLES, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROLES = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MapTestService1ImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(MapTestService1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ROLES:
          serviceImpl.getRoles((io.grpc.examples.maptest1.MapRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.maptest1.MapReply>) responseObserver);
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

  private static final class MapTestService1DescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.maptest1.MapTestProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MapTestService1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MapTestService1DescriptorSupplier())
              .addMethod(METHOD_GET_ROLES)
              .build();
        }
      }
    }
    return result;
  }
}
