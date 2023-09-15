package com.example.ongOficinaIntellij.login.entidade;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "funcionario")
public class Login {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    @Id
    private Long id;

    @Column(name = "login", nullable = false, unique = true)
    private String login;

    @Column(name = "senha", nullable = false)
    private String senha;



}
