package com.binus.online.catatan_keuangan.dto;


import lombok.Data;

@Data
public class TransactionPageRequest {

    private Integer size;
    private Integer page;
}
