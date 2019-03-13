package gupao_edu.part1.designModel.singleton;

public class LazyInnerClassSingleton {
	
//	private LazyInnerClassSingleton(){};
	
	//防止反射机制
	private LazyInnerClassSingleton(){
//		if(LazyHolder.LICS != null){
//			throw new RuntimeException("不允许创建多个实例！");
//		}
	};
	
	/*
	 * 性能最优的一种单例模式, 没有使用synchronized关键字
	 * 内部类比外部类优先加载, LazyHolder方法需要等到外部类调用的时候才执行
	 * 利用jvm实现机制, 避免了线程安全问题
	 */
	public static final LazyInnerClassSingleton getInstance(){
		return LazyHolder.LICS;
	}

	private static class LazyHolder {
		private static final LazyInnerClassSingleton LICS = new LazyInnerClassSingleton();
	}
	
}
