package gupao_edu.part1.designModel.singleton;

public class LazySingleton {
	
	/*
	 * 被调用时才创建实例
	 * 缺点: 线程安全问题
	 * 解决方案: 引入synchronized
	 * 缺陷: 造成整个类被锁
	 */
	private static LazySingleton ls = null;
	
	private LazySingleton(){};
	
	public synchronized static LazySingleton getInstance(){
		if(null == ls){
			ls = new LazySingleton();
		}
		return ls;
	}
}
