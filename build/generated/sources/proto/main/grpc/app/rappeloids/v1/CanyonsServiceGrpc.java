package app.rappeloids.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service managing canyons, technical routes, topos, and pitch information (AIP-121).
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class CanyonsServiceGrpc {

  private CanyonsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rappeloids.v1.CanyonsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.ListCanyonsRequest,
      app.rappeloids.v1.ListCanyonsResponse> getListCanyonsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCanyons",
      requestType = app.rappeloids.v1.ListCanyonsRequest.class,
      responseType = app.rappeloids.v1.ListCanyonsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.ListCanyonsRequest,
      app.rappeloids.v1.ListCanyonsResponse> getListCanyonsMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.ListCanyonsRequest, app.rappeloids.v1.ListCanyonsResponse> getListCanyonsMethod;
    if ((getListCanyonsMethod = CanyonsServiceGrpc.getListCanyonsMethod) == null) {
      synchronized (CanyonsServiceGrpc.class) {
        if ((getListCanyonsMethod = CanyonsServiceGrpc.getListCanyonsMethod) == null) {
          CanyonsServiceGrpc.getListCanyonsMethod = getListCanyonsMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.ListCanyonsRequest, app.rappeloids.v1.ListCanyonsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCanyons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.ListCanyonsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.ListCanyonsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CanyonsServiceMethodDescriptorSupplier("ListCanyons"))
              .build();
        }
      }
    }
    return getListCanyonsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.GetCanyonRequest,
      app.rappeloids.v1.Canyon> getGetCanyonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCanyon",
      requestType = app.rappeloids.v1.GetCanyonRequest.class,
      responseType = app.rappeloids.v1.Canyon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.GetCanyonRequest,
      app.rappeloids.v1.Canyon> getGetCanyonMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.GetCanyonRequest, app.rappeloids.v1.Canyon> getGetCanyonMethod;
    if ((getGetCanyonMethod = CanyonsServiceGrpc.getGetCanyonMethod) == null) {
      synchronized (CanyonsServiceGrpc.class) {
        if ((getGetCanyonMethod = CanyonsServiceGrpc.getGetCanyonMethod) == null) {
          CanyonsServiceGrpc.getGetCanyonMethod = getGetCanyonMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.GetCanyonRequest, app.rappeloids.v1.Canyon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCanyon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.GetCanyonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.Canyon.getDefaultInstance()))
              .setSchemaDescriptor(new CanyonsServiceMethodDescriptorSupplier("GetCanyon"))
              .build();
        }
      }
    }
    return getGetCanyonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.CreateCanyonRequest,
      app.rappeloids.v1.Canyon> getCreateCanyonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCanyon",
      requestType = app.rappeloids.v1.CreateCanyonRequest.class,
      responseType = app.rappeloids.v1.Canyon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.CreateCanyonRequest,
      app.rappeloids.v1.Canyon> getCreateCanyonMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.CreateCanyonRequest, app.rappeloids.v1.Canyon> getCreateCanyonMethod;
    if ((getCreateCanyonMethod = CanyonsServiceGrpc.getCreateCanyonMethod) == null) {
      synchronized (CanyonsServiceGrpc.class) {
        if ((getCreateCanyonMethod = CanyonsServiceGrpc.getCreateCanyonMethod) == null) {
          CanyonsServiceGrpc.getCreateCanyonMethod = getCreateCanyonMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.CreateCanyonRequest, app.rappeloids.v1.Canyon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCanyon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.CreateCanyonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.Canyon.getDefaultInstance()))
              .setSchemaDescriptor(new CanyonsServiceMethodDescriptorSupplier("CreateCanyon"))
              .build();
        }
      }
    }
    return getCreateCanyonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.UpdateCanyonRequest,
      app.rappeloids.v1.Canyon> getUpdateCanyonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCanyon",
      requestType = app.rappeloids.v1.UpdateCanyonRequest.class,
      responseType = app.rappeloids.v1.Canyon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.UpdateCanyonRequest,
      app.rappeloids.v1.Canyon> getUpdateCanyonMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.UpdateCanyonRequest, app.rappeloids.v1.Canyon> getUpdateCanyonMethod;
    if ((getUpdateCanyonMethod = CanyonsServiceGrpc.getUpdateCanyonMethod) == null) {
      synchronized (CanyonsServiceGrpc.class) {
        if ((getUpdateCanyonMethod = CanyonsServiceGrpc.getUpdateCanyonMethod) == null) {
          CanyonsServiceGrpc.getUpdateCanyonMethod = getUpdateCanyonMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.UpdateCanyonRequest, app.rappeloids.v1.Canyon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCanyon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.UpdateCanyonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.Canyon.getDefaultInstance()))
              .setSchemaDescriptor(new CanyonsServiceMethodDescriptorSupplier("UpdateCanyon"))
              .build();
        }
      }
    }
    return getUpdateCanyonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.DeleteCanyonRequest,
      com.google.protobuf.Empty> getDeleteCanyonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCanyon",
      requestType = app.rappeloids.v1.DeleteCanyonRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.DeleteCanyonRequest,
      com.google.protobuf.Empty> getDeleteCanyonMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.DeleteCanyonRequest, com.google.protobuf.Empty> getDeleteCanyonMethod;
    if ((getDeleteCanyonMethod = CanyonsServiceGrpc.getDeleteCanyonMethod) == null) {
      synchronized (CanyonsServiceGrpc.class) {
        if ((getDeleteCanyonMethod = CanyonsServiceGrpc.getDeleteCanyonMethod) == null) {
          CanyonsServiceGrpc.getDeleteCanyonMethod = getDeleteCanyonMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.DeleteCanyonRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCanyon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.DeleteCanyonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CanyonsServiceMethodDescriptorSupplier("DeleteCanyon"))
              .build();
        }
      }
    }
    return getDeleteCanyonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.BatchGetCanyonsRequest,
      app.rappeloids.v1.BatchGetCanyonsResponse> getBatchGetCanyonsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchGetCanyons",
      requestType = app.rappeloids.v1.BatchGetCanyonsRequest.class,
      responseType = app.rappeloids.v1.BatchGetCanyonsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.BatchGetCanyonsRequest,
      app.rappeloids.v1.BatchGetCanyonsResponse> getBatchGetCanyonsMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.BatchGetCanyonsRequest, app.rappeloids.v1.BatchGetCanyonsResponse> getBatchGetCanyonsMethod;
    if ((getBatchGetCanyonsMethod = CanyonsServiceGrpc.getBatchGetCanyonsMethod) == null) {
      synchronized (CanyonsServiceGrpc.class) {
        if ((getBatchGetCanyonsMethod = CanyonsServiceGrpc.getBatchGetCanyonsMethod) == null) {
          CanyonsServiceGrpc.getBatchGetCanyonsMethod = getBatchGetCanyonsMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.BatchGetCanyonsRequest, app.rappeloids.v1.BatchGetCanyonsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchGetCanyons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.BatchGetCanyonsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.BatchGetCanyonsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CanyonsServiceMethodDescriptorSupplier("BatchGetCanyons"))
              .build();
        }
      }
    }
    return getBatchGetCanyonsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CanyonsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CanyonsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CanyonsServiceStub>() {
        @java.lang.Override
        public CanyonsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CanyonsServiceStub(channel, callOptions);
        }
      };
    return CanyonsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CanyonsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CanyonsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CanyonsServiceBlockingV2Stub>() {
        @java.lang.Override
        public CanyonsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CanyonsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CanyonsServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CanyonsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CanyonsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CanyonsServiceBlockingStub>() {
        @java.lang.Override
        public CanyonsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CanyonsServiceBlockingStub(channel, callOptions);
        }
      };
    return CanyonsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CanyonsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CanyonsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CanyonsServiceFutureStub>() {
        @java.lang.Override
        public CanyonsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CanyonsServiceFutureStub(channel, callOptions);
        }
      };
    return CanyonsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service managing canyons, technical routes, topos, and pitch information (AIP-121).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists canyons with pagination and optional region filter (AIP-132).
     * </pre>
     */
    default void listCanyons(app.rappeloids.v1.ListCanyonsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.ListCanyonsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCanyonsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a single canyon by resource name (AIP-131).
     * </pre>
     */
    default void getCanyon(app.rappeloids.v1.GetCanyonRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Canyon> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCanyonMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new canyon route (AIP-133). Requires authentication.
     * </pre>
     */
    default void createCanyon(app.rappeloids.v1.CreateCanyonRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Canyon> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCanyonMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing canyon route (AIP-134). Requires author or admin.
     * </pre>
     */
    default void updateCanyon(app.rappeloids.v1.UpdateCanyonRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Canyon> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCanyonMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a canyon route (AIP-135). Requires author or admin.
     * </pre>
     */
    default void deleteCanyon(app.rappeloids.v1.DeleteCanyonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCanyonMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch gets multiple canyons by resource name (AIP-231).
     * </pre>
     */
    default void batchGetCanyons(app.rappeloids.v1.BatchGetCanyonsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.BatchGetCanyonsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchGetCanyonsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CanyonsService.
   * <pre>
   * Service managing canyons, technical routes, topos, and pitch information (AIP-121).
   * </pre>
   */
  public static abstract class CanyonsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CanyonsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CanyonsService.
   * <pre>
   * Service managing canyons, technical routes, topos, and pitch information (AIP-121).
   * </pre>
   */
  public static final class CanyonsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CanyonsServiceStub> {
    private CanyonsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CanyonsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CanyonsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists canyons with pagination and optional region filter (AIP-132).
     * </pre>
     */
    public void listCanyons(app.rappeloids.v1.ListCanyonsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.ListCanyonsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListCanyonsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single canyon by resource name (AIP-131).
     * </pre>
     */
    public void getCanyon(app.rappeloids.v1.GetCanyonRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Canyon> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCanyonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new canyon route (AIP-133). Requires authentication.
     * </pre>
     */
    public void createCanyon(app.rappeloids.v1.CreateCanyonRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Canyon> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCanyonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing canyon route (AIP-134). Requires author or admin.
     * </pre>
     */
    public void updateCanyon(app.rappeloids.v1.UpdateCanyonRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Canyon> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCanyonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a canyon route (AIP-135). Requires author or admin.
     * </pre>
     */
    public void deleteCanyon(app.rappeloids.v1.DeleteCanyonRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCanyonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch gets multiple canyons by resource name (AIP-231).
     * </pre>
     */
    public void batchGetCanyons(app.rappeloids.v1.BatchGetCanyonsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.BatchGetCanyonsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchGetCanyonsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CanyonsService.
   * <pre>
   * Service managing canyons, technical routes, topos, and pitch information (AIP-121).
   * </pre>
   */
  public static final class CanyonsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CanyonsServiceBlockingV2Stub> {
    private CanyonsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CanyonsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CanyonsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists canyons with pagination and optional region filter (AIP-132).
     * </pre>
     */
    public app.rappeloids.v1.ListCanyonsResponse listCanyons(app.rappeloids.v1.ListCanyonsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListCanyonsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single canyon by resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.v1.Canyon getCanyon(app.rappeloids.v1.GetCanyonRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetCanyonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new canyon route (AIP-133). Requires authentication.
     * </pre>
     */
    public app.rappeloids.v1.Canyon createCanyon(app.rappeloids.v1.CreateCanyonRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateCanyonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing canyon route (AIP-134). Requires author or admin.
     * </pre>
     */
    public app.rappeloids.v1.Canyon updateCanyon(app.rappeloids.v1.UpdateCanyonRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateCanyonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a canyon route (AIP-135). Requires author or admin.
     * </pre>
     */
    public com.google.protobuf.Empty deleteCanyon(app.rappeloids.v1.DeleteCanyonRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteCanyonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch gets multiple canyons by resource name (AIP-231).
     * </pre>
     */
    public app.rappeloids.v1.BatchGetCanyonsResponse batchGetCanyons(app.rappeloids.v1.BatchGetCanyonsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getBatchGetCanyonsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CanyonsService.
   * <pre>
   * Service managing canyons, technical routes, topos, and pitch information (AIP-121).
   * </pre>
   */
  public static final class CanyonsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CanyonsServiceBlockingStub> {
    private CanyonsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CanyonsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CanyonsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists canyons with pagination and optional region filter (AIP-132).
     * </pre>
     */
    public app.rappeloids.v1.ListCanyonsResponse listCanyons(app.rappeloids.v1.ListCanyonsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListCanyonsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single canyon by resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.v1.Canyon getCanyon(app.rappeloids.v1.GetCanyonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCanyonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new canyon route (AIP-133). Requires authentication.
     * </pre>
     */
    public app.rappeloids.v1.Canyon createCanyon(app.rappeloids.v1.CreateCanyonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCanyonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing canyon route (AIP-134). Requires author or admin.
     * </pre>
     */
    public app.rappeloids.v1.Canyon updateCanyon(app.rappeloids.v1.UpdateCanyonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCanyonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a canyon route (AIP-135). Requires author or admin.
     * </pre>
     */
    public com.google.protobuf.Empty deleteCanyon(app.rappeloids.v1.DeleteCanyonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCanyonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch gets multiple canyons by resource name (AIP-231).
     * </pre>
     */
    public app.rappeloids.v1.BatchGetCanyonsResponse batchGetCanyons(app.rappeloids.v1.BatchGetCanyonsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchGetCanyonsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CanyonsService.
   * <pre>
   * Service managing canyons, technical routes, topos, and pitch information (AIP-121).
   * </pre>
   */
  public static final class CanyonsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CanyonsServiceFutureStub> {
    private CanyonsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CanyonsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CanyonsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists canyons with pagination and optional region filter (AIP-132).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.ListCanyonsResponse> listCanyons(
        app.rappeloids.v1.ListCanyonsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListCanyonsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single canyon by resource name (AIP-131).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.Canyon> getCanyon(
        app.rappeloids.v1.GetCanyonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCanyonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new canyon route (AIP-133). Requires authentication.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.Canyon> createCanyon(
        app.rappeloids.v1.CreateCanyonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCanyonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing canyon route (AIP-134). Requires author or admin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.Canyon> updateCanyon(
        app.rappeloids.v1.UpdateCanyonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCanyonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a canyon route (AIP-135). Requires author or admin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCanyon(
        app.rappeloids.v1.DeleteCanyonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCanyonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch gets multiple canyons by resource name (AIP-231).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.BatchGetCanyonsResponse> batchGetCanyons(
        app.rappeloids.v1.BatchGetCanyonsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchGetCanyonsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CANYONS = 0;
  private static final int METHODID_GET_CANYON = 1;
  private static final int METHODID_CREATE_CANYON = 2;
  private static final int METHODID_UPDATE_CANYON = 3;
  private static final int METHODID_DELETE_CANYON = 4;
  private static final int METHODID_BATCH_GET_CANYONS = 5;

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
        case METHODID_LIST_CANYONS:
          serviceImpl.listCanyons((app.rappeloids.v1.ListCanyonsRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.ListCanyonsResponse>) responseObserver);
          break;
        case METHODID_GET_CANYON:
          serviceImpl.getCanyon((app.rappeloids.v1.GetCanyonRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.Canyon>) responseObserver);
          break;
        case METHODID_CREATE_CANYON:
          serviceImpl.createCanyon((app.rappeloids.v1.CreateCanyonRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.Canyon>) responseObserver);
          break;
        case METHODID_UPDATE_CANYON:
          serviceImpl.updateCanyon((app.rappeloids.v1.UpdateCanyonRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.Canyon>) responseObserver);
          break;
        case METHODID_DELETE_CANYON:
          serviceImpl.deleteCanyon((app.rappeloids.v1.DeleteCanyonRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_GET_CANYONS:
          serviceImpl.batchGetCanyons((app.rappeloids.v1.BatchGetCanyonsRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.BatchGetCanyonsResponse>) responseObserver);
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
          getListCanyonsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.ListCanyonsRequest,
              app.rappeloids.v1.ListCanyonsResponse>(
                service, METHODID_LIST_CANYONS)))
        .addMethod(
          getGetCanyonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.GetCanyonRequest,
              app.rappeloids.v1.Canyon>(
                service, METHODID_GET_CANYON)))
        .addMethod(
          getCreateCanyonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.CreateCanyonRequest,
              app.rappeloids.v1.Canyon>(
                service, METHODID_CREATE_CANYON)))
        .addMethod(
          getUpdateCanyonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.UpdateCanyonRequest,
              app.rappeloids.v1.Canyon>(
                service, METHODID_UPDATE_CANYON)))
        .addMethod(
          getDeleteCanyonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.DeleteCanyonRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_CANYON)))
        .addMethod(
          getBatchGetCanyonsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.BatchGetCanyonsRequest,
              app.rappeloids.v1.BatchGetCanyonsResponse>(
                service, METHODID_BATCH_GET_CANYONS)))
        .build();
  }

  private static abstract class CanyonsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CanyonsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.rappeloids.v1.Canyons.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CanyonsService");
    }
  }

  private static final class CanyonsServiceFileDescriptorSupplier
      extends CanyonsServiceBaseDescriptorSupplier {
    CanyonsServiceFileDescriptorSupplier() {}
  }

  private static final class CanyonsServiceMethodDescriptorSupplier
      extends CanyonsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CanyonsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CanyonsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CanyonsServiceFileDescriptorSupplier())
              .addMethod(getListCanyonsMethod())
              .addMethod(getGetCanyonMethod())
              .addMethod(getCreateCanyonMethod())
              .addMethod(getUpdateCanyonMethod())
              .addMethod(getDeleteCanyonMethod())
              .addMethod(getBatchGetCanyonsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
