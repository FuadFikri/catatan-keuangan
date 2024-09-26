package com.binus.online.catatan_keuangan.dto;

import com.binus.online.catatan_keuangan.entity.enums.TransactionType;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionDTO implements Serializable {

    private Long id;
    private String description;
    private BigDecimal amount;
    private LocalDateTime transactionDateTime;
    private TransactionType transactionType;
    private Long userId;

    private String categoryName;


}
