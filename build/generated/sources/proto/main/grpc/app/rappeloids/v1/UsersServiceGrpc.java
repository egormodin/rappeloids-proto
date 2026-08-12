package app.rappeloids.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service managing user accounts, authentication profiles, and preferences (AIP-121).
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersServiceGrpc {

  private UsersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rappeloids.v1.UsersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.GetUserRequest,
      app.rappeloids.v1.User> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = app.rappeloids.v1.GetUserRequest.class,
      responseType = app.rappeloids.v1.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.GetUserRequest,
      app.rappeloids.v1.User> getGetUserMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.GetUserRequest, app.rappeloids.v1.User> getGetUserMethod;
    if ((getGetUserMethod = UsersServiceGrpc.getGetUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetUserMethod = UsersServiceGrpc.getGetUserMethod) == null) {
          UsersServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.GetUserRequest, app.rappeloids.v1.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.rappeloids.v1.User> getGetMyProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMyProfile",
      requestType = com.google.protobuf.Empty.class,
      responseType = app.rappeloids.v1.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      app.rappeloids.v1.User> getGetMyProfileMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, app.rappeloids.v1.User> getGetMyProfileMethod;
    if ((getGetMyProfileMethod = UsersServiceGrpc.getGetMyProfileMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getGetMyProfileMethod = UsersServiceGrpc.getGetMyProfileMethod) == null) {
          UsersServiceGrpc.getGetMyProfileMethod = getGetMyProfileMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, app.rappeloids.v1.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMyProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("GetMyProfile"))
              .build();
        }
      }
    }
    return getGetMyProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.UpdateUserRequest,
      app.rappeloids.v1.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = app.rappeloids.v1.UpdateUserRequest.class,
      responseType = app.rappeloids.v1.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.UpdateUserRequest,
      app.rappeloids.v1.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.UpdateUserRequest, app.rappeloids.v1.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = UsersServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserMethod = UsersServiceGrpc.getUpdateUserMethod) == null) {
          UsersServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.UpdateUserRequest, app.rappeloids.v1.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.v1.ListUsersRequest,
      app.rappeloids.v1.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = app.rappeloids.v1.ListUsersRequest.class,
      responseType = app.rappeloids.v1.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.v1.ListUsersRequest,
      app.rappeloids.v1.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.v1.ListUsersRequest, app.rappeloids.v1.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = UsersServiceGrpc.getListUsersMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getListUsersMethod = UsersServiceGrpc.getListUsersMethod) == null) {
          UsersServiceGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.v1.ListUsersRequest, app.rappeloids.v1.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.v1.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub>() {
        @java.lang.Override
        public UsersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceStub(channel, callOptions);
        }
      };
    return UsersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UsersServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingV2Stub>() {
        @java.lang.Override
        public UsersServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return UsersServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub>() {
        @java.lang.Override
        public UsersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceBlockingStub(channel, callOptions);
        }
      };
    return UsersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub>() {
        @java.lang.Override
        public UsersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceFutureStub(channel, callOptions);
        }
      };
    return UsersServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service managing user accounts, authentication profiles, and preferences (AIP-121).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Gets a user profile by resource name (AIP-131).
     * </pre>
     */
    default void getUser(app.rappeloids.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets the profile of the currently authenticated caller.
     * </pre>
     */
    default void getMyProfile(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMyProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a user profile (AIP-134). Requires self or admin.
     * </pre>
     */
    default void updateUser(app.rappeloids.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists users with pagination (AIP-132).
     * </pre>
     */
    default void listUsers(app.rappeloids.v1.ListUsersRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UsersService.
   * <pre>
   * Service managing user accounts, authentication profiles, and preferences (AIP-121).
   * </pre>
   */
  public static abstract class UsersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UsersService.
   * <pre>
   * Service managing user accounts, authentication profiles, and preferences (AIP-121).
   * </pre>
   */
  public static final class UsersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UsersServiceStub> {
    private UsersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a user profile by resource name (AIP-131).
     * </pre>
     */
    public void getUser(app.rappeloids.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets the profile of the currently authenticated caller.
     * </pre>
     */
    public void getMyProfile(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMyProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a user profile (AIP-134). Requires self or admin.
     * </pre>
     */
    public void updateUser(app.rappeloids.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists users with pagination (AIP-132).
     * </pre>
     */
    public void listUsers(app.rappeloids.v1.ListUsersRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.v1.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UsersService.
   * <pre>
   * Service managing user accounts, authentication profiles, and preferences (AIP-121).
   * </pre>
   */
  public static final class UsersServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UsersServiceBlockingV2Stub> {
    private UsersServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a user profile by resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.v1.User getUser(app.rappeloids.v1.GetUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the profile of the currently authenticated caller.
     * </pre>
     */
    public app.rappeloids.v1.User getMyProfile(com.google.protobuf.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetMyProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a user profile (AIP-134). Requires self or admin.
     * </pre>
     */
    public app.rappeloids.v1.User updateUser(app.rappeloids.v1.UpdateUserRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists users with pagination (AIP-132).
     * </pre>
     */
    public app.rappeloids.v1.ListUsersResponse listUsers(app.rappeloids.v1.ListUsersRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service UsersService.
   * <pre>
   * Service managing user accounts, authentication profiles, and preferences (AIP-121).
   * </pre>
   */
  public static final class UsersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UsersServiceBlockingStub> {
    private UsersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a user profile by resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.v1.User getUser(app.rappeloids.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets the profile of the currently authenticated caller.
     * </pre>
     */
    public app.rappeloids.v1.User getMyProfile(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMyProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a user profile (AIP-134). Requires self or admin.
     * </pre>
     */
    public app.rappeloids.v1.User updateUser(app.rappeloids.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists users with pagination (AIP-132).
     * </pre>
     */
    public app.rappeloids.v1.ListUsersResponse listUsers(app.rappeloids.v1.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UsersService.
   * <pre>
   * Service managing user accounts, authentication profiles, and preferences (AIP-121).
   * </pre>
   */
  public static final class UsersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UsersServiceFutureStub> {
    private UsersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Gets a user profile by resource name (AIP-131).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.User> getUser(
        app.rappeloids.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets the profile of the currently authenticated caller.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.User> getMyProfile(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMyProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a user profile (AIP-134). Requires self or admin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.User> updateUser(
        app.rappeloids.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists users with pagination (AIP-132).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.v1.ListUsersResponse> listUsers(
        app.rappeloids.v1.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_GET_MY_PROFILE = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_LIST_USERS = 3;

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
        case METHODID_GET_USER:
          serviceImpl.getUser((app.rappeloids.v1.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.User>) responseObserver);
          break;
        case METHODID_GET_MY_PROFILE:
          serviceImpl.getMyProfile((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((app.rappeloids.v1.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.User>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((app.rappeloids.v1.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.v1.ListUsersResponse>) responseObserver);
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
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.GetUserRequest,
              app.rappeloids.v1.User>(
                service, METHODID_GET_USER)))
        .addMethod(
          getGetMyProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              app.rappeloids.v1.User>(
                service, METHODID_GET_MY_PROFILE)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.UpdateUserRequest,
              app.rappeloids.v1.User>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.v1.ListUsersRequest,
              app.rappeloids.v1.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .build();
  }

  private static abstract class UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.rappeloids.v1.Users.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsersService");
    }
  }

  private static final class UsersServiceFileDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier {
    UsersServiceFileDescriptorSupplier() {}
  }

  private static final class UsersServiceMethodDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UsersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UsersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getGetMyProfileMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getListUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
