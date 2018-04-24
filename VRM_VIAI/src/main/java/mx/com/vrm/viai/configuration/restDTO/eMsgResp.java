package mx.com.vrm.viai.configuration.restDTO;

/**
 *eMsgResp
 */
public enum eMsgResp {

	/* Generic Codes */
	OK 		(0,"Exito"),	
	GEN_SER (-1,"Error de Servicio"),	
	GEN_BSN (1,"Error de Negocio"),
	BAD_RQT (2,"Parametros no validos"),	
	BAD_RSP (3,"Error en origen Ferromex"),	
	BAD_RSP_SQ (4,"Error en respuesta Sicotra"),
	BAD_RSP_IO (5,"Error, operacion interrupida"),
	BAD_QUE_NO (6,"Error, al consumir queue de notificaciones"),
	BAD_LOGIN (7,"usr/pass, incorrecto"),
	BAD_PRIVILEGE (8,"Sin permisos para acceder a la APP"),
	
	/*Date*/
	DATE_PARSER (10,"Fecha con formato incorrecto"),
	
	
	/* Header */
	HEADER_FAIL 	(100,"Dispositivo no permitido"),
	PROFILE_FAIL 	(101,"Sin respuesta al obtener el perfil"),
	USER_NOT_FOUNT 	(102,"Usuario no encontrado"),
	ROLES_NOT_FOUNT (103,"Lista de Roles no encontrada"),
	ROLE_UNKNOW 	(104,"Rol desconocido"),
	LOCAL_NOT_FOUND (105,"Localidad No encontrada"),
	DIV_NOT_FOUND 	(106,"Division No encontrada"),
	
	/* Catalog MSG Errors*/
	CAT_UNKNOW 	(200,"Catalogo Desconocido"),
	CAT_VIAS 	(201,"Sin respuesta al obtener el catalogo de vias"),
	CAT_DIVISION(202,"Sin respuesta al obtener el catalogo de divisiones"),
	CAT_STATION	(203,"Sin respuesta al obtener el catalogo de estaciones"),
	CAT_YARDS 	(204,"Sin respuesta al obtener el catalogo de patios"),
	CAT_ORDERS	(205,"Sin respuesta al obtener el catalogo de orders"),
	CAT_EXEPTIONS(206,"Sin respuesta al obtener el catalogo de excepciones"),
	CAT_STATUS_L(207,"Sin respuesta al obtener el catalogo de status de lista de maniobras"),
	CAT_STATUS_R(208,"Sin respuesta al obtener el catalogo de status de rodajes"),
		
	/* Documents MSG Errors */	
	ERROR_RULES_DOC (300,"Sin respuesta al obtener reglas de los documentos"),	
	PATH_DOC_ERROR 	(301,"Error en la ruta de documentos"),
	NOT_FF 			(302,"Archivo no encontrado"),	
	ERROR_FILE 		(303,"Error en el Archivo"),
	
		
	/*Maneuver*/
	GET_MANEUVER 		(400,"Sin respuesta al obtener lista de maniobras"),
	NO_PROGRAM_MANEUVER (401,"Sin respuesta al obtener trabajo no programado"),
	MOVING_MANEUVER 	(402,"Sin respuesta al realizar movimiento de maniobra"),
	STATUS_MANEUVER 	(403,"Sin respuesta al cambiar el estatus de maniobras"),
	
	
	/*Running */
	GET_RUNNING 		(500,"Sin respuesta al obtener lista de rodajes"),
	MOVIENG_RUNNING		(501,"Sin respuesta al realizar movimiento de rodajes"),
	STATUS_RUNNING 		(502,"Sin respuesta al cambiar estatus de rodajes"),
	EXTRA_RUNNING 		(503,"Sin respuesta al obtener trabajo extraordinario"),
	DEALLOCATE_RUNNING	(504,"Sin respuesta al desasignar rodaje"),
	
	
	/*Messages*/
	GET_MSG				(600,"Sin respuesta al obtener Mensajes"),
	COMMIT_MSG			(601,"Sin respuesta al confirmar mensajes"),
	GET_NOTIFY			(602,"Sin respuesta al obtener notificaciones"),
	COMMIT_NOTIFY		(603,"Sin respuesta al confirmar notificaciones"),
	
	/*Bussines*/
	BAD_RSP_DUPLICATE				(700,"Registro ya existente"),
	BAD_INS		                    (701,"Error al insertar registro en la BD"),
	BAD_UPD		                    (702,"Error al actualizar registro en la BD"),
	BAD_DLT		                    (703,"Error al eliminar registro en la BD"),
	BAD_DLTA		                (704,"Error al eliminar todos los registro en la BD"),
	;		
	
	private Integer valCod;	
	private String valMsg;	

	private eMsgResp(Integer valCod, String valMsg) {
		this.valCod = valCod;
		this.valMsg = valMsg;
	}

	public Integer getValCod() {
		return valCod;
	}

	public String getValMsg() {
		return valMsg;
	}		
	
}
