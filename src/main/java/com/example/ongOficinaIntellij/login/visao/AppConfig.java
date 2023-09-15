package com.example.ongOficinaIntellij.login.visao;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.ongOficinaIntellij.login")
@EntityScan(basePackages = "com.example.ongOficinaIntellij.login.modelo")
public class AppConfig {
    // Outras configurações, se necessário
}







//import org.springframework.boot.autoconfigure.domain.EntityScan;
//        import org.springframework.context.annotation.Configuration;
//
//@Configuration
//
//public class AppConfig {
//    // Outras configurações da sua aplicação
//}