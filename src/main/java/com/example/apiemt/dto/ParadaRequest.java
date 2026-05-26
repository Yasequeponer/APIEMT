package com.example.apiemt.dto;
/*
* Clase dedicada al envio del JSON (body) requerido para obtener los tiempos de espera de una determinada parada por código.
* */
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParadaRequest {
    @JsonProperty("cultureInfo")
    private String cultureInfo; //Idioma (EN/ES)
    @JsonProperty("Text_StopRequired_YN")
    private String Text_StopRequired_YN; //Nombre de la parada (Y/N)
    @JsonProperty("Text_EstimationsRequired_YN")
    private String Text_EstimationsRequired_YN; //Datos de bus de llagada (Y/N)
    @JsonProperty("Text_IncidencesRequired_YN")
    private String Text_IncidencesRequired_YN; //Incidentes relacionados con las lineas en esta parada (Y/N)
    @JsonProperty("DateTime_Referenced_Incidencies_YYYYMMDD")
    private String DateTime_Referenced_Incidencies_YYYYMMDD; //Fecha de referencia del incidente(YYYYMMDD)
}
