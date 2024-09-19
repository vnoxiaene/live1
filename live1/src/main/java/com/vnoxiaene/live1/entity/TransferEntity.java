package com.vnoxiaene.live1.entity;

import lombok.Value;

@Value
public class TransferEntity {

    String id;
    String senderAccount;
    String receiverAccount;
    double amount;

}
