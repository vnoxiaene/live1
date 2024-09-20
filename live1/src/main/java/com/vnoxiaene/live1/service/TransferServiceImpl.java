package com.vnoxiaene.live1.service;

import com.vnoxiaene.live1.entity.TransferEntity;
import com.vnoxiaene.live1.repository.TransferRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@Profile("!dev")
public class TransferServiceImpl implements TransferService {

    private final TransferRepository transferRepository;
    private final String transferId;

    public TransferServiceImpl(TransferRepository transferRepository) {
        this.transferRepository = transferRepository;
        this.transferId = UUID.randomUUID().toString();
    }

    @Override
    public void createTransfer(TransferEntity transfer) {
        transferRepository.save(transfer);
        log.info("Transferência {} criada com sucesso. TransferId = {}", transfer, transferId);
    }
}
