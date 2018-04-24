package mx.com.vrm.viai.configuration.restDTO;

/**
 *eTypeError
 */
public enum eTypeError {
	
	
	ERROR("E"),
	MDLWARE("M"),
	ORIGIN("O");
	
	private String value;

	private eTypeError(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
}
