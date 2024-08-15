package com.example.librarymanagetransactionsv.service;

import com.example.librarymanagetransactionsv.dto.TransactionDto;
import com.example.librarymanagetransactionsv.entity.TransactionEntity;

import java.util.List;

public interface TransactionService {
    void addTransactionDetails(TransactionDto dto);
    List<TransactionDto> getAllTransaction();
}
