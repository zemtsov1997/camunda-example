package com.example.comunda.demo.config;

import com.example.comunda.demo.delegate.AppTypeDelegate;
import com.example.comunda.demo.delegate.LoanApplicationDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DelegateConfig {

    @Bean
    public LoanApplicationDelegate loanApplicationDelegate() {
        return new LoanApplicationDelegate();
    }

    @Bean
    public AppTypeDelegate appTypeDelegate() {
        return new AppTypeDelegate();
    }

}
