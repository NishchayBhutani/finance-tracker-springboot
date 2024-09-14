package com.nishchay.financetracker.builder;

import com.nishchay.financetracker.dto.CreateTransactionRequest;
import com.nishchay.financetracker.dto.GetCategoryResponse;
import com.nishchay.financetracker.dto.GetTransactionResponse;
import com.nishchay.financetracker.dto.GetUserResponse;
import com.nishchay.financetracker.model.Transaction;
import com.nishchay.financetracker.model.User;

public class GetTransactionResponseBuilder {

    public static GetTransactionResponse createGetTransactionResponse(Transaction transaction) {
        GetTransactionResponse getTransactionResponse = new GetTransactionResponse();
        getTransactionResponse.setName(transaction.getName());
        getTransactionResponse.setDescription(transaction.getDescription());
        getTransactionResponse.setId(transaction.getId());
        getTransactionResponse.setPaymentMethod(transaction.getPaymentMethod());
        getTransactionResponse.setAmount(transaction.getAmount());
        GetUserResponse getUserResponse = GetUserResponseBuilder.createGetUserResponse(transaction.getUser());
        getTransactionResponse.setUser(getUserResponse);
        GetCategoryResponse getCategoryResponse = GetCategoryResponseBuilder.createGetCategoryResponse(transaction.getCategory());
        getTransactionResponse.setCategory(getCategoryResponse);
        return getTransactionResponse;
    }
}
