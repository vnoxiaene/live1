package com.vnoxiaene.live1.controller;

import com.vnoxiaene.live1.entity.TransferEntity;
import com.vnoxiaene.live1.service.TransferService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfers")
@Slf4j
@RequiredArgsConstructor
public class TransferController {

    private final TransferService transferService;

    @PostMapping
    public ResponseEntity<String> createTransfer(@RequestBody TransferEntity transferEntity) {
        transferService.createTransfer(transferEntity);
        return ResponseEntity.ok("Transferência criada com sucesso.");
    }
}
