package com.example.apiemt.service;

import com.example.apiemt.client.ParadaApiCliente;
import com.example.apiemt.dto.ParadaRequest;
import com.example.apiemt.dto.ParadaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParadaService {

    private final ParadaApiCliente paradaApiCliente;
    //Metodo que llama a "getLinesByParadaCodeNumber" devolverá objeto ParadaResponse
    public ParadaResponse getLines(String pcn, ParadaRequest body){
        return paradaApiCliente.getLinesByParadaCodeNumber(pcn, body);
    }
}
