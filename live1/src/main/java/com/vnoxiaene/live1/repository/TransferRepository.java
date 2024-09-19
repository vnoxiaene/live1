package com.vnoxiaene.live1.repository;

import com.vnoxiaene.live1.entity.TransferEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TransferRepository {

    private final Map<String, TransferEntity> transferMap = new HashMap<>();

    public void save(TransferEntity transfer) {
        transferMap.put(transfer.getId(), transfer);
    }

    public TransferEntity findById(String id) {
        return transferMap.get(id);
    }

    public List<TransferEntity> findAll() {
        return new ArrayList<>(transferMap.values());
    }

    public void delete(String id) {
        transferMap.remove(id);
    }
}
