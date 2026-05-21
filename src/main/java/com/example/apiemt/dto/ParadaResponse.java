package com.example.apiemt.dto;
/*
* Clase para la respuesta recibida
* */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) //Para ignorar cualquier propiedad descconocida en el JSON
@Data
public class ParadaResponse {
    private List<Data> data;

    public static class Data{
        private List<Arrive> arrive;
    }

    public static class Arrive{
        private String line; //Numero de linea de bus
        private String stop; //Numero de parada
        private String destination; //Direccion del bus
        private int bus; //Numero de bus
        private Geometry geometry; //Objeto JSON que contiene las coordenadas de la ubicación de la parada
        private int estimateArrive; //Tiempo en segundos para la llegada del bus
        private int DistanceBus; //Metros que separan el bus de la parada
    }

    public static class Geometry{
        private List<Float> coordinates; //Coordenadas de la ubicación de la parada
    }

    //INVESTIGAR LA ZONA DE INCIDENTES(POSIBLE INCORPORACION)
}
