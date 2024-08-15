package com.example.librarymanagetransactionsv.repository;

import com.example.librarymanagetransactionsv.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<TransactionEntity,Long> {
}
