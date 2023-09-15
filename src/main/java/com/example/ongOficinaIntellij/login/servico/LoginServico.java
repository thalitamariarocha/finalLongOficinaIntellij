package com.example.ongOficinaIntellij.login.servico;

import com.example.ongOficinaIntellij.Utils.UtilitáriosBanco;
import com.example.ongOficinaIntellij.login.entidade.Login;
import org.hibernate.jpa.TypedParameterValue;
import org.hibernate.type.StandardBasicTypes;

import javax.persistence.*;
import java.util.List;


public class LoginServico {


    public int login(String login, String senha) {
        String sql = "SELECT e FROM Login e where e.login = :login and e.senha = :senha";
        Query query = UtilitáriosBanco.createQuery(sql);

        query.setParameter("login",
                new TypedParameterValue(StandardBasicTypes.STRING, login));
        query.setParameter("senha",
                new TypedParameterValue(StandardBasicTypes.STRING, senha));

        List<Login> resultados = query.getResultList();

        int loginId = 0;

        if(resultados != null && !resultados.isEmpty()){
            loginId = resultados.get(0).getId().intValue();
        }

        UtilitáriosBanco.commit();
        return loginId;
    }


}

// WARD ABAIXO.
//        for (Login entidade : resultados) {
//            System.out.println(entidade.getSenha());
//        }

//        resultados.forEach((entidade) -> {
//                    System.out.println(entidade.getSenha());
//                }
//        );
