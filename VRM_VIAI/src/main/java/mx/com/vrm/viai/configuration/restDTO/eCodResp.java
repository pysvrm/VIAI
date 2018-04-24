package mx.com.vrm.viai.configuration.restDTO;

/**
 *eCodResp
 */
public enum eCodResp {

	OK(0),
	KO_GEN_SER(-1),
	KO_GEN_BSN(1),
	KO_BAD_RQT(2),
	KO_BAD_RSP(3);
	
	private Integer value;
		
	private eCodResp(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	
	
		
	
	
}
