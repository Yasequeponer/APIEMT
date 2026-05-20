package com.example.apiemt.dto;
/*
* Clase dedicada al envio del JSON (body) requerido para obtener los tiempos de espera de una determinada parada por código.
* */
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParadaRequest {
    private String cultureInfo; //Idioma (EN/ES)
    private String Text_StopRequired_YN; //Nombre de la parada (Y/N)
    private String Text_EstimationsRequired_YN; //Datos de bus de llagada (Y/N)
    private String Text_IncidencesRequired_YN; //Incidentes relacionados con las lineas en esta parada (Y/N)
    private String DateTime_Referenced_Incidencies_YYYYMMDD; //Fecha de referencia del incidente(YYYYMMDD)
}
