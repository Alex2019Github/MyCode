package gupao_edu.part1.designModel.strategy;

public class WeChatPay extends PayMode {

	@Override
	public String getName() {
		return "н╒пе";
	}

	@Override
	protected double queryBalance(String uid) {
		// TODO Auto-generated method stub
		return 567.12;
	}

}
