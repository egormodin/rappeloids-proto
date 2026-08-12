package app.rappeloids.v1

import app.rappeloids.v1.RegionsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for rappeloids.v1.RegionsService.
 */
public object RegionsServiceGrpcKt {
  public const val SERVICE_NAME: String = RegionsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listRegionsMethod: MethodDescriptor<ListRegionsRequest, ListRegionsResponse>
    @JvmStatic
    get() = RegionsServiceGrpc.getListRegionsMethod()

  public val getRegionMethod: MethodDescriptor<GetRegionRequest, Region>
    @JvmStatic
    get() = RegionsServiceGrpc.getGetRegionMethod()

  public val createRegionMethod: MethodDescriptor<CreateRegionRequest, Region>
    @JvmStatic
    get() = RegionsServiceGrpc.getCreateRegionMethod()

  public val updateRegionMethod: MethodDescriptor<UpdateRegionRequest, Region>
    @JvmStatic
    get() = RegionsServiceGrpc.getUpdateRegionMethod()

  public val deleteRegionMethod: MethodDescriptor<DeleteRegionRequest, Empty>
    @JvmStatic
    get() = RegionsServiceGrpc.getDeleteRegionMethod()

  /**
   * A stub for issuing RPCs to a(n) rappeloids.v1.RegionsService service as suspending coroutines.
   */
  @StubFor(RegionsServiceGrpc::class)
  public class RegionsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<RegionsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): RegionsServiceCoroutineStub =
        RegionsServiceCoroutineStub(channel, callOptions)

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
    public suspend fun listRegions(request: ListRegionsRequest, headers: Metadata = Metadata()):
        ListRegionsResponse = unaryRpc(
      channel,
      RegionsServiceGrpc.getListRegionsMethod(),
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
    public suspend fun getRegion(request: GetRegionRequest, headers: Metadata = Metadata()): Region
        = unaryRpc(
      channel,
      RegionsServiceGrpc.getGetRegionMethod(),
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
    public suspend fun createRegion(request: CreateRegionRequest, headers: Metadata = Metadata()):
        Region = unaryRpc(
      channel,
      RegionsServiceGrpc.getCreateRegionMethod(),
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
    public suspend fun updateRegion(request: UpdateRegionRequest, headers: Metadata = Metadata()):
        Region = unaryRpc(
      channel,
      RegionsServiceGrpc.getUpdateRegionMethod(),
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
    public suspend fun deleteRegion(request: DeleteRegionRequest, headers: Metadata = Metadata()):
        Empty = unaryRpc(
      channel,
      RegionsServiceGrpc.getDeleteRegionMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the rappeloids.v1.RegionsService service based on Kotlin coroutines.
   */
  public abstract class RegionsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for rappeloids.v1.RegionsService.ListRegions.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listRegions(request: ListRegionsRequest): ListRegionsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.RegionsService.ListRegions is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.RegionsService.GetRegion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getRegion(request: GetRegionRequest): Region = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.RegionsService.GetRegion is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.RegionsService.CreateRegion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createRegion(request: CreateRegionRequest): Region = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.RegionsService.CreateRegion is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.RegionsService.UpdateRegion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateRegion(request: UpdateRegionRequest): Region = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.RegionsService.UpdateRegion is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.RegionsService.DeleteRegion.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteRegion(request: DeleteRegionRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.RegionsService.DeleteRegion is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RegionsServiceGrpc.getListRegionsMethod(),
      implementation = ::listRegions
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RegionsServiceGrpc.getGetRegionMethod(),
      implementation = ::getRegion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RegionsServiceGrpc.getCreateRegionMethod(),
      implementation = ::createRegion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RegionsServiceGrpc.getUpdateRegionMethod(),
      implementation = ::updateRegion
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = RegionsServiceGrpc.getDeleteRegionMethod(),
      implementation = ::deleteRegion
    )).build()
  }
}
