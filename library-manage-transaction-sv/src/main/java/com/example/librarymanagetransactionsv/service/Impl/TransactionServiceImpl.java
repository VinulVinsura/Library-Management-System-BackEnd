package com.example.librarymanagetransactionsv.service.Impl;

import com.example.librarymanagetransactionsv.dto.TransactionDto;
import com.example.librarymanagetransactionsv.entity.TransactionEntity;
import com.example.librarymanagetransactionsv.repository.TransactionRepo;
import com.example.librarymanagetransactionsv.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void addTransactionDetails(TransactionDto dto) {
             transactionRepo.save(modelMapper.map(dto, TransactionEntity.class));
    }

    @Override
    public List<TransactionDto> getAllTransaction() {
        log.info("1");
        List<TransactionEntity> entities = transactionRepo.findAll();
        log.info(entities.toString());
        return modelMapper.map(entities,new TypeToken<List<TransactionDto>>(){}.getType());
    }
}
