package com.warrior.demo.service;

import com.warrior.demo.grpc.DuesRequest;
import com.warrior.demo.grpc.DuesResponse;
import com.warrior.demo.grpc.DuesDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DueService {

  public DuesResponse getDue(DuesRequest request) {
    log.info("Received request for due: {0}", request);
    return DuesResponse.newBuilder().addDuesDetail(DuesDetail.newBuilder().build()).build();
  }
}
