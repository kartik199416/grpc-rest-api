package com.warrior.demo.controller;

import com.warrior.demo.grpc.DuesRequest;
import com.warrior.demo.service.DueService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class HttpController {

    @Autowired DueService dueService;

    @GetMapping(path = "/check", produces = "application/json")
    public ResponseEntity<?> check() {
        log.info("Received request for hello");
        DuesRequest request = DuesRequest.newBuilder().setClientId("1").build();
        return ResponseEntity.ok(dueService.getDue(request));
    }
}
