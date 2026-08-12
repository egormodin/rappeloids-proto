package app.rappeloids.protos.v1

import app.rappeloids.protos.v1.CanyonsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for rappeloids.v1.CanyonsService.
 */
public object CanyonsServiceGrpcKt {
  public const val SERVICE_NAME: String = CanyonsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listCanyonsMethod: MethodDescriptor<ListCanyonsRequest, ListCanyonsResponse>
    @JvmStatic
    get() = CanyonsServiceGrpc.getListCanyonsMethod()

  public val getCanyonMethod: MethodDescriptor<GetCanyonRequest, Canyon>
    @JvmStatic
    get() = CanyonsServiceGrpc.getGetCanyonMethod()

  public val createCanyonMethod: MethodDescriptor<CreateCanyonRequest, Canyon>
    @JvmStatic
    get() = CanyonsServiceGrpc.getCreateCanyonMethod()

  public val updateCanyonMethod: MethodDescriptor<UpdateCanyonRequest, Canyon>
    @JvmStatic
    get() = CanyonsServiceGrpc.getUpdateCanyonMethod()

  public val deleteCanyonMethod: MethodDescriptor<DeleteCanyonRequest, Empty>
    @JvmStatic
    get() = CanyonsServiceGrpc.getDeleteCanyonMethod()

  public val batchGetCanyonsMethod:
      MethodDescriptor<BatchGetCanyonsRequest, BatchGetCanyonsResponse>
    @JvmStatic
    get() = CanyonsServiceGrpc.getBatchGetCanyonsMethod()

  /**
   * A stub for issuing RPCs to a(n) rappeloids.v1.CanyonsService service as suspending coroutines.
   */
  @StubFor(CanyonsServiceGrpc::class)
  public class CanyonsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<CanyonsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): CanyonsServiceCoroutineStub =
        CanyonsServiceCoroutineStub(channel, callOptions)

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
    public suspend fun listCanyons(request: ListCanyonsRequest, headers: Metadata = Metadata()):
        ListCanyonsResponse = unaryRpc(
      channel,
      CanyonsServiceGrpc.getListCanyonsMethod(),
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
    public suspend fun getCanyon(request: GetCanyonRequest, headers: Metadata = Metadata()): Canyon
        = unaryRpc(
      channel,
      CanyonsServiceGrpc.getGetCanyonMethod(),
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
    public suspend fun createCanyon(request: CreateCanyonRequest, headers: Metadata = Metadata()):
        Canyon = unaryRpc(
      channel,
      CanyonsServiceGrpc.getCreateCanyonMethod(),
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
    public suspend fun updateCanyon(request: UpdateCanyonRequest, headers: Metadata = Metadata()):
        Canyon = unaryRpc(
      channel,
      CanyonsServiceGrpc.getUpdateCanyonMethod(),
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
    public suspend fun deleteCanyon(request: DeleteCanyonRequest, headers: Metadata = Metadata()):
        Empty = unaryRpc(
      channel,
      CanyonsServiceGrpc.getDeleteCanyonMethod(),
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
    public suspend fun batchGetCanyons(request: BatchGetCanyonsRequest, headers: Metadata =
        Metadata()): BatchGetCanyonsResponse = unaryRpc(
      channel,
      CanyonsServiceGrpc.getBatchGetCanyonsMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the rappeloids.v1.CanyonsService service based on Kotlin coroutines.
   */
  public abstract class CanyonsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for rappeloids.v1.CanyonsService.ListCanyons.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listCanyons(request: ListCanyonsRequest): ListCanyonsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.CanyonsService.ListCanyons is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.CanyonsService.GetCanyon.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getCanyon(request: GetCanyonRequest): Canyon = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.CanyonsService.GetCanyon is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.CanyonsService.CreateCanyon.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createCanyon(request: CreateCanyonRequest): Canyon = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.CanyonsService.CreateCanyon is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.CanyonsService.UpdateCanyon.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateCanyon(request: UpdateCanyonRequest): Canyon = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.CanyonsService.UpdateCanyon is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.CanyonsService.DeleteCanyon.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteCanyon(request: DeleteCanyonRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.CanyonsService.DeleteCanyon is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.CanyonsService.BatchGetCanyons.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun batchGetCanyons(request: BatchGetCanyonsRequest):
        BatchGetCanyonsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.CanyonsService.BatchGetCanyons is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CanyonsServiceGrpc.getListCanyonsMethod(),
      implementation = ::listCanyons
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CanyonsServiceGrpc.getGetCanyonMethod(),
      implementation = ::getCanyon
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CanyonsServiceGrpc.getCreateCanyonMethod(),
      implementation = ::createCanyon
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CanyonsServiceGrpc.getUpdateCanyonMethod(),
      implementation = ::updateCanyon
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CanyonsServiceGrpc.getDeleteCanyonMethod(),
      implementation = ::deleteCanyon
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = CanyonsServiceGrpc.getBatchGetCanyonsMethod(),
      implementation = ::batchGetCanyons
    )).build()
  }
}
