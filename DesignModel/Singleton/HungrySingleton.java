package gupao_edu.part1.designModel.singleton;

public class HungrySingleton {
	
	/*
	 * 类加载就初始化, 加final为了防止反射修改对象
	 * 缺点: 还没使用就初始化, 浪费内存空间
	 */
	private static final HungrySingleton hs = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return hs;
	}
	
}
