package com.warrior.demo.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: dues.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DuesServiceGrpc {

  private DuesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "com.warrior.demo.grpc.DuesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.warrior.demo.grpc.DuesRequest,
      com.warrior.demo.grpc.DuesResponse> getGetDuesDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDuesDetail",
      requestType = com.warrior.demo.grpc.DuesRequest.class,
      responseType = com.warrior.demo.grpc.DuesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.warrior.demo.grpc.DuesRequest,
      com.warrior.demo.grpc.DuesResponse> getGetDuesDetailMethod() {
    io.grpc.MethodDescriptor<com.warrior.demo.grpc.DuesRequest, com.warrior.demo.grpc.DuesResponse> getGetDuesDetailMethod;
    if ((getGetDuesDetailMethod = DuesServiceGrpc.getGetDuesDetailMethod) == null) {
      synchronized (DuesServiceGrpc.class) {
        if ((getGetDuesDetailMethod = DuesServiceGrpc.getGetDuesDetailMethod) == null) {
          DuesServiceGrpc.getGetDuesDetailMethod = getGetDuesDetailMethod =
              io.grpc.MethodDescriptor.<com.warrior.demo.grpc.DuesRequest, com.warrior.demo.grpc.DuesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDuesDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.warrior.demo.grpc.DuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.warrior.demo.grpc.DuesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DuesServiceMethodDescriptorSupplier("getDuesDetail"))
              .build();
        }
      }
    }
    return getGetDuesDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DuesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DuesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DuesServiceStub>() {
        @java.lang.Override
        public DuesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DuesServiceStub(channel, callOptions);
        }
      };
    return DuesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DuesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DuesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DuesServiceBlockingStub>() {
        @java.lang.Override
        public DuesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DuesServiceBlockingStub(channel, callOptions);
        }
      };
    return DuesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DuesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DuesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DuesServiceFutureStub>() {
        @java.lang.Override
        public DuesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DuesServiceFutureStub(channel, callOptions);
        }
      };
    return DuesServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getDuesDetail(com.warrior.demo.grpc.DuesRequest request,
        io.grpc.stub.StreamObserver<com.warrior.demo.grpc.DuesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDuesDetailMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DuesService.
   */
  public static abstract class DuesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DuesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DuesService.
   */
  public static final class DuesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DuesServiceStub> {
    private DuesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DuesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DuesServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDuesDetail(com.warrior.demo.grpc.DuesRequest request,
        io.grpc.stub.StreamObserver<com.warrior.demo.grpc.DuesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDuesDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DuesService.
   */
  public static final class DuesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DuesServiceBlockingStub> {
    private DuesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DuesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DuesServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.warrior.demo.grpc.DuesResponse getDuesDetail(com.warrior.demo.grpc.DuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDuesDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DuesService.
   */
  public static final class DuesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DuesServiceFutureStub> {
    private DuesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DuesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DuesServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.warrior.demo.grpc.DuesResponse> getDuesDetail(
        com.warrior.demo.grpc.DuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDuesDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DUES_DETAIL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DUES_DETAIL:
          serviceImpl.getDuesDetail((com.warrior.demo.grpc.DuesRequest) request,
              (io.grpc.stub.StreamObserver<com.warrior.demo.grpc.DuesResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetDuesDetailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.warrior.demo.grpc.DuesRequest,
              com.warrior.demo.grpc.DuesResponse>(
                service, METHODID_GET_DUES_DETAIL)))
        .build();
  }

  private static abstract class DuesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DuesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.warrior.demo.grpc.DuesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DuesService");
    }
  }

  private static final class DuesServiceFileDescriptorSupplier
      extends DuesServiceBaseDescriptorSupplier {
    DuesServiceFileDescriptorSupplier() {}
  }

  private static final class DuesServiceMethodDescriptorSupplier
      extends DuesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DuesServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DuesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DuesServiceFileDescriptorSupplier())
              .addMethod(getGetDuesDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
