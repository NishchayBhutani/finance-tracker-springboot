package com.nishchay.financetracker.service.impl;

import com.nishchay.financetracker.builder.UserBuilder;
import com.nishchay.financetracker.dto.CreateTransactionRequest;
import com.nishchay.financetracker.dto.GetTransactionResponse;
import com.nishchay.financetracker.dto.GetUserResponse;
import com.nishchay.financetracker.model.Transaction;
import com.nishchay.financetracker.model.User;
import com.nishchay.financetracker.repository.TransactionRepository;
import com.nishchay.financetracker.service.TransactionService;
import com.nishchay.financetracker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final UserService userService;

    @Override
    public GetTransactionResponse create(long userId, CreateTransactionRequest createTransactionRequest) {
        User user = userService.getUserForTransaction(userId);
        Transaction transaction = new Transaction();
        transaction.setUser(user);
        // TODO complete implementation
        return null;
    }

    @Override
    public GetTransactionResponse get(long transactionId) {
        return null;
    }

    @Override
    public GetTransactionResponse update(long transactionId, CreateTransactionRequest updatedTransactionRequest) {
        return null;
    }

    @Override
    public void delete(long transactionId) {

    }
}
