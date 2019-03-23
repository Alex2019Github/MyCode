package gupao_edu.part1.designModel.strategy;

public abstract class PayMode {
	
	public abstract String getName();
	
	protected abstract double queryBalance(String uid);
	
	public MsgResult pay(String uid, double amount){
		if(queryBalance(uid) < amount){
			return new MsgResult(500, "֧��ʧ�ܣ�", "����");
		}
		return new MsgResult(200, "֧���ɹ�", "֧�����: " + amount);
	}
}
