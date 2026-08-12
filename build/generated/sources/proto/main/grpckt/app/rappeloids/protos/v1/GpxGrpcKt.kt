package app.rappeloids.protos.v1

import app.rappeloids.protos.v1.GpxServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for rappeloids.v1.GpxService.
 */
public object GpxServiceGrpcKt {
  public const val SERVICE_NAME: String = GpxServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getGpxTrackMethod: MethodDescriptor<GetGpxTrackRequest, GpxTrack>
    @JvmStatic
    get() = GpxServiceGrpc.getGetGpxTrackMethod()

  public val listRegionGpxTracksMethod:
      MethodDescriptor<ListRegionGpxTracksRequest, ListRegionGpxTracksResponse>
    @JvmStatic
    get() = GpxServiceGrpc.getListRegionGpxTracksMethod()

  /**
   * A stub for issuing RPCs to a(n) rappeloids.v1.GpxService service as suspending coroutines.
   */
  @StubFor(GpxServiceGrpc::class)
  public class GpxServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<GpxServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): GpxServiceCoroutineStub =
        GpxServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getGpxTrack(request: GetGpxTrackRequest, headers: Metadata = Metadata()):
        GpxTrack = unaryRpc(
      channel,
      GpxServiceGrpc.getGetGpxTrackMethod(),
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
    public suspend fun listRegionGpxTracks(request: ListRegionGpxTracksRequest, headers: Metadata =
        Metadata()): ListRegionGpxTracksResponse = unaryRpc(
      channel,
      GpxServiceGrpc.getListRegionGpxTracksMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the rappeloids.v1.GpxService service based on Kotlin coroutines.
   */
  public abstract class GpxServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for rappeloids.v1.GpxService.GetGpxTrack.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getGpxTrack(request: GetGpxTrackRequest): GpxTrack = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.GpxService.GetGpxTrack is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.GpxService.ListRegionGpxTracks.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listRegionGpxTracks(request: ListRegionGpxTracksRequest):
        ListRegionGpxTracksResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.GpxService.ListRegionGpxTracks is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GpxServiceGrpc.getGetGpxTrackMethod(),
      implementation = ::getGpxTrack
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = GpxServiceGrpc.getListRegionGpxTracksMethod(),
      implementation = ::listRegionGpxTracks
    )).build()
  }
}
