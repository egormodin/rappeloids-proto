package app.rappeloids.protos.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service managing canyoneering expeditions, itineraries, and participant tracking (AIP-121).
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class TripsServiceGrpc {

  private TripsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rappeloids.v1.TripsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListTripsRequest,
      app.rappeloids.protos.v1.ListTripsResponse> getListTripsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTrips",
      requestType = app.rappeloids.protos.v1.ListTripsRequest.class,
      responseType = app.rappeloids.protos.v1.ListTripsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListTripsRequest,
      app.rappeloids.protos.v1.ListTripsResponse> getListTripsMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListTripsRequest, app.rappeloids.protos.v1.ListTripsResponse> getListTripsMethod;
    if ((getListTripsMethod = TripsServiceGrpc.getListTripsMethod) == null) {
      synchronized (TripsServiceGrpc.class) {
        if ((getListTripsMethod = TripsServiceGrpc.getListTripsMethod) == null) {
          TripsServiceGrpc.getListTripsMethod = getListTripsMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.ListTripsRequest, app.rappeloids.protos.v1.ListTripsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTrips"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListTripsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListTripsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TripsServiceMethodDescriptorSupplier("ListTrips"))
              .build();
        }
      }
    }
    return getListTripsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetTripRequest,
      app.rappeloids.protos.v1.Trip> getGetTripMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTrip",
      requestType = app.rappeloids.protos.v1.GetTripRequest.class,
      responseType = app.rappeloids.protos.v1.Trip.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetTripRequest,
      app.rappeloids.protos.v1.Trip> getGetTripMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetTripRequest, app.rappeloids.protos.v1.Trip> getGetTripMethod;
    if ((getGetTripMethod = TripsServiceGrpc.getGetTripMethod) == null) {
      synchronized (TripsServiceGrpc.class) {
        if ((getGetTripMethod = TripsServiceGrpc.getGetTripMethod) == null) {
          TripsServiceGrpc.getGetTripMethod = getGetTripMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.GetTripRequest, app.rappeloids.protos.v1.Trip>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTrip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.GetTripRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.Trip.getDefaultInstance()))
              .setSchemaDescriptor(new TripsServiceMethodDescriptorSupplier("GetTrip"))
              .build();
        }
      }
    }
    return getGetTripMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.CreateTripRequest,
      app.rappeloids.protos.v1.Trip> getCreateTripMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTrip",
      requestType = app.rappeloids.protos.v1.CreateTripRequest.class,
      responseType = app.rappeloids.protos.v1.Trip.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.CreateTripRequest,
      app.rappeloids.protos.v1.Trip> getCreateTripMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.CreateTripRequest, app.rappeloids.protos.v1.Trip> getCreateTripMethod;
    if ((getCreateTripMethod = TripsServiceGrpc.getCreateTripMethod) == null) {
      synchronized (TripsServiceGrpc.class) {
        if ((getCreateTripMethod = TripsServiceGrpc.getCreateTripMethod) == null) {
          TripsServiceGrpc.getCreateTripMethod = getCreateTripMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.CreateTripRequest, app.rappeloids.protos.v1.Trip>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTrip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.CreateTripRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.Trip.getDefaultInstance()))
              .setSchemaDescriptor(new TripsServiceMethodDescriptorSupplier("CreateTrip"))
              .build();
        }
      }
    }
    return getCreateTripMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.UpdateTripRequest,
      app.rappeloids.protos.v1.Trip> getUpdateTripMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTrip",
      requestType = app.rappeloids.protos.v1.UpdateTripRequest.class,
      responseType = app.rappeloids.protos.v1.Trip.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.UpdateTripRequest,
      app.rappeloids.protos.v1.Trip> getUpdateTripMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.UpdateTripRequest, app.rappeloids.protos.v1.Trip> getUpdateTripMethod;
    if ((getUpdateTripMethod = TripsServiceGrpc.getUpdateTripMethod) == null) {
      synchronized (TripsServiceGrpc.class) {
        if ((getUpdateTripMethod = TripsServiceGrpc.getUpdateTripMethod) == null) {
          TripsServiceGrpc.getUpdateTripMethod = getUpdateTripMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.UpdateTripRequest, app.rappeloids.protos.v1.Trip>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTrip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.UpdateTripRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.Trip.getDefaultInstance()))
              .setSchemaDescriptor(new TripsServiceMethodDescriptorSupplier("UpdateTrip"))
              .build();
        }
      }
    }
    return getUpdateTripMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.DeleteTripRequest,
      com.google.protobuf.Empty> getDeleteTripMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTrip",
      requestType = app.rappeloids.protos.v1.DeleteTripRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.DeleteTripRequest,
      com.google.protobuf.Empty> getDeleteTripMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.DeleteTripRequest, com.google.protobuf.Empty> getDeleteTripMethod;
    if ((getDeleteTripMethod = TripsServiceGrpc.getDeleteTripMethod) == null) {
      synchronized (TripsServiceGrpc.class) {
        if ((getDeleteTripMethod = TripsServiceGrpc.getDeleteTripMethod) == null) {
          TripsServiceGrpc.getDeleteTripMethod = getDeleteTripMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.DeleteTripRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTrip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.DeleteTripRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TripsServiceMethodDescriptorSupplier("DeleteTrip"))
              .build();
        }
      }
    }
    return getDeleteTripMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TripsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripsServiceStub>() {
        @java.lang.Override
        public TripsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripsServiceStub(channel, callOptions);
        }
      };
    return TripsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static TripsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripsServiceBlockingV2Stub>() {
        @java.lang.Override
        public TripsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return TripsServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TripsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripsServiceBlockingStub>() {
        @java.lang.Override
        public TripsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripsServiceBlockingStub(channel, callOptions);
        }
      };
    return TripsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TripsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripsServiceFutureStub>() {
        @java.lang.Override
        public TripsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripsServiceFutureStub(channel, callOptions);
        }
      };
    return TripsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service managing canyoneering expeditions, itineraries, and participant tracking (AIP-121).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists trips with pagination (AIP-132).
     * </pre>
     */
    default void listTrips(app.rappeloids.protos.v1.ListTripsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListTripsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTripsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a single trip by resource name (AIP-131).
     * </pre>
     */
    default void getTrip(app.rappeloids.protos.v1.GetTripRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Trip> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTripMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new trip (AIP-133). Creator becomes organizer.
     * </pre>
     */
    default void createTrip(app.rappeloids.protos.v1.CreateTripRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Trip> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTripMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing trip (AIP-134). Requires organizer or admin.
     * </pre>
     */
    default void updateTrip(app.rappeloids.protos.v1.UpdateTripRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Trip> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTripMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a trip (AIP-135). Requires organizer or admin.
     * </pre>
     */
    default void deleteTrip(app.rappeloids.protos.v1.DeleteTripRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTripMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TripsService.
   * <pre>
   * Service managing canyoneering expeditions, itineraries, and participant tracking (AIP-121).
   * </pre>
   */
  public static abstract class TripsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TripsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TripsService.
   * <pre>
   * Service managing canyoneering expeditions, itineraries, and participant tracking (AIP-121).
   * </pre>
   */
  public static final class TripsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TripsServiceStub> {
    private TripsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists trips with pagination (AIP-132).
     * </pre>
     */
    public void listTrips(app.rappeloids.protos.v1.ListTripsRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListTripsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTripsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single trip by resource name (AIP-131).
     * </pre>
     */
    public void getTrip(app.rappeloids.protos.v1.GetTripRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Trip> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTripMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new trip (AIP-133). Creator becomes organizer.
     * </pre>
     */
    public void createTrip(app.rappeloids.protos.v1.CreateTripRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Trip> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTripMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing trip (AIP-134). Requires organizer or admin.
     * </pre>
     */
    public void updateTrip(app.rappeloids.protos.v1.UpdateTripRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Trip> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTripMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a trip (AIP-135). Requires organizer or admin.
     * </pre>
     */
    public void deleteTrip(app.rappeloids.protos.v1.DeleteTripRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTripMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TripsService.
   * <pre>
   * Service managing canyoneering expeditions, itineraries, and participant tracking (AIP-121).
   * </pre>
   */
  public static final class TripsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<TripsServiceBlockingV2Stub> {
    private TripsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists trips with pagination (AIP-132).
     * </pre>
     */
    public app.rappeloids.protos.v1.ListTripsResponse listTrips(app.rappeloids.protos.v1.ListTripsRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListTripsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single trip by resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.protos.v1.Trip getTrip(app.rappeloids.protos.v1.GetTripRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetTripMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new trip (AIP-133). Creator becomes organizer.
     * </pre>
     */
    public app.rappeloids.protos.v1.Trip createTrip(app.rappeloids.protos.v1.CreateTripRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateTripMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing trip (AIP-134). Requires organizer or admin.
     * </pre>
     */
    public app.rappeloids.protos.v1.Trip updateTrip(app.rappeloids.protos.v1.UpdateTripRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateTripMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a trip (AIP-135). Requires organizer or admin.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTrip(app.rappeloids.protos.v1.DeleteTripRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteTripMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service TripsService.
   * <pre>
   * Service managing canyoneering expeditions, itineraries, and participant tracking (AIP-121).
   * </pre>
   */
  public static final class TripsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TripsServiceBlockingStub> {
    private TripsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists trips with pagination (AIP-132).
     * </pre>
     */
    public app.rappeloids.protos.v1.ListTripsResponse listTrips(app.rappeloids.protos.v1.ListTripsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTripsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single trip by resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.protos.v1.Trip getTrip(app.rappeloids.protos.v1.GetTripRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTripMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new trip (AIP-133). Creator becomes organizer.
     * </pre>
     */
    public app.rappeloids.protos.v1.Trip createTrip(app.rappeloids.protos.v1.CreateTripRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTripMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing trip (AIP-134). Requires organizer or admin.
     * </pre>
     */
    public app.rappeloids.protos.v1.Trip updateTrip(app.rappeloids.protos.v1.UpdateTripRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTripMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a trip (AIP-135). Requires organizer or admin.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTrip(app.rappeloids.protos.v1.DeleteTripRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTripMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TripsService.
   * <pre>
   * Service managing canyoneering expeditions, itineraries, and participant tracking (AIP-121).
   * </pre>
   */
  public static final class TripsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TripsServiceFutureStub> {
    private TripsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists trips with pagination (AIP-132).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.ListTripsResponse> listTrips(
        app.rappeloids.protos.v1.ListTripsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTripsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single trip by resource name (AIP-131).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.Trip> getTrip(
        app.rappeloids.protos.v1.GetTripRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTripMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new trip (AIP-133). Creator becomes organizer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.Trip> createTrip(
        app.rappeloids.protos.v1.CreateTripRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTripMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing trip (AIP-134). Requires organizer or admin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.Trip> updateTrip(
        app.rappeloids.protos.v1.UpdateTripRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTripMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a trip (AIP-135). Requires organizer or admin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTrip(
        app.rappeloids.protos.v1.DeleteTripRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTripMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_TRIPS = 0;
  private static final int METHODID_GET_TRIP = 1;
  private static final int METHODID_CREATE_TRIP = 2;
  private static final int METHODID_UPDATE_TRIP = 3;
  private static final int METHODID_DELETE_TRIP = 4;

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
        case METHODID_LIST_TRIPS:
          serviceImpl.listTrips((app.rappeloids.protos.v1.ListTripsRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListTripsResponse>) responseObserver);
          break;
        case METHODID_GET_TRIP:
          serviceImpl.getTrip((app.rappeloids.protos.v1.GetTripRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Trip>) responseObserver);
          break;
        case METHODID_CREATE_TRIP:
          serviceImpl.createTrip((app.rappeloids.protos.v1.CreateTripRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Trip>) responseObserver);
          break;
        case METHODID_UPDATE_TRIP:
          serviceImpl.updateTrip((app.rappeloids.protos.v1.UpdateTripRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Trip>) responseObserver);
          break;
        case METHODID_DELETE_TRIP:
          serviceImpl.deleteTrip((app.rappeloids.protos.v1.DeleteTripRequest) request,
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
          getListTripsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.ListTripsRequest,
              app.rappeloids.protos.v1.ListTripsResponse>(
                service, METHODID_LIST_TRIPS)))
        .addMethod(
          getGetTripMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.GetTripRequest,
              app.rappeloids.protos.v1.Trip>(
                service, METHODID_GET_TRIP)))
        .addMethod(
          getCreateTripMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.CreateTripRequest,
              app.rappeloids.protos.v1.Trip>(
                service, METHODID_CREATE_TRIP)))
        .addMethod(
          getUpdateTripMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.UpdateTripRequest,
              app.rappeloids.protos.v1.Trip>(
                service, METHODID_UPDATE_TRIP)))
        .addMethod(
          getDeleteTripMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.DeleteTripRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TRIP)))
        .build();
  }

  private static abstract class TripsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TripsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.rappeloids.protos.v1.Trips.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TripsService");
    }
  }

  private static final class TripsServiceFileDescriptorSupplier
      extends TripsServiceBaseDescriptorSupplier {
    TripsServiceFileDescriptorSupplier() {}
  }

  private static final class TripsServiceMethodDescriptorSupplier
      extends TripsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TripsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TripsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TripsServiceFileDescriptorSupplier())
              .addMethod(getListTripsMethod())
              .addMethod(getGetTripMethod())
              .addMethod(getCreateTripMethod())
              .addMethod(getUpdateTripMethod())
              .addMethod(getDeleteTripMethod())
              .build();
        }
      }
    }
    return result;
  }
}
