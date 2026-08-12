package app.rappeloids.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service managing geographic regions and canyon groupings (AIP-121).
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class RegionsServiceGrpc {

  private RegionsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rappeloids.v1.RegionsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.ListRegionsRequest,
      app.rappeloids.v1.ListRegionsResponse> getListRegionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRegions",
      requestType = app.rappeloids.v1.ListRegionsRequest.class,
      responseType = app.rappeloids.v1.ListRegionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.ListRegionsRequest,
      app.rappeloids.v1.ListRegionsResponse> getListRegionsMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.ListRegionsRequest, app.rappeloids.v1.ListRegionsResponse> getListRegionsMethod;
    if ((getListRegionsMethod = RegionsServiceGrpc.getListRegionsMethod) == null) {
      synchronized (RegionsServiceGrpc.class) {
        if ((getListRegionsMethod = RegionsServiceGrpc.getListRegionsMethod) == null) {
          RegionsServiceGrpc.getListRegionsMethod = getListRegionsMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.ListRegionsRequest, app.rappeloids.v1.ListRegionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRegions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.ListRegionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.ListRegionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RegionsServiceMethodDescriptorSupplier("ListRegions"))
              .build();
        }
      }
    }
    return getListRegionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.GetRegionRequest,
      app.rappeloids.v1.Region> getGetRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRegion",
      requestType = app.rappeloids.v1.GetRegionRequest.class,
      responseType = app.rappeloids.v1.Region.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.GetRegionRequest,
      app.rappeloids.v1.Region> getGetRegionMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.GetRegionRequest, app.rappeloids.v1.Region> getGetRegionMethod;
    if ((getGetRegionMethod = RegionsServiceGrpc.getGetRegionMethod) == null) {
      synchronized (RegionsServiceGrpc.class) {
        if ((getGetRegionMethod = RegionsServiceGrpc.getGetRegionMethod) == null) {
          RegionsServiceGrpc.getGetRegionMethod = getGetRegionMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.GetRegionRequest, app.rappeloids.v1.Region>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.GetRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.Region.getDefaultInstance()))
              .setSchemaDescriptor(new RegionsServiceMethodDescriptorSupplier("GetRegion"))
              .build();
        }
      }
    }
    return getGetRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.CreateRegionRequest,
      app.rappeloids.v1.Region> getCreateRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRegion",
      requestType = app.rappeloids.v1.CreateRegionRequest.class,
      responseType = app.rappeloids.v1.Region.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.CreateRegionRequest,
      app.rappeloids.v1.Region> getCreateRegionMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.CreateRegionRequest, app.rappeloids.v1.Region> getCreateRegionMethod;
    if ((getCreateRegionMethod = RegionsServiceGrpc.getCreateRegionMethod) == null) {
      synchronized (RegionsServiceGrpc.class) {
        if ((getCreateRegionMethod = RegionsServiceGrpc.getCreateRegionMethod) == null) {
          RegionsServiceGrpc.getCreateRegionMethod = getCreateRegionMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.CreateRegionRequest, app.rappeloids.v1.Region>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.CreateRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.Region.getDefaultInstance()))
              .setSchemaDescriptor(new RegionsServiceMethodDescriptorSupplier("CreateRegion"))
              .build();
        }
      }
    }
    return getCreateRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.UpdateRegionRequest,
      app.rappeloids.v1.Region> getUpdateRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRegion",
      requestType = app.rappeloids.v1.UpdateRegionRequest.class,
      responseType = app.rappeloids.v1.Region.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.UpdateRegionRequest,
      app.rappeloids.v1.Region> getUpdateRegionMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.UpdateRegionRequest, app.rappeloids.v1.Region> getUpdateRegionMethod;
    if ((getUpdateRegionMethod = RegionsServiceGrpc.getUpdateRegionMethod) == null) {
      synchronized (RegionsServiceGrpc.class) {
        if ((getUpdateRegionMethod = RegionsServiceGrpc.getUpdateRegionMethod) == null) {
          RegionsServiceGrpc.getUpdateRegionMethod = getUpdateRegionMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.UpdateRegionRequest, app.rappeloids.v1.Region>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.UpdateRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.Region.getDefaultInstance()))
              .setSchemaDescriptor(new RegionsServiceMethodDescriptorSupplier("UpdateRegion"))
              .build();
        }
      }
    }
    return getUpdateRegionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.DeleteRegionRequest,
      com.google.protobuf.Empty> getDeleteRegionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRegion",
      requestType = app.rappeloids.v1.DeleteRegionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.DeleteRegionRequest,
      com.google.protobuf.Empty> getDeleteRegionMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.DeleteRegionRequest, com.google.protobuf.Empty> getDeleteRegionMethod;
    if ((getDeleteRegionMethod = RegionsServiceGrpc.getDeleteRegionMethod) == null) {
      synchronized (RegionsServiceGrpc.class) {
        if ((getDeleteRegionMethod = RegionsServiceGrpc.getDeleteRegionMethod) == null) {
          RegionsServiceGrpc.getDeleteRegionMethod = getDeleteRegionMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.DeleteRegionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRegion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.DeleteRegionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RegionsServiceMethodDescriptorSupplier("DeleteRegion"))
              .build();
        }
      }
    }
    return getDeleteRegionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegionsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegionsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegionsServiceStub>() {
        @java.lang.Override
        public RegionsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegionsServiceStub(channel, callOptions);
        }
      };
    return RegionsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RegionsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegionsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegionsServiceBlockingV2Stub>() {
        @java.lang.Override
        public RegionsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegionsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return RegionsServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegionsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegionsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegionsServiceBlockingStub>() {
        @java.lang.Override
        public RegionsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegionsServiceBlockingStub(channel, callOptions);
        }
      };
    return RegionsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegionsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegionsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegionsServiceFutureStub>() {
        @java.lang.Override
        public RegionsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegionsServiceFutureStub(channel, callOptions);
        }
      };
    return RegionsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service managing geographic regions and canyon groupings (AIP-121).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists regions with pagination (AIP-132).
     * </pre>
     */
    default void listRegions(app.rappeloids.v1.ListRegionsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.ListRegionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRegionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a region by its resource name (AIP-131).
     * </pre>
     */
    default void getRegion(app.rappeloids.v1.GetRegionRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Region> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new region (AIP-133). Requires Administrator permissions.
     * </pre>
     */
    default void createRegion(app.rappeloids.v1.CreateRegionRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Region> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing region (AIP-134). Requires Administrator permissions.
     * </pre>
     */
    default void updateRegion(app.rappeloids.v1.UpdateRegionRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Region> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRegionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a region (AIP-135). Requires Administrator permissions.
     * </pre>
     */
    default void deleteRegion(app.rappeloids.v1.DeleteRegionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRegionMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RegionsService.
   * <pre>
   * Service managing geographic regions and canyon groupings (AIP-121).
   * </pre>
   */
  public static abstract class RegionsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RegionsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RegionsService.
   * <pre>
   * Service managing geographic regions and canyon groupings (AIP-121).
   * </pre>
   */
  public static final class RegionsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RegionsServiceStub> {
    private RegionsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegionsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists regions with pagination (AIP-132).
     * </pre>
     */
    public void listRegions(app.rappeloids.v1.ListRegionsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.ListRegionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRegionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a region by its resource name (AIP-131).
     * </pre>
     */
    public void getRegion(app.rappeloids.v1.GetRegionRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Region> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new region (AIP-133). Requires Administrator permissions.
     * </pre>
     */
    public void createRegion(app.rappeloids.v1.CreateRegionRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Region> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing region (AIP-134). Requires Administrator permissions.
     * </pre>
     */
    public void updateRegion(app.rappeloids.v1.UpdateRegionRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.Region> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRegionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a region (AIP-135). Requires Administrator permissions.
     * </pre>
     */
    public void deleteRegion(app.rappeloids.v1.DeleteRegionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRegionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RegionsService.
   * <pre>
   * Service managing geographic regions and canyon groupings (AIP-121).
   * </pre>
   */
  public static final class RegionsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RegionsServiceBlockingV2Stub> {
    private RegionsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegionsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists regions with pagination (AIP-132).
     * </pre>
     */
    public app.rappeloids.v1.ListRegionsResponse listRegions(app.rappeloids.v1.ListRegionsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListRegionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a region by its resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.v1.Region getRegion(app.rappeloids.v1.GetRegionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new region (AIP-133). Requires Administrator permissions.
     * </pre>
     */
    public app.rappeloids.v1.Region createRegion(app.rappeloids.v1.CreateRegionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing region (AIP-134). Requires Administrator permissions.
     * </pre>
     */
    public app.rappeloids.v1.Region updateRegion(app.rappeloids.v1.UpdateRegionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a region (AIP-135). Requires Administrator permissions.
     * </pre>
     */
    public com.google.protobuf.Empty deleteRegion(app.rappeloids.v1.DeleteRegionRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteRegionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service RegionsService.
   * <pre>
   * Service managing geographic regions and canyon groupings (AIP-121).
   * </pre>
   */
  public static final class RegionsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RegionsServiceBlockingStub> {
    private RegionsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegionsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists regions with pagination (AIP-132).
     * </pre>
     */
    public app.rappeloids.v1.ListRegionsResponse listRegions(app.rappeloids.v1.ListRegionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRegionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a region by its resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.v1.Region getRegion(app.rappeloids.v1.GetRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new region (AIP-133). Requires Administrator permissions.
     * </pre>
     */
    public app.rappeloids.v1.Region createRegion(app.rappeloids.v1.CreateRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing region (AIP-134). Requires Administrator permissions.
     * </pre>
     */
    public app.rappeloids.v1.Region updateRegion(app.rappeloids.v1.UpdateRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRegionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a region (AIP-135). Requires Administrator permissions.
     * </pre>
     */
    public com.google.protobuf.Empty deleteRegion(app.rappeloids.v1.DeleteRegionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRegionMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RegionsService.
   * <pre>
   * Service managing geographic regions and canyon groupings (AIP-121).
   * </pre>
   */
  public static final class RegionsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RegionsServiceFutureStub> {
    private RegionsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegionsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegionsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists regions with pagination (AIP-132).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.ListRegionsResponse> listRegions(
        app.rappeloids.v1.ListRegionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRegionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a region by its resource name (AIP-131).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.Region> getRegion(
        app.rappeloids.v1.GetRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new region (AIP-133). Requires Administrator permissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.Region> createRegion(
        app.rappeloids.v1.CreateRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRegionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing region (AIP-134). Requires Administrator permissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.Region> updateRegion(
        app.rappeloids.v1.UpdateRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRegionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a region (AIP-135). Requires Administrator permissions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteRegion(
        app.rappeloids.v1.DeleteRegionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRegionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_REGIONS = 0;
  private static final int METHODID_GET_REGION = 1;
  private static final int METHODID_CREATE_REGION = 2;
  private static final int METHODID_UPDATE_REGION = 3;
  private static final int METHODID_DELETE_REGION = 4;

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
        case METHODID_LIST_REGIONS:
          serviceImpl.listRegions((app.rappeloids.v1.ListRegionsRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.ListRegionsResponse>) responseObserver);
          break;
        case METHODID_GET_REGION:
          serviceImpl.getRegion((app.rappeloids.v1.GetRegionRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.Region>) responseObserver);
          break;
        case METHODID_CREATE_REGION:
          serviceImpl.createRegion((app.rappeloids.v1.CreateRegionRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.Region>) responseObserver);
          break;
        case METHODID_UPDATE_REGION:
          serviceImpl.updateRegion((app.rappeloids.v1.UpdateRegionRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.Region>) responseObserver);
          break;
        case METHODID_DELETE_REGION:
          serviceImpl.deleteRegion((app.rappeloids.v1.DeleteRegionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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
          getListRegionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.ListRegionsRequest,
              app.rappeloids.v1.ListRegionsResponse>(
                service, METHODID_LIST_REGIONS)))
        .addMethod(
          getGetRegionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.GetRegionRequest,
              app.rappeloids.v1.Region>(
                service, METHODID_GET_REGION)))
        .addMethod(
          getCreateRegionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.CreateRegionRequest,
              app.rappeloids.v1.Region>(
                service, METHODID_CREATE_REGION)))
        .addMethod(
          getUpdateRegionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.UpdateRegionRequest,
              app.rappeloids.v1.Region>(
                service, METHODID_UPDATE_REGION)))
        .addMethod(
          getDeleteRegionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.DeleteRegionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_REGION)))
        .build();
  }

  private static abstract class RegionsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegionsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.rappeloids.v1.Regions.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegionsService");
    }
  }

  private static final class RegionsServiceFileDescriptorSupplier
      extends RegionsServiceBaseDescriptorSupplier {
    RegionsServiceFileDescriptorSupplier() {}
  }

  private static final class RegionsServiceMethodDescriptorSupplier
      extends RegionsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RegionsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RegionsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegionsServiceFileDescriptorSupplier())
              .addMethod(getListRegionsMethod())
              .addMethod(getGetRegionMethod())
              .addMethod(getCreateRegionMethod())
              .addMethod(getUpdateRegionMethod())
              .addMethod(getDeleteRegionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
