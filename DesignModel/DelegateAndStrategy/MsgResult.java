package gupao_edu.part1.designModel.strategy;

public class MsgResult {
	
	private int code;
	private Object data;
	private String msg;
	
	public MsgResult(int code, Object data, String msg) {
		super();
		this.code = code;
		this.data = data;
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "支付状态: [" + code + "], "
				+ msg + ", "
				+ "交易详情: " + data;
	}
	
	
	public int getCode() {
		return code;
	}
	public Object getData() {
		return data;
	}
	public String getMsg() {
		return msg;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
