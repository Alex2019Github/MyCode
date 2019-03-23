package gupao_edu.part1.designModel.strategy;

public class BankPay extends PayMode {

	@Override
	public String getName() {
		return "ÒøÁª";
	}

	@Override
	protected double queryBalance(String uid) {
		return 3600.04;
	}

}
