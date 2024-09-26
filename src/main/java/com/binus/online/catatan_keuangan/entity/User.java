package com.binus.online.catatan_keuangan.entity;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Entity
@Getter
@Setter
@ToString
public class User {

    private Long id;
    private String username;
    private String email;
    private String password;

}
