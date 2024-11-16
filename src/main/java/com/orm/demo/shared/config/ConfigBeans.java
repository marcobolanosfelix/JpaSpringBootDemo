package com.orm.demo.shared.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import com.orm.demo.domain.utils.TransactionService;

@Configuration
public class ConfigBeans {

  //BEAN POR REQUEST DE LA TRANSACCION DEL SERVICIO POR PETICION
  @Bean
  @RequestScope
  TransactionService getTransactionService() {
    return new TransactionService();
  }
  
}
