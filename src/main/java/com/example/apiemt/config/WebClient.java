package com.example.apiemt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebClient {

    private String url="https://openapi.emtmadrid.es";

    @Bean
    public org.springframework.web.reactive.function.client.WebClient webClient(){
        return org.springframework.web.reactive.function.client.WebClient.builder().baseUrl(this.url).build();
    }
}
