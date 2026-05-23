package com.example.apiemt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebClient {

    @Value("${api.externa.URL}")
    private String url;

    @Bean
    public org.springframework.web.reactive.function.client.WebClient webClient(){
        return org.springframework.web.reactive.function.client.WebClient.builder().baseUrl(url).build();
    }
}
