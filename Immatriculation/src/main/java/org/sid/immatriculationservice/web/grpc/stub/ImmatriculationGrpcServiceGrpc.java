package org.sid.immatriculationservice.web.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ImmatriculationService.proto")
public final class ImmatriculationGrpcServiceGrpc {

  private ImmatriculationGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse> getGetVehicleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicle",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse> getGetVehicleMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse> getGetVehicleMethod;
    if ((getGetVehicleMethod = ImmatriculationGrpcServiceGrpc.getGetVehicleMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetVehicleMethod = ImmatriculationGrpcServiceGrpc.getGetVehicleMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetVehicleMethod = getGetVehicleMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getVehicle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getVehicle"))
                  .build();
          }
        }
     }
     return getGetVehicleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> getGetListVehiclesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListVehicles",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> getGetListVehiclesMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> getGetListVehiclesMethod;
    if ((getGetListVehiclesMethod = ImmatriculationGrpcServiceGrpc.getGetListVehiclesMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetListVehiclesMethod = ImmatriculationGrpcServiceGrpc.getGetListVehiclesMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetListVehiclesMethod = getGetListVehiclesMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getListVehicles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getListVehicles"))
                  .build();
          }
        }
     }
     return getGetListVehiclesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> getGetListOwnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListOwners",
      requestType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest.class,
      responseType = org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest,
      org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> getGetListOwnersMethod() {
    io.grpc.MethodDescriptor<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> getGetListOwnersMethod;
    if ((getGetListOwnersMethod = ImmatriculationGrpcServiceGrpc.getGetListOwnersMethod) == null) {
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        if ((getGetListOwnersMethod = ImmatriculationGrpcServiceGrpc.getGetListOwnersMethod) == null) {
          ImmatriculationGrpcServiceGrpc.getGetListOwnersMethod = getGetListOwnersMethod = 
              io.grpc.MethodDescriptor.<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest, org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationGrpcService", "getListOwners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationGrpcServiceMethodDescriptorSupplier("getListOwners"))
                  .build();
          }
        }
     }
     return getGetListOwnersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehicleMethod(), responseObserver);
    }

    /**
     */
    public void getListVehicles(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListVehiclesMethod(), responseObserver);
    }

    /**
     */
    public void getListOwners(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetListOwnersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetVehicleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse>(
                  this, METHODID_GET_VEHICLE)))
          .addMethod(
            getGetListVehiclesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse>(
                  this, METHODID_GET_LIST_VEHICLES)))
          .addMethod(
            getGetListOwnersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest,
                org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse>(
                  this, METHODID_GET_LIST_OWNERS)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationGrpcServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationGrpcServiceStub> {
    private ImmatriculationGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListVehicles(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListVehiclesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListOwners(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest request,
        io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetListOwnersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationGrpcServiceBlockingStub> {
    private ImmatriculationGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse getVehicle(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehicleMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse getListVehicles(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListVehiclesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse getListOwners(org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetListOwnersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationGrpcServiceFutureStub> {
    private ImmatriculationGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse> getVehicle(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehicleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse> getListVehicles(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListVehiclesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse> getListOwners(
        org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetListOwnersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_VEHICLE = 0;
  private static final int METHODID_GET_LIST_VEHICLES = 1;
  private static final int METHODID_GET_LIST_OWNERS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_VEHICLE:
          serviceImpl.getVehicle((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetVehicleRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getVehicleResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_VEHICLES:
          serviceImpl.getListVehicles((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllVehiclesResponse>) responseObserver);
          break;
        case METHODID_GET_LIST_OWNERS:
          serviceImpl.getListOwners((org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersRequest) request,
              (io.grpc.stub.StreamObserver<org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.GetAllOwnersResponse>) responseObserver);
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

  private static abstract class ImmatriculationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sid.immatriculationservice.web.grpc.stub.ImmatriculationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationGrpcService");
    }
  }

  private static final class ImmatriculationGrpcServiceFileDescriptorSupplier
      extends ImmatriculationGrpcServiceBaseDescriptorSupplier {
    ImmatriculationGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationGrpcServiceMethodDescriptorSupplier
      extends ImmatriculationGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImmatriculationGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetVehicleMethod())
              .addMethod(getGetListVehiclesMethod())
              .addMethod(getGetListOwnersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
