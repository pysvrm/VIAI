package mx.com.vrm.viai.configuration.restDTO;

/**
 * Header
 */
public class Header {
	
	
	private String imei;
	private String mac;
	private String token;
	
	/**
	 * Header
	 */
	public Header() {
		super();
	}	

	/**
	 * Header
	 * @param imei
	 * @param mac
	 */
	public Header(String imei, String mac) {
		super();
		this.imei = imei;
		this.mac = mac;
	}
	
	@Override
	public String toString() {
		return "Header [imei=" + imei + ", mac=" + mac + "]";
	}
	
	public boolean isValid(){
		if(this.imei == null || "".equals(this.imei)){
			return false;
		}
		if(this.mac == null || "".equals(this.mac)){
			return false;
		}
		return true;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	
		
}
