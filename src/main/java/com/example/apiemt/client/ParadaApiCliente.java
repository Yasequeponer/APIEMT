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
        String path = (line !=null && !line.isBlank())
                ? "https://openapi.emtmadrid.es/v2/transport/busemtmad/stops/" + pcn + "/arrives/"+ line +"/"  //Si lines NO viene vacio se usa esta url
                : "https://openapi.emtmadrid.es/v2/transport/busemtmad/stops/" + pcn + "/arrives//";    //Si no, esta otra

        return webClient
                .post() //Metodo POST
                .uri(path) // URL
                .header("accessToken", accessToken)     //AccessToken
                .contentType(MediaType.APPLICATION_JSON)    //Formato de body(JSON)
                .bodyValue(body) //El objeto ParadaRequest se convierte a JSON
                .retrieve() //Envio
                .bodyToMono(ParadaResponse.class) //Convierte el JSON de respuesta a ParadaResponse
                .block(); //Espera la respuesta(síncrono)
    }
}
