package com.example.ongOficinaIntellij.login.modelo;

import lombok.Data;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.Table;

@Data
@Entity
@Table(name = "funcionario")
public class LoginModelo {
    @Id
    private Long id;
    private String login;
    private String senha;


}
