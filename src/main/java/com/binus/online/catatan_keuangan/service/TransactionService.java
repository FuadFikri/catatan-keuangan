package com.binus.online.catatan_keuangan.service;


import com.binus.online.catatan_keuangan.dto.TransactionPageRequest;
import com.binus.online.catatan_keuangan.dto.TransactionPagesDTO;
import com.binus.online.catatan_keuangan.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class TransactionService {

    private final TransactionRepository transactionRepository;


//    public TransactionPagesDTO getTransactionPages(TransactionPageRequest request){
//        Pageable pageable = PageRequest.of(request.getPage(), request.getSize(), Sort.by("transactionDate").descending());
//        transactionRepository.findAll(pageable)
//    }
}
