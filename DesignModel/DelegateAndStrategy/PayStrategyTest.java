package gupao_edu.part1.designModel.strategy;

public class PayStrategyTest {

	public static void main(String[] args) {
		Order order = new Order("10174521003", "3017458NX876", 368.15);
		MsgResult result = order.payment(PayStrategy.WECHAT_PAY);
		System.out.println(result);
	}

}
