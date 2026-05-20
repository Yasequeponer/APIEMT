package com.example.apiemt.client;

import com.example.apiemt.dto.ParadaRequest;
import com.example.apiemt.dto.ParadaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class ParadaApiCliente {

    private final WebClient webClient;
    @Value("${api.externa.accessToken}") //Accedo al accessToken ubicado en resources/application.properties
    private String accessToken;

    public ParadaResponse getLinesByParadaCodeNumber(String pcn, String line, ParadaRequest body){
        return webClient
                .post()
                .uri(uriBuilder -> uriBuilder
                        .path("/v2/transport/busemtmad/stops/")
                        .queryParam("stopId",pcn)
                        .path("/arrives/")
                        .queryParam("lineArrive",line)
                        .build())
                .header("accessToken", accessToken)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(body)
                .retrieve()
                .bodyToMono(ParadaResponse.class)
                .block()
                ;
    }
}
