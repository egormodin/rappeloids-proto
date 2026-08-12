package app.rappeloids.protos.v1

import app.rappeloids.protos.v1.HistoryServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for rappeloids.v1.HistoryService.
 */
public object HistoryServiceGrpcKt {
  public const val SERVICE_NAME: String = HistoryServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listHistoryMethod: MethodDescriptor<ListHistoryRequest, ListHistoryResponse>
    @JvmStatic
    get() = HistoryServiceGrpc.getListHistoryMethod()

  public val batchUpdateHistoryMethod:
      MethodDescriptor<BatchUpdateHistoryRequest, BatchUpdateHistoryResponse>
    @JvmStatic
    get() = HistoryServiceGrpc.getBatchUpdateHistoryMethod()

  /**
   * A stub for issuing RPCs to a(n) rappeloids.v1.HistoryService service as suspending coroutines.
   */
  @StubFor(HistoryServiceGrpc::class)
  public class HistoryServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<HistoryServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): HistoryServiceCoroutineStub =
        HistoryServiceCoroutineStub(channel, callOptions)

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
    public suspend fun listHistory(request: ListHistoryRequest, headers: Metadata = Metadata()):
        ListHistoryResponse = unaryRpc(
      channel,
      HistoryServiceGrpc.getListHistoryMethod(),
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
    public suspend fun batchUpdateHistory(request: BatchUpdateHistoryRequest, headers: Metadata =
        Metadata()): BatchUpdateHistoryResponse = unaryRpc(
      channel,
      HistoryServiceGrpc.getBatchUpdateHistoryMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the rappeloids.v1.HistoryService service based on Kotlin coroutines.
   */
  public abstract class HistoryServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for rappeloids.v1.HistoryService.ListHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listHistory(request: ListHistoryRequest): ListHistoryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.HistoryService.ListHistory is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.HistoryService.BatchUpdateHistory.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun batchUpdateHistory(request: BatchUpdateHistoryRequest):
        BatchUpdateHistoryResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.HistoryService.BatchUpdateHistory is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryServiceGrpc.getListHistoryMethod(),
      implementation = ::listHistory
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = HistoryServiceGrpc.getBatchUpdateHistoryMethod(),
      implementation = ::batchUpdateHistory
    )).build()
  }
}
