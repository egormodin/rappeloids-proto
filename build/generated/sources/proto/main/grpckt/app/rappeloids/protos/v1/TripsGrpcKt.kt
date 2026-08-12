package app.rappeloids.protos.v1

import app.rappeloids.protos.v1.TripsServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for rappeloids.v1.TripsService.
 */
public object TripsServiceGrpcKt {
  public const val SERVICE_NAME: String = TripsServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val listTripsMethod: MethodDescriptor<ListTripsRequest, ListTripsResponse>
    @JvmStatic
    get() = TripsServiceGrpc.getListTripsMethod()

  public val getTripMethod: MethodDescriptor<GetTripRequest, Trip>
    @JvmStatic
    get() = TripsServiceGrpc.getGetTripMethod()

  public val createTripMethod: MethodDescriptor<CreateTripRequest, Trip>
    @JvmStatic
    get() = TripsServiceGrpc.getCreateTripMethod()

  public val updateTripMethod: MethodDescriptor<UpdateTripRequest, Trip>
    @JvmStatic
    get() = TripsServiceGrpc.getUpdateTripMethod()

  public val deleteTripMethod: MethodDescriptor<DeleteTripRequest, Empty>
    @JvmStatic
    get() = TripsServiceGrpc.getDeleteTripMethod()

  /**
   * A stub for issuing RPCs to a(n) rappeloids.v1.TripsService service as suspending coroutines.
   */
  @StubFor(TripsServiceGrpc::class)
  public class TripsServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<TripsServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): TripsServiceCoroutineStub =
        TripsServiceCoroutineStub(channel, callOptions)

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
    public suspend fun listTrips(request: ListTripsRequest, headers: Metadata = Metadata()):
        ListTripsResponse = unaryRpc(
      channel,
      TripsServiceGrpc.getListTripsMethod(),
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
    public suspend fun getTrip(request: GetTripRequest, headers: Metadata = Metadata()): Trip =
        unaryRpc(
      channel,
      TripsServiceGrpc.getGetTripMethod(),
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
    public suspend fun createTrip(request: CreateTripRequest, headers: Metadata = Metadata()): Trip
        = unaryRpc(
      channel,
      TripsServiceGrpc.getCreateTripMethod(),
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
    public suspend fun updateTrip(request: UpdateTripRequest, headers: Metadata = Metadata()): Trip
        = unaryRpc(
      channel,
      TripsServiceGrpc.getUpdateTripMethod(),
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
    public suspend fun deleteTrip(request: DeleteTripRequest, headers: Metadata = Metadata()): Empty
        = unaryRpc(
      channel,
      TripsServiceGrpc.getDeleteTripMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the rappeloids.v1.TripsService service based on Kotlin coroutines.
   */
  public abstract class TripsServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for rappeloids.v1.TripsService.ListTrips.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listTrips(request: ListTripsRequest): ListTripsResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.TripsService.ListTrips is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.TripsService.GetTrip.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getTrip(request: GetTripRequest): Trip = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.TripsService.GetTrip is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.TripsService.CreateTrip.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun createTrip(request: CreateTripRequest): Trip = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.TripsService.CreateTrip is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.TripsService.UpdateTrip.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateTrip(request: UpdateTripRequest): Trip = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.TripsService.UpdateTrip is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.TripsService.DeleteTrip.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun deleteTrip(request: DeleteTripRequest): Empty = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.TripsService.DeleteTrip is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TripsServiceGrpc.getListTripsMethod(),
      implementation = ::listTrips
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TripsServiceGrpc.getGetTripMethod(),
      implementation = ::getTrip
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TripsServiceGrpc.getCreateTripMethod(),
      implementation = ::createTrip
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TripsServiceGrpc.getUpdateTripMethod(),
      implementation = ::updateTrip
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = TripsServiceGrpc.getDeleteTripMethod(),
      implementation = ::deleteTrip
    )).build()
  }
}
