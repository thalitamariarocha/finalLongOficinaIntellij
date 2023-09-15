package com.example.ongOficinaIntellij.login.controle;

import com.example.ongOficinaIntellij.login.servico.LoginServico;
import org.springframework.beans.factory.annotation.Autowired;


public class LoginController {
    @Autowired
    LoginServico loginServico;

    public void login(String login, String senha){
        loginServico.login(login, senha);
    }

}
