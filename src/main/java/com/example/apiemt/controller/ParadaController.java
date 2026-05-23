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

    private ParadaService paradaService;

    @PostMapping
    public ParadaResponse getAllLines(@RequestParam String pcn, @RequestParam String line, @RequestParam ParadaRequest body){
        return paradaService.getLines(pcn, line, body);
    }

}
