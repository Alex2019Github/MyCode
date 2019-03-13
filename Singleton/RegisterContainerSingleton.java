package gupao_edu.part1.designModel.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * ע��ʽ��������ģʽ, ���󷽱����(Spring IOC)
 * ȱ��: ���̰߳�ȫ����(�̰߳�ȫ���ⲻ����ConcurrentHashMap, ����getBean����)
 */
public class RegisterContainerSingleton {
	
	private RegisterContainerSingleton(){};
	
	private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();
	
	//�򵥹���ģʽ
	public static Object getBean(String className){
		synchronized(map){
			if(!map.containsKey(className)){
				Object obj = null;
				try {
					obj = Class.forName(className).newInstance();
					map.put(className, obj);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return obj;
			}
			return map.get(className);
		}
	}
}
