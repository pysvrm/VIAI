package mx.com.vrm.viai.configuration.restDTO;



/**
 * ResponseObj
 */
public class ResponseObj {
	
	
	private Item item;
	private Object response;
	
	/**
	 * ResponseObj
	 */
	public ResponseObj() {
		super();
	}
	
	/**
	 * ResponseObj
	 * @param item
	 */
	public ResponseObj(Item item) {
		super();
		this.item = item;
	}

	/**
	 * ResponseObj
	 * @param item
	 * @param response
	 */
	public ResponseObj(Item item, Object response) {
		super();
		this.item = item;
		this.response = response;
	}
	
	/**
	 * ResponseObj
	 * @param eCodResp
	 * @param eMsgResp
	 * @param eTypeError
	 */
	public ResponseObj(eCodResp eCodResp, eMsgResp eMsgResp, eTypeError eTypeError){
		super();		
		this.item = new Item(eCodResp.getValue(), eMsgResp.getValCod(), eMsgResp.getValMsg(), eTypeError.getValue());
	}
	
	/**
	 * ResponseObj
	 * @param eCodResp
	 * @param eMsgResp
	 * @param eTypeError
	 * @param response
	 */
	public ResponseObj(eCodResp eCodResp, eMsgResp eMsgResp, eTypeError eTypeError, Object response){
		super();
		this.item = new Item(eCodResp.getValue(), eMsgResp.getValCod(), eMsgResp.getValMsg(), eTypeError.getValue());
		this.response = response;
	}
	

	@Override
	public String toString() {
		return "ResponseObj [item=" + item + ", response=" + response + "]";
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}		

}
