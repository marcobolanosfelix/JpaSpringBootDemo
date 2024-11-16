package com.orm.demo.shared.utils;  

public class Constants {
  
  private Constants() {}

  /*******************************************************************************************************/
  /***************** CODIGOS Y MENSAJES DE RESPUESTAS DE LA APLICACION ***********************************/
  /*******************************************************************************************************/
  
  /************** RESPONSES 200 *************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_SUCCESS = 0;
  public static final String MSJE_READ_SUCCESS = "El servicio consulto los registros correctamente";
  public static final String MSJE_SAVE_SUCCESS = "El servicio guardo el registro correctamente";
  public static final String MSJE_UPDATE_SUCCESS = "El servicio actualizo el registro correctamente";
  public static final String MSJE_DELETE_SUCCESS = "El servicio elimino el registro correctamente";

  /************** RESPONSES 400 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_REQUEST_INVALID = 100;
  public static final String MSJE_ERROR_REQUEST_INVALID = "La solicitud del cliente es invalida";

  /************** RESPONSES 401 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_CLIENT_UNAUTHORIZED = 101;
  public static final String MSJE_ERROR_CLIENT_UNAUTHORIZED = "Usted no está autorizado para acceder este recurso";

  /************** RESPONSES 403 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_CLIENT_FORBIDDEN = 102;

  /************** RESPONSES 404 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_NOT_FOUND_PATH = 104;
  public static final String MSJE_ERROR_NOT_FOUND_PATH = "El recurso consumido no ha sido encontrado";
  
  public static final int CODE_ERROR_NOT_FOUND_INFO = 105;
  public static final String MSJE_ERROR_READ_DATABASE = "Error al obtener la información";
  public static final String MSJE_NOT_FOUND_READ_DATABASE = "No se encontro información";

  /************** RESPONSES 405 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_METHOD_NOT_ALLOWED = 106;
  public static final String MSJE_ERROR_METHOD_NOT_ALLOWED = "Método no permitido";

  /************** RESPONSES 408 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_REQUEST_TIMEOUT = 107;
  public static final String MSJE_ERROR_REQUEST_TIMEOUT = "La petición no contesto dentro del tiempo establecido";

  /************** RESPONSES 409 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_CONFLICT = 108;
  public static final String MSJE_ERROR_CONFLICT = "El estado de la entidad no permite la operación";

  /************** RESPONSES 422 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_UNPROCESSABLE_ENTITY = 109;
  public static final String MSJE_ERROR_UNPROCESSABLE_ENTITY = "El Content Type no es procesable por el servicio";

  /************** RESPONSES 429 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_TOO_MANY_REQUESTS = 110;
  public static final String MSJE_ERROR_TOO_MANY_REQUESTS = "Se excedio el número de peticiones permitidas";

  /************** RESPONSES 500 **************************************************************************/
  /*******************************************************************************************************/
  public static final int CODE_ERROR_SERVICE_INTERNAL = 111;
  public static final String MSJE_ERROR_SERVICE_INTERNAL = "El servicio presento un error no controlado";
  public static final String MSJE_ERROR_SAVE_DATABASE = "Error al registrar la información";
  public static final String MSJE_ERROR_UPDATE_DATABASE = "Error al actualizar la información";
  public static final String MSJE_ERROR_DELETE_DATABASE = "Error al eliminar la información";
  
  public static final int CODE_ERROR_SERVICE_UNAVAILABLE = 113;
  public static final String MSJE_ERROR_SERVICE_UNAVAILABLE = "El servicio no se encuentra disponible";

   /*******************************************************************************************************/
  /************************* RESILIENCE4J (RETRYS, CIRCUIT BREAKERS) *************************************/
  /*******************************************************************************************************/
  public static final String RESILIENCE4J_SSO = "sso";
  public static final String RESILIENCE4J_MONGODB = "mongodb";
  public static final String RESILIENCE4J_PGSQL = "pgsql";

}
