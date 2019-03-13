package gupao_edu.part1.designModel.singleton;

public class LazyDoubleCheckSingleton {
	
	/*
	 * ������ʱ�Ŵ���ʵ��
	 * ��������: ����synchronized����������౻��
	 * �������: ˫�ؼ����
	 * ȱ��: ָ��������
	 * �������: ����volatile
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
