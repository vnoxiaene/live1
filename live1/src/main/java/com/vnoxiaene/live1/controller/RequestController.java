package com.vnoxiaene.live1.controller;

import com.vnoxiaene.live1.entity.TransferEntity;
import com.vnoxiaene.live1.service.RequestInfo;
import com.vnoxiaene.live1.service.TransferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/request-info")
@Slf4j
@RequiredArgsConstructor
@RequestScope
public class RequestController {

    private final RequestInfo requestInfo;

    @GetMapping
    public ResponseEntity<String> getRequestInfo() {
        return ResponseEntity.ok(requestInfo.getRequestId());
    }
}
