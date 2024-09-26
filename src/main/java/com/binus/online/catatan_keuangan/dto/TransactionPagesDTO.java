package com.binus.online.catatan_keuangan.dto;


import com.binus.online.catatan_keuangan.entity.Transaction;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TransactionPagesDTO implements Serializable {

    private Integer page;
    private Integer size;
    private Integer total;
    private List<Transaction> data;
}
