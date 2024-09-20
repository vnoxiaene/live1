package com.vnoxiaene.live1.service;

import com.vnoxiaene.live1.entity.TransferEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
@Slf4j
public class TransferServiceDev implements TransferService {
    @Override
    public void createTransfer(TransferEntity transfer) {
        log.info("A informação chegou.");
    }
}
