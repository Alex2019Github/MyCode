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
		System.out.println("欢迎使用 [" + payMode.getName() + "]");
		System.out.println("本次交易金额为: " + amount);
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
