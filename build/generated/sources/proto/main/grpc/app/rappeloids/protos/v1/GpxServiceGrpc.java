package app.rappeloids.protos.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service managing GPX tracks and routes.
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class GpxServiceGrpc {

  private GpxServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rappeloids.v1.GpxService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetGpxTrackRequest,
      app.rappeloids.protos.v1.GpxTrack> getGetGpxTrackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetGpxTrack",
      requestType = app.rappeloids.protos.v1.GetGpxTrackRequest.class,
      responseType = app.rappeloids.protos.v1.GpxTrack.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetGpxTrackRequest,
      app.rappeloids.protos.v1.GpxTrack> getGetGpxTrackMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetGpxTrackRequest, app.rappeloids.protos.v1.GpxTrack> getGetGpxTrackMethod;
    if ((getGetGpxTrackMethod = GpxServiceGrpc.getGetGpxTrackMethod) == null) {
      synchronized (GpxServiceGrpc.class) {
        if ((getGetGpxTrackMethod = GpxServiceGrpc.getGetGpxTrackMethod) == null) {
          GpxServiceGrpc.getGetGpxTrackMethod = getGetGpxTrackMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.GetGpxTrackRequest, app.rappeloids.protos.v1.GpxTrack>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetGpxTrack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.GetGpxTrackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.GpxTrack.getDefaultInstance()))
              .setSchemaDescriptor(new GpxServiceMethodDescriptorSupplier("GetGpxTrack"))
              .build();
        }
      }
    }
    return getGetGpxTrackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListRegionGpxTracksRequest,
      app.rappeloids.protos.v1.ListRegionGpxTracksResponse> getListRegionGpxTracksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRegionGpxTracks",
      requestType = app.rappeloids.protos.v1.ListRegionGpxTracksRequest.class,
      responseType = app.rappeloids.protos.v1.ListRegionGpxTracksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListRegionGpxTracksRequest,
      app.rappeloids.protos.v1.ListRegionGpxTracksResponse> getListRegionGpxTracksMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListRegionGpxTracksRequest, app.rappeloids.protos.v1.ListRegionGpxTracksResponse> getListRegionGpxTracksMethod;
    if ((getListRegionGpxTracksMethod = GpxServiceGrpc.getListRegionGpxTracksMethod) == null) {
      synchronized (GpxServiceGrpc.class) {
        if ((getListRegionGpxTracksMethod = GpxServiceGrpc.getListRegionGpxTracksMethod) == null) {
          GpxServiceGrpc.getListRegionGpxTracksMethod = getListRegionGpxTracksMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.ListRegionGpxTracksRequest, app.rappeloids.protos.v1.ListRegionGpxTracksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRegionGpxTracks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListRegionGpxTracksRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListRegionGpxTracksResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GpxServiceMethodDescriptorSupplier("ListRegionGpxTracks"))
              .build();
        }
      }
    }
    return getListRegionGpxTracksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GpxServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpxServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpxServiceStub>() {
        @java.lang.Override
        public GpxServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpxServiceStub(channel, callOptions);
        }
      };
    return GpxServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static GpxServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpxServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpxServiceBlockingV2Stub>() {
        @java.lang.Override
        public GpxServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpxServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return GpxServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GpxServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpxServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpxServiceBlockingStub>() {
        @java.lang.Override
        public GpxServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpxServiceBlockingStub(channel, callOptions);
        }
      };
    return GpxServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GpxServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GpxServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GpxServiceFutureStub>() {
        @java.lang.Override
        public GpxServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GpxServiceFutureStub(channel, callOptions);
        }
      };
    return GpxServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service managing GPX tracks and routes.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Gets a single GPX track by resource name or ID (AIP-131).
     * </pre>
     */
    default void getGpxTrack(app.rappeloids.protos.v1.GetGpxTrackRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.GpxTrack> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetGpxTrackMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists default GPX tracks for all canyons in a specified region.
     * </pre>
     */
    default void listRegionGpxTracks(app.rappeloids.protos.v1.ListRegionGpxTracksRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListRegionGpxTracksResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRegionGpxTracksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GpxService.
   * <pre>
   * Service managing GPX tracks and routes.
   * </pre>
   */
  public static abstract class GpxServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GpxServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GpxService.
   * <pre>
   * Service managing GPX tracks and routes.
   * </pre>
   */
  public static final class GpxServiceStub
      extends io.grpc.stub.AbstractAsyncStub<GpxServiceStub> {
    private GpxServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpxServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpxServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a single GPX track by resource name or ID (AIP-131).
     * </pre>
     */
    public void getGpxTrack(app.rappeloids.protos.v1.GetGpxTrackRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.GpxTrack> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetGpxTrackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists default GPX tracks for all canyons in a specified region.
     * </pre>
     */
    public void listRegionGpxTracks(app.rappeloids.protos.v1.ListRegionGpxTracksRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListRegionGpxTracksResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRegionGpxTracksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GpxService.
   * <pre>
   * Service managing GPX tracks and routes.
   * </pre>
   */
  public static final class GpxServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<GpxServiceBlockingV2Stub> {
    private GpxServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpxServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpxServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a single GPX track by resource name or ID (AIP-131).
     * </pre>
     */
    public app.rappeloids.protos.v1.GpxTrack getGpxTrack(app.rappeloids.protos.v1.GetGpxTrackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetGpxTrackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists default GPX tracks for all canyons in a specified region.
     * </pre>
     */
    public app.rappeloids.protos.v1.ListRegionGpxTracksResponse listRegionGpxTracks(app.rappeloids.protos.v1.ListRegionGpxTracksRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListRegionGpxTracksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service GpxService.
   * <pre>
   * Service managing GPX tracks and routes.
   * </pre>
   */
  public static final class GpxServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GpxServiceBlockingStub> {
    private GpxServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpxServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpxServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a single GPX track by resource name or ID (AIP-131).
     * </pre>
     */
    public app.rappeloids.protos.v1.GpxTrack getGpxTrack(app.rappeloids.protos.v1.GetGpxTrackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetGpxTrackMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists default GPX tracks for all canyons in a specified region.
     * </pre>
     */
    public app.rappeloids.protos.v1.ListRegionGpxTracksResponse listRegionGpxTracks(app.rappeloids.protos.v1.ListRegionGpxTracksRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRegionGpxTracksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GpxService.
   * <pre>
   * Service managing GPX tracks and routes.
   * </pre>
   */
  public static final class GpxServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<GpxServiceFutureStub> {
    private GpxServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GpxServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GpxServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a single GPX track by resource name or ID (AIP-131).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.GpxTrack> getGpxTrack(
        app.rappeloids.protos.v1.GetGpxTrackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetGpxTrackMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists default GPX tracks for all canyons in a specified region.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.ListRegionGpxTracksResponse> listRegionGpxTracks(
        app.rappeloids.protos.v1.ListRegionGpxTracksRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRegionGpxTracksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_GPX_TRACK = 0;
  private static final int METHODID_LIST_REGION_GPX_TRACKS = 1;

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
        case METHODID_GET_GPX_TRACK:
          serviceImpl.getGpxTrack((app.rappeloids.protos.v1.GetGpxTrackRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.GpxTrack>) responseObserver);
          break;
        case METHODID_LIST_REGION_GPX_TRACKS:
          serviceImpl.listRegionGpxTracks((app.rappeloids.protos.v1.ListRegionGpxTracksRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListRegionGpxTracksResponse>) responseObserver);
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
          getGetGpxTrackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.GetGpxTrackRequest,
              app.rappeloids.protos.v1.GpxTrack>(
                service, METHODID_GET_GPX_TRACK)))
        .addMethod(
          getListRegionGpxTracksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.ListRegionGpxTracksRequest,
              app.rappeloids.protos.v1.ListRegionGpxTracksResponse>(
                service, METHODID_LIST_REGION_GPX_TRACKS)))
        .build();
  }

  private static abstract class GpxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GpxServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.rappeloids.protos.v1.Gpx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GpxService");
    }
  }

  private static final class GpxServiceFileDescriptorSupplier
      extends GpxServiceBaseDescriptorSupplier {
    GpxServiceFileDescriptorSupplier() {}
  }

  private static final class GpxServiceMethodDescriptorSupplier
      extends GpxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GpxServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GpxServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GpxServiceFileDescriptorSupplier())
              .addMethod(getGetGpxTrackMethod())
              .addMethod(getListRegionGpxTracksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
