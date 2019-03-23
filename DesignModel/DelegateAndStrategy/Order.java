package gupao_edu.part1.designModel.strategy;

public class Order {
	
	private String uid;
	private String oid;
	private double amount;
	
	public Order(String uid, String oid, double amount) {
		super();
		this.uid = uid;
		this.oid = oid;
		this.amount = amount;
	}
	
	public MsgResult payment(String key){
		PayMode payMode = PayStrategy.getPayKey(key);
		System.out.println("��ӭʹ�� [" + payMode.getName() + "]");
		System.out.println("���ν��׽��Ϊ: " + amount);
		return payMode.pay(uid, amount);
	}
	
	public String getUid() {
		return uid;
	}
	public String getOid() {
		return oid;
	}
	public double getAmount() {
		return amount;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
