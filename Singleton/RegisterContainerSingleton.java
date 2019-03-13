package gupao_edu.part1.designModel.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * 注册式容器单例模式, 对象方便管理(Spring IOC)
 * 缺点: 有线程安全问题(线程安全问题不在于ConcurrentHashMap, 在于getBean方法)
 */
public class RegisterContainerSingleton {
	
	private RegisterContainerSingleton(){};
	
	private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();
	
	//简单工厂模式
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
