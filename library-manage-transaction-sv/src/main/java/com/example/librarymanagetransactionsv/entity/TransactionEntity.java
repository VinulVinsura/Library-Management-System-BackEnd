package com.example.librarymanagetransactionsv.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private Long booksId;
    private String booksIsbn;
    private String userEmail;
    private String userPhoneNum;
    private String date;
}
