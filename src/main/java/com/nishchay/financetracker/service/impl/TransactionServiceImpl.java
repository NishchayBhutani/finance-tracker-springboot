package com.nishchay.financetracker.service.impl;

import com.nishchay.financetracker.builder.GetTransactionResponseBuilder;
import com.nishchay.financetracker.builder.TransactionBuilder;
import com.nishchay.financetracker.dto.CreateTransactionRequest;
import com.nishchay.financetracker.dto.GetTransactionResponse;
import com.nishchay.financetracker.exception.TransactionException;
import com.nishchay.financetracker.model.Category;
import com.nishchay.financetracker.model.Transaction;
import com.nishchay.financetracker.model.User;
import com.nishchay.financetracker.repository.TransactionRepository;
import com.nishchay.financetracker.service.CategoryService;
import com.nishchay.financetracker.service.TransactionService;
import com.nishchay.financetracker.service.UserService;
import com.nishchay.financetracker.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final CategoryService categoryService;
    private final UserService userService;

    @Override
    public GetTransactionResponse create(long userId, CreateTransactionRequest createTransactionRequest) {
        User user = userService.getUserForTransaction(userId);
        Category category = categoryService.getByName(createTransactionRequest.getCategoryName());
        Transaction transaction = TransactionBuilder.createTransaction(createTransactionRequest, user, category);
        transactionRepository.save(transaction);
        return GetTransactionResponseBuilder.createGetTransactionResponse(transaction);
    }

    @Override
    public GetTransactionResponse get(long transactionId) {
        Transaction transaction = transactionRepository.findById(transactionId).orElseThrow(() -> new TransactionException(Constants.TRANSACTION_NOT_FOUND));
        return GetTransactionResponseBuilder.createGetTransactionResponse(transaction);
    }

    @Override
    public GetTransactionResponse update(long transactionId, CreateTransactionRequest updateTransactionRequest) {
        Transaction transaction = transactionRepository.findById(transactionId).orElseThrow(() -> new TransactionException(Constants.TRANSACTION_NOT_FOUND));
        Category category = categoryService.getByName(updateTransactionRequest.getCategoryName());
        TransactionBuilder.updateTransaction(transaction, updateTransactionRequest, category);
        transactionRepository.save(transaction);
        return GetTransactionResponseBuilder.createGetTransactionResponse(transaction);
    }

    @Override
    public void delete(long transactionId) {
        transactionRepository.deleteById(transactionId);
    }
}
