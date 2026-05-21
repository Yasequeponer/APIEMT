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

    public ParadaResponse getLines(String pcn, String line, ParadaRequest body){
        return paradaApiCliente.getLinesByParadaCodeNumber(pcn ,line, body);
    }
}
