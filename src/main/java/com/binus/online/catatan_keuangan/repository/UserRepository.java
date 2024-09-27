package com.binus.online.catatan_keuangan.repository;

import com.binus.online.catatan_keuangan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
