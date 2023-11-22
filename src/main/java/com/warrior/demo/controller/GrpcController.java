package com.warrior.demo.controller;


import com.warrior.demo.grpc.DuesRequest;
import com.warrior.demo.grpc.DuesResponse;
import com.warrior.demo.grpc.DuesServiceGrpc;
import com.warrior.demo.service.DueService;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@GrpcService
public class GrpcController extends DuesServiceGrpc.DuesServiceImplBase {

    @Autowired
    private DueService dueService;

    @Override
    public void getDuesDetail(DuesRequest request, StreamObserver<DuesResponse> responseObserver) {
        log.info("Received request for due: {}", request);
        DuesResponse response = dueService.getDue(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
