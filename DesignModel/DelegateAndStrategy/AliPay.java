package gupao_edu.part1.designModel.strategy;

public class AliPay extends PayMode {

	@Override
	public String getName() {
		return "֧����";
	}

	@Override
	protected double queryBalance(String uid) {
		return 325;
	}

}
