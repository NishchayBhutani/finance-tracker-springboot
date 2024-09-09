package com.nishchay.financetracker.service;

import com.nishchay.financetracker.dto.CreateTransactionRequest;
import com.nishchay.financetracker.dto.GetTransactionResponse;

public interface TransactionService {

    public GetTransactionResponse create(long userId, CreateTransactionRequest createTransactionRequest);

    public GetTransactionResponse get(long transactionId);

    public GetTransactionResponse update(long transactionId, CreateTransactionRequest updatedTransactionRequest);

    public void delete(long transactionId);
}
