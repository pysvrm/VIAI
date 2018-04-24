package mx.com.vrm.viai.configuration.restDTO;

/**
 * Request Object
 */
public class RequestObj {

	
	private Header header;

	/**
	 * RequestObj
	 */
	public RequestObj() {
		super();
	}

	/**
	 * RequestObj
	 * @param header
	 */
	public RequestObj(Header header) {
		super();
		this.header = header;
	}

	@Override
	public String toString() {
		return "RequestObj [header=" + header + "]";
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}	
	
}
