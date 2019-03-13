package gupao_edu.part1.designModel.singleton;

/*
 * ע��ʽö�ٵ���ģʽ
 * ��Ч�����˷���ͷ����л���ɵ��̰߳�ȫ����
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
