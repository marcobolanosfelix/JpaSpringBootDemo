package com.orm.demo.domain.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Meta {
  private int codeService;// CODIGO DE RESPUESTA DE LA APLICACION
  private String messageService;// MENSAJE QUE MOSTRAMOS AL CLIENTE
  private String transactionID;// ID DE LA TRANSACCION
  private int codeHttp;// CODIGO HTTP
  private String messageHttp;// MENSAJE DEL CODIGO HTTP
  private String timestamp;// FECHA Y HORA DEL MOMENTO EN EL QUE SE GENERA EL RESPONSE
  private String timeDuration;// TIEMPO QUE DURO EJECUTANDODE EL ENDPOINT
  private String messageException;// MENSAJE DE EXCEPCION
  private String originException; // ORIGEN DONDE SE DESENCADENO EL ERROR
  private String nameReference; // NOMBRE DE LA DEPENDENCIA QUE DETONO EL ERROR
  private String codeReference; //CODIGO DEVUELTO POR DEPENDENCIA, EN CASO QUE ALGUNA DETONE EL ERROR EN EL SERVICIO
  private String messageReference; //MENSAJE DEVUELTO POR DEPENDENCIA, EN CASO QUE ALGUNA DETONE EL ERROR EN EL SERVICIO  
}
