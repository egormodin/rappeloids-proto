package app.rappeloids.protos.v1

import app.rappeloids.protos.v1.UsersServiceGrpc.getServiceDescriptor
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
 * Holder for Kotlin coroutine-based client and server APIs for rappeloids.v1.UsersService.
 */
public object UsersServiceGrpcKt {
  public const val SERVICE_NAME: String = UsersServiceGrpc.SERVICE_NAME

  @JvmStatic
  public val serviceDescriptor: ServiceDescriptor
    get() = getServiceDescriptor()

  public val getUserMethod: MethodDescriptor<GetUserRequest, User>
    @JvmStatic
    get() = UsersServiceGrpc.getGetUserMethod()

  public val getMyProfileMethod: MethodDescriptor<Empty, User>
    @JvmStatic
    get() = UsersServiceGrpc.getGetMyProfileMethod()

  public val updateUserMethod: MethodDescriptor<UpdateUserRequest, User>
    @JvmStatic
    get() = UsersServiceGrpc.getUpdateUserMethod()

  public val listUsersMethod: MethodDescriptor<ListUsersRequest, ListUsersResponse>
    @JvmStatic
    get() = UsersServiceGrpc.getListUsersMethod()

  /**
   * A stub for issuing RPCs to a(n) rappeloids.v1.UsersService service as suspending coroutines.
   */
  @StubFor(UsersServiceGrpc::class)
  public class UsersServiceCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT,
  ) : AbstractCoroutineStub<UsersServiceCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): UsersServiceCoroutineStub =
        UsersServiceCoroutineStub(channel, callOptions)

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
    public suspend fun getUser(request: GetUserRequest, headers: Metadata = Metadata()): User =
        unaryRpc(
      channel,
      UsersServiceGrpc.getGetUserMethod(),
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
    public suspend fun getMyProfile(request: Empty, headers: Metadata = Metadata()): User =
        unaryRpc(
      channel,
      UsersServiceGrpc.getGetMyProfileMethod(),
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
    public suspend fun updateUser(request: UpdateUserRequest, headers: Metadata = Metadata()): User
        = unaryRpc(
      channel,
      UsersServiceGrpc.getUpdateUserMethod(),
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
    public suspend fun listUsers(request: ListUsersRequest, headers: Metadata = Metadata()):
        ListUsersResponse = unaryRpc(
      channel,
      UsersServiceGrpc.getListUsersMethod(),
      request,
      callOptions,
      headers
    )
  }

  /**
   * Skeletal implementation of the rappeloids.v1.UsersService service based on Kotlin coroutines.
   */
  public abstract class UsersServiceCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext,
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for rappeloids.v1.UsersService.GetUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getUser(request: GetUserRequest): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.UsersService.GetUser is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.UsersService.GetMyProfile.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun getMyProfile(request: Empty): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.UsersService.GetMyProfile is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.UsersService.UpdateUser.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun updateUser(request: UpdateUserRequest): User = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.UsersService.UpdateUser is unimplemented"))

    /**
     * Returns the response to an RPC for rappeloids.v1.UsersService.ListUsers.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [io.grpc.Status].  If this method fails with a [java.util.concurrent.CancellationException],
     * the RPC will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    public open suspend fun listUsers(request: ListUsersRequest): ListUsersResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method rappeloids.v1.UsersService.ListUsers is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getGetUserMethod(),
      implementation = ::getUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getGetMyProfileMethod(),
      implementation = ::getMyProfile
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getUpdateUserMethod(),
      implementation = ::updateUser
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = UsersServiceGrpc.getListUsersMethod(),
      implementation = ::listUsers
    )).build()
  }
}
