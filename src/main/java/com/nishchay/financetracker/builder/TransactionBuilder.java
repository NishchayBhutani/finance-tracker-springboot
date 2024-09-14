package com.nishchay.financetracker.builder;

import com.nishchay.financetracker.dto.CreateTransactionRequest;
import com.nishchay.financetracker.model.Category;
import com.nishchay.financetracker.model.Transaction;
import com.nishchay.financetracker.model.User;

public class TransactionBuilder {

    public static Transaction createTransaction(CreateTransactionRequest createTransactionRequest, User user, Category category) {
        Transaction transaction = new Transaction();
        transaction.setUser(user);
        transaction.setCategory(category);
        transaction.setName(createTransactionRequest.getName());
        transaction.setAmount(createTransactionRequest.getAmount());
        transaction.setDescription(createTransactionRequest.getDescription());
        transaction.setPaymentMethod(createTransactionRequest.getPaymentMethod());
        return transaction;
    }

    public static Transaction updateTransaction(Transaction transaction, CreateTransactionRequest updateTransactionRequest, Category category) {
        transaction.setName(updateTransactionRequest.getName());
        transaction.setAmount(updateTransactionRequest.getAmount());
        transaction.setDescription(updateTransactionRequest.getDescription());
        transaction.setPaymentMethod(updateTransactionRequest.getPaymentMethod());
        transaction.setCategory(category);
        return transaction;
    }
}
