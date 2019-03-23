package gupao_edu.part1.designModel.singleton;

/*
 * 注册式枚举单例模式
 * 有效避免了发射和反序列化造成的线程安全问题
 */
public enum RegisterEnumSingleton {
	
	instance;
	
	private Object data;
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static RegisterEnumSingleton getInstance(){
		return instance;
	}
}
