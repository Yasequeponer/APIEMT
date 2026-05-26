package com.example.apiemt.controller;

import com.example.apiemt.dto.ParadaRequest;
import com.example.apiemt.dto.ParadaResponse;
import com.example.apiemt.service.ParadaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apiemt/paradas")
@RequiredArgsConstructor
public class ParadaController {

    private final ParadaService paradaService;

    @GetMapping("/arrives/{pcn}") //Endpoint
    public ParadaResponse getAllLines(@PathVariable String pcn){ //Recibe eñ docigo de parada
        ParadaRequest body = ParadaRequest.builder() //Creacion de body que se enviará siempre
                .cultureInfo("Es")
                .Text_StopRequired_YN("Y")
                .Text_EstimationsRequired_YN("Y")
                .Text_IncidencesRequired_YN("N")
                .DateTime_Referenced_Incidencies_YYYYMMDD("20260526").build();

        return paradaService.getLines(pcn, body);
    }

}
