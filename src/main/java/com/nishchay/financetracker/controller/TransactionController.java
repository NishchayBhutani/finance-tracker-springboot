package com.nishchay.financetracker.controller;

import com.nishchay.financetracker.dto.CreateTransactionRequest;
import com.nishchay.financetracker.dto.GetTransactionResponse;
import com.nishchay.financetracker.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping("/users/{userId}")
    public ResponseEntity<GetTransactionResponse> createTransaction(@RequestBody CreateTransactionRequest createTransactionRequest, @PathVariable long userId) {
        return new ResponseEntity<>(transactionService.create(userId, createTransactionRequest), HttpStatus.CREATED);
    }

    @GetMapping("/{transactionId}")
    public ResponseEntity<GetTransactionResponse> getTransaction(@PathVariable long transactionId) {
        return new ResponseEntity<>(transactionService.get(transactionId), HttpStatus.OK);
    }

    @PutMapping("/{transactionId}")
    public ResponseEntity<GetTransactionResponse> updateTransaction(@RequestBody CreateTransactionRequest updateTransactionRequest, @PathVariable long transactionId) {
        return new ResponseEntity<>(transactionService.update(transactionId, updateTransactionRequest), HttpStatus.OK);
    }

    @DeleteMapping("/{transactionId}")
    public ResponseEntity<Void> deleteTransaction(@PathVariable long transactionId) {
        transactionService.delete(transactionId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
