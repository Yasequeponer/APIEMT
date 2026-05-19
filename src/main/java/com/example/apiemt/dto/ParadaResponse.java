package com.example.apiemt.dto;
/*
* Clase para la respuesta recibida
* */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true) //Para ignorar cualquier propiedad descconocida en el JSON
@Data
public class ParadaResponse {
    private String line; //Numero de linea de bus
    private String stop; //Numero de parada
    private String destination; //Direccion del bus
    private int bus; //Numero de bus
    private float[] coordinates= new float[2]; //Coordenadas de la ubicación de la parada
    private int estimateArrive; //Tiempo en segundos para la llegada del bus
    private int DistanceBus; //Metros que separan el bus de la parada
}
