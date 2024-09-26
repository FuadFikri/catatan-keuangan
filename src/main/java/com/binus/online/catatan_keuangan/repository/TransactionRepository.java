package com.binus.online.catatan_keuangan.repository;

import com.binus.online.catatan_keuangan.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository  extends JpaRepository<Transaction, Long> {
}
