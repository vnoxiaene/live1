package com.vnoxiaene.live1.service;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

@Component
@Getter
public class RequestInfo {

    private final String requestId;

    public RequestInfo() {
        this.requestId = UUID.randomUUID().toString();
    }
}
