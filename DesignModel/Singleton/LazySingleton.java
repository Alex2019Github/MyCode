package gupao_edu.part1.designModel.singleton;

public class LazySingleton {
	
	/*
	 * ������ʱ�Ŵ���ʵ��
	 * ȱ��: �̰߳�ȫ����
	 * �������: ����synchronized
	 * ȱ��: ��������౻��
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
