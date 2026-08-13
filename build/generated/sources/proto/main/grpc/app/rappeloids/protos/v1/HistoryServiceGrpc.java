package app.rappeloids.protos.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service managing historical canyon descent logs and expedition history (AIP-121).
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class HistoryServiceGrpc {

  private HistoryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rappeloids.v1.HistoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListHistoryRequest,
      app.rappeloids.protos.v1.ListHistoryResponse> getListHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHistory",
      requestType = app.rappeloids.protos.v1.ListHistoryRequest.class,
      responseType = app.rappeloids.protos.v1.ListHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListHistoryRequest,
      app.rappeloids.protos.v1.ListHistoryResponse> getListHistoryMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListHistoryRequest, app.rappeloids.protos.v1.ListHistoryResponse> getListHistoryMethod;
    if ((getListHistoryMethod = HistoryServiceGrpc.getListHistoryMethod) == null) {
      synchronized (HistoryServiceGrpc.class) {
        if ((getListHistoryMethod = HistoryServiceGrpc.getListHistoryMethod) == null) {
          HistoryServiceGrpc.getListHistoryMethod = getListHistoryMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.ListHistoryRequest, app.rappeloids.protos.v1.ListHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryServiceMethodDescriptorSupplier("ListHistory"))
              .build();
        }
      }
    }
    return getListHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListHistoryYearsRequest,
      app.rappeloids.protos.v1.ListHistoryYearsResponse> getListHistoryYearsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListHistoryYears",
      requestType = app.rappeloids.protos.v1.ListHistoryYearsRequest.class,
      responseType = app.rappeloids.protos.v1.ListHistoryYearsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListHistoryYearsRequest,
      app.rappeloids.protos.v1.ListHistoryYearsResponse> getListHistoryYearsMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListHistoryYearsRequest, app.rappeloids.protos.v1.ListHistoryYearsResponse> getListHistoryYearsMethod;
    if ((getListHistoryYearsMethod = HistoryServiceGrpc.getListHistoryYearsMethod) == null) {
      synchronized (HistoryServiceGrpc.class) {
        if ((getListHistoryYearsMethod = HistoryServiceGrpc.getListHistoryYearsMethod) == null) {
          HistoryServiceGrpc.getListHistoryYearsMethod = getListHistoryYearsMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.ListHistoryYearsRequest, app.rappeloids.protos.v1.ListHistoryYearsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListHistoryYears"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListHistoryYearsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListHistoryYearsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryServiceMethodDescriptorSupplier("ListHistoryYears"))
              .build();
        }
      }
    }
    return getListHistoryYearsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.BatchUpdateHistoryRequest,
      app.rappeloids.protos.v1.BatchUpdateHistoryResponse> getBatchUpdateHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchUpdateHistory",
      requestType = app.rappeloids.protos.v1.BatchUpdateHistoryRequest.class,
      responseType = app.rappeloids.protos.v1.BatchUpdateHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.BatchUpdateHistoryRequest,
      app.rappeloids.protos.v1.BatchUpdateHistoryResponse> getBatchUpdateHistoryMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.BatchUpdateHistoryRequest, app.rappeloids.protos.v1.BatchUpdateHistoryResponse> getBatchUpdateHistoryMethod;
    if ((getBatchUpdateHistoryMethod = HistoryServiceGrpc.getBatchUpdateHistoryMethod) == null) {
      synchronized (HistoryServiceGrpc.class) {
        if ((getBatchUpdateHistoryMethod = HistoryServiceGrpc.getBatchUpdateHistoryMethod) == null) {
          HistoryServiceGrpc.getBatchUpdateHistoryMethod = getBatchUpdateHistoryMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.BatchUpdateHistoryRequest, app.rappeloids.protos.v1.BatchUpdateHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchUpdateHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.BatchUpdateHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.BatchUpdateHistoryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HistoryServiceMethodDescriptorSupplier("BatchUpdateHistory"))
              .build();
        }
      }
    }
    return getBatchUpdateHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HistoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceStub>() {
        @java.lang.Override
        public HistoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceStub(channel, callOptions);
        }
      };
    return HistoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static HistoryServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceBlockingV2Stub>() {
        @java.lang.Override
        public HistoryServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return HistoryServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HistoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceBlockingStub>() {
        @java.lang.Override
        public HistoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceBlockingStub(channel, callOptions);
        }
      };
    return HistoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HistoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HistoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HistoryServiceFutureStub>() {
        @java.lang.Override
        public HistoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HistoryServiceFutureStub(channel, callOptions);
        }
      };
    return HistoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service managing historical canyon descent logs and expedition history (AIP-121).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists historical canyon descent records with user participation, optionally filtered by year (AIP-132).
     * </pre>
     */
    default void listHistory(app.rappeloids.protos.v1.ListHistoryRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists available years that have historical descent records for UI navigation (AIP-136).
     * </pre>
     */
    default void listHistoryYears(app.rappeloids.protos.v1.ListHistoryYearsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListHistoryYearsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListHistoryYearsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Atomically applies batch updates/inserts/deletions to history descents, trips, and participant statuses.
     * </pre>
     */
    default void batchUpdateHistory(app.rappeloids.protos.v1.BatchUpdateHistoryRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.BatchUpdateHistoryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchUpdateHistoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HistoryService.
   * <pre>
   * Service managing historical canyon descent logs and expedition history (AIP-121).
   * </pre>
   */
  public static abstract class HistoryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HistoryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HistoryService.
   * <pre>
   * Service managing historical canyon descent logs and expedition history (AIP-121).
   * </pre>
   */
  public static final class HistoryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HistoryServiceStub> {
    private HistoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists historical canyon descent records with user participation, optionally filtered by year (AIP-132).
     * </pre>
     */
    public void listHistory(app.rappeloids.protos.v1.ListHistoryRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists available years that have historical descent records for UI navigation (AIP-136).
     * </pre>
     */
    public void listHistoryYears(app.rappeloids.protos.v1.ListHistoryYearsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListHistoryYearsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListHistoryYearsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Atomically applies batch updates/inserts/deletions to history descents, trips, and participant statuses.
     * </pre>
     */
    public void batchUpdateHistory(app.rappeloids.protos.v1.BatchUpdateHistoryRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.BatchUpdateHistoryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchUpdateHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HistoryService.
   * <pre>
   * Service managing historical canyon descent logs and expedition history (AIP-121).
   * </pre>
   */
  public static final class HistoryServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<HistoryServiceBlockingV2Stub> {
    private HistoryServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists historical canyon descent records with user participation, optionally filtered by year (AIP-132).
     * </pre>
     */
    public app.rappeloids.protos.v1.ListHistoryResponse listHistory(app.rappeloids.protos.v1.ListHistoryRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists available years that have historical descent records for UI navigation (AIP-136).
     * </pre>
     */
    public app.rappeloids.protos.v1.ListHistoryYearsResponse listHistoryYears(app.rappeloids.protos.v1.ListHistoryYearsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListHistoryYearsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Atomically applies batch updates/inserts/deletions to history descents, trips, and participant statuses.
     * </pre>
     */
    public app.rappeloids.protos.v1.BatchUpdateHistoryResponse batchUpdateHistory(app.rappeloids.protos.v1.BatchUpdateHistoryRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchUpdateHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service HistoryService.
   * <pre>
   * Service managing historical canyon descent logs and expedition history (AIP-121).
   * </pre>
   */
  public static final class HistoryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HistoryServiceBlockingStub> {
    private HistoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists historical canyon descent records with user participation, optionally filtered by year (AIP-132).
     * </pre>
     */
    public app.rappeloids.protos.v1.ListHistoryResponse listHistory(app.rappeloids.protos.v1.ListHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists available years that have historical descent records for UI navigation (AIP-136).
     * </pre>
     */
    public app.rappeloids.protos.v1.ListHistoryYearsResponse listHistoryYears(app.rappeloids.protos.v1.ListHistoryYearsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListHistoryYearsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Atomically applies batch updates/inserts/deletions to history descents, trips, and participant statuses.
     * </pre>
     */
    public app.rappeloids.protos.v1.BatchUpdateHistoryResponse batchUpdateHistory(app.rappeloids.protos.v1.BatchUpdateHistoryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchUpdateHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HistoryService.
   * <pre>
   * Service managing historical canyon descent logs and expedition history (AIP-121).
   * </pre>
   */
  public static final class HistoryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HistoryServiceFutureStub> {
    private HistoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HistoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HistoryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists historical canyon descent records with user participation, optionally filtered by year (AIP-132).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.ListHistoryResponse> listHistory(
        app.rappeloids.protos.v1.ListHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists available years that have historical descent records for UI navigation (AIP-136).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.ListHistoryYearsResponse> listHistoryYears(
        app.rappeloids.protos.v1.ListHistoryYearsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListHistoryYearsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Atomically applies batch updates/inserts/deletions to history descents, trips, and participant statuses.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.BatchUpdateHistoryResponse> batchUpdateHistory(
        app.rappeloids.protos.v1.BatchUpdateHistoryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchUpdateHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_HISTORY = 0;
  private static final int METHODID_LIST_HISTORY_YEARS = 1;
  private static final int METHODID_BATCH_UPDATE_HISTORY = 2;

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
        case METHODID_LIST_HISTORY:
          serviceImpl.listHistory((app.rappeloids.protos.v1.ListHistoryRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListHistoryResponse>) responseObserver);
          break;
        case METHODID_LIST_HISTORY_YEARS:
          serviceImpl.listHistoryYears((app.rappeloids.protos.v1.ListHistoryYearsRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListHistoryYearsResponse>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_HISTORY:
          serviceImpl.batchUpdateHistory((app.rappeloids.protos.v1.BatchUpdateHistoryRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.BatchUpdateHistoryResponse>) responseObserver);
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
          getListHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.ListHistoryRequest,
              app.rappeloids.protos.v1.ListHistoryResponse>(
                service, METHODID_LIST_HISTORY)))
        .addMethod(
          getListHistoryYearsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.ListHistoryYearsRequest,
              app.rappeloids.protos.v1.ListHistoryYearsResponse>(
                service, METHODID_LIST_HISTORY_YEARS)))
        .addMethod(
          getBatchUpdateHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.BatchUpdateHistoryRequest,
              app.rappeloids.protos.v1.BatchUpdateHistoryResponse>(
                service, METHODID_BATCH_UPDATE_HISTORY)))
        .build();
  }

  private static abstract class HistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HistoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.rappeloids.protos.v1.History.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HistoryService");
    }
  }

  private static final class HistoryServiceFileDescriptorSupplier
      extends HistoryServiceBaseDescriptorSupplier {
    HistoryServiceFileDescriptorSupplier() {}
  }

  private static final class HistoryServiceMethodDescriptorSupplier
      extends HistoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HistoryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HistoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HistoryServiceFileDescriptorSupplier())
              .addMethod(getListHistoryMethod())
              .addMethod(getListHistoryYearsMethod())
              .addMethod(getBatchUpdateHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
