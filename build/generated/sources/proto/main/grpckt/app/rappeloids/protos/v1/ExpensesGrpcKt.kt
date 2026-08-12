package app.rappeloids.protos.v1

import app.rappeloids.protos.v1.ExpensesServiceGrpc.getServiceDescriptor
import com.google.protobuf.Empty
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.String
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for rappeloids.v1.ExpensesService.
 */
public object ExpensesServiceGrpcKt {
  public const val SERVICE_NAME: String = ExpensesServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listExpensesMethod: MethodDescriptor<ListExpensesRequest, ListExpensesResponse>
    @JvmStatic
    get() = ExpensesServiceGrpc.getListExpensesMethod()

  public val getExpenseMethod: MethodDescriptor<GetExpenseRequest, Expense>
    @JvmStatic
    get() = ExpensesServiceGrpc.getGetExpenseMethod()

  public val createExpenseMethod: MethodDescriptor<CreateExpenseRequest, Expense>
    @JvmStatic
    get() = ExpensesServiceGrpc.getCreateExpenseMethod()

  public val updateExpenseMethod: MethodDescriptor<UpdateExpenseRequest, Expense>
    @JvmStatic
    get() = ExpensesServiceGrpc.getUpdateExpenseMethod()

  public val deleteExpenseMethod: MethodDescriptor<DeleteExpenseRequest, Empty>
    @JvmStatic
    get() = ExpensesServiceGrpc.getDeleteExpenseMethod()

  public val getTripExpenseSummaryMethod:
      MethodDescriptor<GetTripExpenseSummaryRequest, TripExpenseSummary>
    @JvmStatic
    get() = ExpensesServiceGrpc.getGetTripExpenseSummaryMethod()

  /**
   * A stub for issuing RPCs to a(n) rappeloids.v1.ExpensesService service as suspending coroutines.
   */
  @StubFor(ExpensesServiceGrpc::class)
  public class ExpensesServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<ExpensesServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): ExpensesServiceCoroutineStub =
        ExpensesServiceCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun listExpenses(request: ListExpensesRequest, headers: Metadata = Metadata()):
        ListExpensesResponse = unaryRpc(
      channel,
      ExpensesServiceGrpc.getListExpensesMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getExpense(request: GetExpenseRequest, headers: Metadata = Metadata()):
        Expense = unaryRpc(
      channel,
      ExpensesServiceGrpc.getGetExpenseMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun createExpense(request: CreateExpenseRequest, headers: Metadata = Metadata()):
        Expense = unaryRpc(
      channel,
      ExpensesServiceGrpc.getCreateExpenseMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun updateExpense(request: UpdateExpenseRequest, headers: Metadata = Metadata()):
        Expense = unaryRpc(
      channel,
      ExpensesServiceGrpc.getUpdateExpenseMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun deleteExpense(request: DeleteExpenseRequest, headers: Metadata = Metadata()):
        Empty = unaryRpc(
      channel,
      ExpensesServiceGrpc.getDeleteExpenseMethod(),
      request,
      callOptions,
      headers
    )

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][io.grpc.Status].  If the RPC completes with another status, a
     * corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @param headers Metadata to attach to the request.  Most users will not need this.
     *
     * @return The single response from the server.
     */
    public suspend fun getTripExpenseSummary(request: GetTripExpenseSummaryRequest,
        headers: Metadata = Metadata()): TripExpenseSummary = unaryRpc(
      channel,
      ExpensesServiceGrpc.getGetTripExpenseSummaryMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the rappeloids.v1.ExpensesService service based on Kotlin
   * coroutines.
   */
  public abstract class ExpensesServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for rappeloids.v1.ExpensesService.ListExpenses.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listExpenses(request: ListExpensesRequest): ListExpensesResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.ExpensesService.ListExpenses is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.ExpensesService.GetExpense.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getExpense(request: GetExpenseRequest): Expense = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.ExpensesService.GetExpense is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.ExpensesService.CreateExpense.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createExpense(request: CreateExpenseRequest): Expense = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.ExpensesService.CreateExpense is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.ExpensesService.UpdateExpense.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateExpense(request: UpdateExpenseRequest): Expense = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.ExpensesService.UpdateExpense is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.ExpensesService.DeleteExpense.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteExpense(request: DeleteExpenseRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.ExpensesService.DeleteExpense is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.ExpensesService.GetTripExpenseSummary.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTripExpenseSummary(request: GetTripExpenseSummaryRequest):
        TripExpenseSummary = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.ExpensesService.GetTripExpenseSummary is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExpensesServiceGrpc.getListExpensesMethod(),
      implementation = ::listExpenses
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExpensesServiceGrpc.getGetExpenseMethod(),
      implementation = ::getExpense
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExpensesServiceGrpc.getCreateExpenseMethod(),
      implementation = ::createExpense
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExpensesServiceGrpc.getUpdateExpenseMethod(),
      implementation = ::updateExpense
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExpensesServiceGrpc.getDeleteExpenseMethod(),
      implementation = ::deleteExpense
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = ExpensesServiceGrpc.getGetTripExpenseSummaryMethod(),
      implementation = ::getTripExpenseSummary
    )).build()
  }
}
