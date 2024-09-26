package com.binus.online.catatan_keuangan.repository;

import com.binus.online.catatan_keuangan.entity.Transaction;
import com.binus.online.catatan_keuangan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
