package com.example.apiemt.dto;
/*
* Clase para la respuesta recibida
* */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) //Para ignorar cualquier propiedad descconocida en el JSON
@Data
public class ParadaResponse {
    private List<Datos> data;

    @JsonIgnoreProperties(ignoreUnknown = true) //Para ignorar cualquier propiedad descconocida en el JSON
    @Data
    public static class Datos{
        @JsonProperty("Arrive")
        private List<Arrive> arrive;
    }

    @JsonIgnoreProperties(ignoreUnknown = true) //Para ignorar cualquier propiedad descconocida en el JSON
    @Data
    public static class Arrive{
        private String line; //Numero de linea de bus
        private String stop; //Numero de parada
        private String destination; //Direccion del bus
        private int bus; //Numero de bus
        private Geometry geometry; //Objeto JSON que contiene las coordenadas de la ubicación de la parada
        @JsonProperty("estimateArrive")
        private int estimateArrive; //Tiempo en segundos para la llegada del bus
        @JsonProperty("DistanceBus")
        private int distanceBus; //Metros que separan el bus de la parada
    }

    @JsonIgnoreProperties(ignoreUnknown = true) //Para ignorar cualquier propiedad descconocida en el JSON
    @Data
    public static class Geometry{
        private List<Float> coordinates; //Coordenadas de la ubicación de la parada
    }

    //INVESTIGAR LA ZONA DE INCIDENTES(POSIBLE INCORPORACION)
}
