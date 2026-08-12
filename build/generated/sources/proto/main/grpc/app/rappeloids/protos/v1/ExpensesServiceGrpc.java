package app.rappeloids.protos.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service managing shared group expenses and debt settlements for trips (AIP-121).
 * </pre>
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ExpensesServiceGrpc {

  private ExpensesServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "rappeloids.v1.ExpensesService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListExpensesRequest,
      app.rappeloids.protos.v1.ListExpensesResponse> getListExpensesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListExpenses",
      requestType = app.rappeloids.protos.v1.ListExpensesRequest.class,
      responseType = app.rappeloids.protos.v1.ListExpensesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListExpensesRequest,
      app.rappeloids.protos.v1.ListExpensesResponse> getListExpensesMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.ListExpensesRequest, app.rappeloids.protos.v1.ListExpensesResponse> getListExpensesMethod;
    if ((getListExpensesMethod = ExpensesServiceGrpc.getListExpensesMethod) == null) {
      synchronized (ExpensesServiceGrpc.class) {
        if ((getListExpensesMethod = ExpensesServiceGrpc.getListExpensesMethod) == null) {
          ExpensesServiceGrpc.getListExpensesMethod = getListExpensesMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.ListExpensesRequest, app.rappeloids.protos.v1.ListExpensesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListExpenses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListExpensesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.ListExpensesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExpensesServiceMethodDescriptorSupplier("ListExpenses"))
              .build();
        }
      }
    }
    return getListExpensesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetExpenseRequest,
      app.rappeloids.protos.v1.Expense> getGetExpenseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExpense",
      requestType = app.rappeloids.protos.v1.GetExpenseRequest.class,
      responseType = app.rappeloids.protos.v1.Expense.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetExpenseRequest,
      app.rappeloids.protos.v1.Expense> getGetExpenseMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetExpenseRequest, app.rappeloids.protos.v1.Expense> getGetExpenseMethod;
    if ((getGetExpenseMethod = ExpensesServiceGrpc.getGetExpenseMethod) == null) {
      synchronized (ExpensesServiceGrpc.class) {
        if ((getGetExpenseMethod = ExpensesServiceGrpc.getGetExpenseMethod) == null) {
          ExpensesServiceGrpc.getGetExpenseMethod = getGetExpenseMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.GetExpenseRequest, app.rappeloids.protos.v1.Expense>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetExpense"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.GetExpenseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.Expense.getDefaultInstance()))
              .setSchemaDescriptor(new ExpensesServiceMethodDescriptorSupplier("GetExpense"))
              .build();
        }
      }
    }
    return getGetExpenseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.CreateExpenseRequest,
      app.rappeloids.protos.v1.Expense> getCreateExpenseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateExpense",
      requestType = app.rappeloids.protos.v1.CreateExpenseRequest.class,
      responseType = app.rappeloids.protos.v1.Expense.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.CreateExpenseRequest,
      app.rappeloids.protos.v1.Expense> getCreateExpenseMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.CreateExpenseRequest, app.rappeloids.protos.v1.Expense> getCreateExpenseMethod;
    if ((getCreateExpenseMethod = ExpensesServiceGrpc.getCreateExpenseMethod) == null) {
      synchronized (ExpensesServiceGrpc.class) {
        if ((getCreateExpenseMethod = ExpensesServiceGrpc.getCreateExpenseMethod) == null) {
          ExpensesServiceGrpc.getCreateExpenseMethod = getCreateExpenseMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.CreateExpenseRequest, app.rappeloids.protos.v1.Expense>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateExpense"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.CreateExpenseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.Expense.getDefaultInstance()))
              .setSchemaDescriptor(new ExpensesServiceMethodDescriptorSupplier("CreateExpense"))
              .build();
        }
      }
    }
    return getCreateExpenseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.UpdateExpenseRequest,
      app.rappeloids.protos.v1.Expense> getUpdateExpenseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateExpense",
      requestType = app.rappeloids.protos.v1.UpdateExpenseRequest.class,
      responseType = app.rappeloids.protos.v1.Expense.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.UpdateExpenseRequest,
      app.rappeloids.protos.v1.Expense> getUpdateExpenseMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.UpdateExpenseRequest, app.rappeloids.protos.v1.Expense> getUpdateExpenseMethod;
    if ((getUpdateExpenseMethod = ExpensesServiceGrpc.getUpdateExpenseMethod) == null) {
      synchronized (ExpensesServiceGrpc.class) {
        if ((getUpdateExpenseMethod = ExpensesServiceGrpc.getUpdateExpenseMethod) == null) {
          ExpensesServiceGrpc.getUpdateExpenseMethod = getUpdateExpenseMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.UpdateExpenseRequest, app.rappeloids.protos.v1.Expense>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateExpense"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.UpdateExpenseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.Expense.getDefaultInstance()))
              .setSchemaDescriptor(new ExpensesServiceMethodDescriptorSupplier("UpdateExpense"))
              .build();
        }
      }
    }
    return getUpdateExpenseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.DeleteExpenseRequest,
      com.google.protobuf.Empty> getDeleteExpenseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteExpense",
      requestType = app.rappeloids.protos.v1.DeleteExpenseRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.DeleteExpenseRequest,
      com.google.protobuf.Empty> getDeleteExpenseMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.DeleteExpenseRequest, com.google.protobuf.Empty> getDeleteExpenseMethod;
    if ((getDeleteExpenseMethod = ExpensesServiceGrpc.getDeleteExpenseMethod) == null) {
      synchronized (ExpensesServiceGrpc.class) {
        if ((getDeleteExpenseMethod = ExpensesServiceGrpc.getDeleteExpenseMethod) == null) {
          ExpensesServiceGrpc.getDeleteExpenseMethod = getDeleteExpenseMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.DeleteExpenseRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteExpense"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.DeleteExpenseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ExpensesServiceMethodDescriptorSupplier("DeleteExpense"))
              .build();
        }
      }
    }
    return getDeleteExpenseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetTripExpenseSummaryRequest,
      app.rappeloids.protos.v1.TripExpenseSummary> getGetTripExpenseSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTripExpenseSummary",
      requestType = app.rappeloids.protos.v1.GetTripExpenseSummaryRequest.class,
      responseType = app.rappeloids.protos.v1.TripExpenseSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetTripExpenseSummaryRequest,
      app.rappeloids.protos.v1.TripExpenseSummary> getGetTripExpenseSummaryMethod() {
    io.grpc.MethodDescriptor<app.rappeloids.protos.v1.GetTripExpenseSummaryRequest, app.rappeloids.protos.v1.TripExpenseSummary> getGetTripExpenseSummaryMethod;
    if ((getGetTripExpenseSummaryMethod = ExpensesServiceGrpc.getGetTripExpenseSummaryMethod) == null) {
      synchronized (ExpensesServiceGrpc.class) {
        if ((getGetTripExpenseSummaryMethod = ExpensesServiceGrpc.getGetTripExpenseSummaryMethod) == null) {
          ExpensesServiceGrpc.getGetTripExpenseSummaryMethod = getGetTripExpenseSummaryMethod =
              io.grpc.MethodDescriptor.<app.rappeloids.protos.v1.GetTripExpenseSummaryRequest, app.rappeloids.protos.v1.TripExpenseSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTripExpenseSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.GetTripExpenseSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  app.rappeloids.protos.v1.TripExpenseSummary.getDefaultInstance()))
              .setSchemaDescriptor(new ExpensesServiceMethodDescriptorSupplier("GetTripExpenseSummary"))
              .build();
        }
      }
    }
    return getGetTripExpenseSummaryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExpensesServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpensesServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpensesServiceStub>() {
        @java.lang.Override
        public ExpensesServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpensesServiceStub(channel, callOptions);
        }
      };
    return ExpensesServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ExpensesServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpensesServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpensesServiceBlockingV2Stub>() {
        @java.lang.Override
        public ExpensesServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpensesServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ExpensesServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExpensesServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpensesServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpensesServiceBlockingStub>() {
        @java.lang.Override
        public ExpensesServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpensesServiceBlockingStub(channel, callOptions);
        }
      };
    return ExpensesServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExpensesServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExpensesServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExpensesServiceFutureStub>() {
        @java.lang.Override
        public ExpensesServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExpensesServiceFutureStub(channel, callOptions);
        }
      };
    return ExpensesServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service managing shared group expenses and debt settlements for trips (AIP-121).
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Lists expenses for a trip with pagination (AIP-132).
     * </pre>
     */
    default void listExpenses(app.rappeloids.protos.v1.ListExpensesRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListExpensesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListExpensesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a single expense by resource name (AIP-131).
     * </pre>
     */
    default void getExpense(app.rappeloids.protos.v1.GetExpenseRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Expense> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetExpenseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new trip expense (AIP-133). Requires participant.
     * </pre>
     */
    default void createExpense(app.rappeloids.protos.v1.CreateExpenseRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Expense> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateExpenseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an expense (AIP-134). Requires payer or organizer.
     * </pre>
     */
    default void updateExpense(app.rappeloids.protos.v1.UpdateExpenseRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Expense> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateExpenseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an expense (AIP-135). Requires payer or organizer.
     * </pre>
     */
    default void deleteExpense(app.rappeloids.protos.v1.DeleteExpenseRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteExpenseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets calculated debt and spending summary for a trip (AIP-136).
     * </pre>
     */
    default void getTripExpenseSummary(app.rappeloids.protos.v1.GetTripExpenseSummaryRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.TripExpenseSummary> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTripExpenseSummaryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExpensesService.
   * <pre>
   * Service managing shared group expenses and debt settlements for trips (AIP-121).
   * </pre>
   */
  public static abstract class ExpensesServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExpensesServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExpensesService.
   * <pre>
   * Service managing shared group expenses and debt settlements for trips (AIP-121).
   * </pre>
   */
  public static final class ExpensesServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExpensesServiceStub> {
    private ExpensesServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpensesServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpensesServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists expenses for a trip with pagination (AIP-132).
     * </pre>
     */
    public void listExpenses(app.rappeloids.protos.v1.ListExpensesRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListExpensesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListExpensesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a single expense by resource name (AIP-131).
     * </pre>
     */
    public void getExpense(app.rappeloids.protos.v1.GetExpenseRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Expense> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetExpenseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new trip expense (AIP-133). Requires participant.
     * </pre>
     */
    public void createExpense(app.rappeloids.protos.v1.CreateExpenseRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Expense> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateExpenseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an expense (AIP-134). Requires payer or organizer.
     * </pre>
     */
    public void updateExpense(app.rappeloids.protos.v1.UpdateExpenseRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Expense> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateExpenseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an expense (AIP-135). Requires payer or organizer.
     * </pre>
     */
    public void deleteExpense(app.rappeloids.protos.v1.DeleteExpenseRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteExpenseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets calculated debt and spending summary for a trip (AIP-136).
     * </pre>
     */
    public void getTripExpenseSummary(app.rappeloids.protos.v1.GetTripExpenseSummaryRequest request,
        io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.TripExpenseSummary> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTripExpenseSummaryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExpensesService.
   * <pre>
   * Service managing shared group expenses and debt settlements for trips (AIP-121).
   * </pre>
   */
  public static final class ExpensesServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ExpensesServiceBlockingV2Stub> {
    private ExpensesServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpensesServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpensesServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists expenses for a trip with pagination (AIP-132).
     * </pre>
     */
    public app.rappeloids.protos.v1.ListExpensesResponse listExpenses(app.rappeloids.protos.v1.ListExpensesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getListExpensesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single expense by resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.protos.v1.Expense getExpense(app.rappeloids.protos.v1.GetExpenseRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetExpenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new trip expense (AIP-133). Requires participant.
     * </pre>
     */
    public app.rappeloids.protos.v1.Expense createExpense(app.rappeloids.protos.v1.CreateExpenseRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateExpenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an expense (AIP-134). Requires payer or organizer.
     * </pre>
     */
    public app.rappeloids.protos.v1.Expense updateExpense(app.rappeloids.protos.v1.UpdateExpenseRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUpdateExpenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an expense (AIP-135). Requires payer or organizer.
     * </pre>
     */
    public com.google.protobuf.Empty deleteExpense(app.rappeloids.protos.v1.DeleteExpenseRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteExpenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets calculated debt and spending summary for a trip (AIP-136).
     * </pre>
     */
    public app.rappeloids.protos.v1.TripExpenseSummary getTripExpenseSummary(app.rappeloids.protos.v1.GetTripExpenseSummaryRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetTripExpenseSummaryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ExpensesService.
   * <pre>
   * Service managing shared group expenses and debt settlements for trips (AIP-121).
   * </pre>
   */
  public static final class ExpensesServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExpensesServiceBlockingStub> {
    private ExpensesServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpensesServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpensesServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists expenses for a trip with pagination (AIP-132).
     * </pre>
     */
    public app.rappeloids.protos.v1.ListExpensesResponse listExpenses(app.rappeloids.protos.v1.ListExpensesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListExpensesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a single expense by resource name (AIP-131).
     * </pre>
     */
    public app.rappeloids.protos.v1.Expense getExpense(app.rappeloids.protos.v1.GetExpenseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetExpenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new trip expense (AIP-133). Requires participant.
     * </pre>
     */
    public app.rappeloids.protos.v1.Expense createExpense(app.rappeloids.protos.v1.CreateExpenseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateExpenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an expense (AIP-134). Requires payer or organizer.
     * </pre>
     */
    public app.rappeloids.protos.v1.Expense updateExpense(app.rappeloids.protos.v1.UpdateExpenseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateExpenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an expense (AIP-135). Requires payer or organizer.
     * </pre>
     */
    public com.google.protobuf.Empty deleteExpense(app.rappeloids.protos.v1.DeleteExpenseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteExpenseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets calculated debt and spending summary for a trip (AIP-136).
     * </pre>
     */
    public app.rappeloids.protos.v1.TripExpenseSummary getTripExpenseSummary(app.rappeloids.protos.v1.GetTripExpenseSummaryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTripExpenseSummaryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExpensesService.
   * <pre>
   * Service managing shared group expenses and debt settlements for trips (AIP-121).
   * </pre>
   */
  public static final class ExpensesServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExpensesServiceFutureStub> {
    private ExpensesServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpensesServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExpensesServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Lists expenses for a trip with pagination (AIP-132).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.ListExpensesResponse> listExpenses(
        app.rappeloids.protos.v1.ListExpensesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListExpensesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a single expense by resource name (AIP-131).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.Expense> getExpense(
        app.rappeloids.protos.v1.GetExpenseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetExpenseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new trip expense (AIP-133). Requires participant.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.Expense> createExpense(
        app.rappeloids.protos.v1.CreateExpenseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateExpenseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an expense (AIP-134). Requires payer or organizer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.Expense> updateExpense(
        app.rappeloids.protos.v1.UpdateExpenseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateExpenseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an expense (AIP-135). Requires payer or organizer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteExpense(
        app.rappeloids.protos.v1.DeleteExpenseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteExpenseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets calculated debt and spending summary for a trip (AIP-136).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<app.rappeloids.protos.v1.TripExpenseSummary> getTripExpenseSummary(
        app.rappeloids.protos.v1.GetTripExpenseSummaryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTripExpenseSummaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_EXPENSES = 0;
  private static final int METHODID_GET_EXPENSE = 1;
  private static final int METHODID_CREATE_EXPENSE = 2;
  private static final int METHODID_UPDATE_EXPENSE = 3;
  private static final int METHODID_DELETE_EXPENSE = 4;
  private static final int METHODID_GET_TRIP_EXPENSE_SUMMARY = 5;

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
        case METHODID_LIST_EXPENSES:
          serviceImpl.listExpenses((app.rappeloids.protos.v1.ListExpensesRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.ListExpensesResponse>) responseObserver);
          break;
        case METHODID_GET_EXPENSE:
          serviceImpl.getExpense((app.rappeloids.protos.v1.GetExpenseRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Expense>) responseObserver);
          break;
        case METHODID_CREATE_EXPENSE:
          serviceImpl.createExpense((app.rappeloids.protos.v1.CreateExpenseRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Expense>) responseObserver);
          break;
        case METHODID_UPDATE_EXPENSE:
          serviceImpl.updateExpense((app.rappeloids.protos.v1.UpdateExpenseRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.Expense>) responseObserver);
          break;
        case METHODID_DELETE_EXPENSE:
          serviceImpl.deleteExpense((app.rappeloids.protos.v1.DeleteExpenseRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_TRIP_EXPENSE_SUMMARY:
          serviceImpl.getTripExpenseSummary((app.rappeloids.protos.v1.GetTripExpenseSummaryRequest) request,
              (io.grpc.stub.StreamObserver<app.rappeloids.protos.v1.TripExpenseSummary>) responseObserver);
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
          getListExpensesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.ListExpensesRequest,
              app.rappeloids.protos.v1.ListExpensesResponse>(
                service, METHODID_LIST_EXPENSES)))
        .addMethod(
          getGetExpenseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.GetExpenseRequest,
              app.rappeloids.protos.v1.Expense>(
                service, METHODID_GET_EXPENSE)))
        .addMethod(
          getCreateExpenseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.CreateExpenseRequest,
              app.rappeloids.protos.v1.Expense>(
                service, METHODID_CREATE_EXPENSE)))
        .addMethod(
          getUpdateExpenseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.UpdateExpenseRequest,
              app.rappeloids.protos.v1.Expense>(
                service, METHODID_UPDATE_EXPENSE)))
        .addMethod(
          getDeleteExpenseMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.DeleteExpenseRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_EXPENSE)))
        .addMethod(
          getGetTripExpenseSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              app.rappeloids.protos.v1.GetTripExpenseSummaryRequest,
              app.rappeloids.protos.v1.TripExpenseSummary>(
                service, METHODID_GET_TRIP_EXPENSE_SUMMARY)))
        .build();
  }

  private static abstract class ExpensesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExpensesServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return app.rappeloids.protos.v1.Expenses.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExpensesService");
    }
  }

  private static final class ExpensesServiceFileDescriptorSupplier
      extends ExpensesServiceBaseDescriptorSupplier {
    ExpensesServiceFileDescriptorSupplier() {}
  }

  private static final class ExpensesServiceMethodDescriptorSupplier
      extends ExpensesServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExpensesServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExpensesServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExpensesServiceFileDescriptorSupplier())
              .addMethod(getListExpensesMethod())
              .addMethod(getGetExpenseMethod())
              .addMethod(getCreateExpenseMethod())
              .addMethod(getUpdateExpenseMethod())
              .addMethod(getDeleteExpenseMethod())
              .addMethod(getGetTripExpenseSummaryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
