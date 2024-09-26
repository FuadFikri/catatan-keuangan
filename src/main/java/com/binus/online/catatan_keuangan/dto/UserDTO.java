package com.binus.online.catatan_keuangan.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private Long id;
    private String username;
    private String email;

}
