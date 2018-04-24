package mx.com.vrm.viai.configuration.restDTO;

import java.io.Serializable;

/**
 * Item
 */
public class Item implements Serializable{


	private static final long serialVersionUID = 5627363484322927073L;
	
	private Integer code;
	private Integer codMsg;
	private String msg;
	private String type;
	
	/**
	 * Item
	 */
	public Item() {
		super();
	}

	/**
	 * Item
	 * @param code
	 * @param codMsg
	 * @param msg
	 * @param type
	 */
	public Item(Integer code, Integer codMsg, String msg, String type) {
		super();
		this.code = code;
		this.codMsg = codMsg;
		this.msg = msg;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Item [code=" + code + ", codMsg=" + codMsg + ", msg=" + msg + ", type=" + type + "]";
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}	

	public Integer getCodMsg() {
		return codMsg;
	}

	public void setCodMsg(Integer codMsg) {
		this.codMsg = codMsg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
