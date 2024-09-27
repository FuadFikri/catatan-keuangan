package com.binus.online.catatan_keuangan.entity;

import com.binus.online.catatan_keuangan.entity.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
public class Transaction implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    private LocalDateTime transactionDateTime;
    private TransactionType transactionType;
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
