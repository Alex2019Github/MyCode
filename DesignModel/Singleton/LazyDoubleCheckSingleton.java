package gupao_edu.part1.designModel.singleton;

public class LazyDoubleCheckSingleton {
	
	/*
	 * 被调用时才创建实例
	 * 出现问题: 引入synchronized会造成整个类被锁
	 * 解决方案: 双重检查锁
	 * 缺陷: 指令重排序
	 * 解决方法: 引入volatile
	 * 
	 */
	private volatile static LazyDoubleCheckSingleton ls = null;
	
	private LazyDoubleCheckSingleton(){};
	
	public static LazyDoubleCheckSingleton getInstance(){
		if(null == ls){
			synchronized(LazyDoubleCheckSingleton.class){
				if(null == ls){
					ls = new LazyDoubleCheckSingleton();
				}
			}
		}
		return ls;
	}
}
