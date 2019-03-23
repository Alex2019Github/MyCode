package gupao_edu.part1.designModel.strategy;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {
	
	public static final String ALI_PAY = "aliPay";
	public static final String WECHAT_PAY = "wechatPay";
	public static final String BANK_PAY = "bankPay";
	
	private static Map<String, PayMode> payMap = new HashMap<String, PayMode>();
	
	static{
		payMap.put(ALI_PAY, new AliPay());
		payMap.put(WECHAT_PAY, new WeChatPay());
		payMap.put(BANK_PAY, new BankPay());
	}
	
	//统一入口实现动态策略
	public static PayMode getPayKey(String key){
		if(!payMap.containsKey(key)){
			return payMap.get(ALI_PAY);
		}
		return payMap.get(key);
	}
}	
