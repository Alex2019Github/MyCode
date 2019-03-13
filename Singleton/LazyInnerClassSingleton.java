package gupao_edu.part1.designModel.singleton;

public class LazyInnerClassSingleton {
	
//	private LazyInnerClassSingleton(){};
	
	//��ֹ�������
	private LazyInnerClassSingleton(){
//		if(LazyHolder.LICS != null){
//			throw new RuntimeException("�����������ʵ����");
//		}
	};
	
	/*
	 * �������ŵ�һ�ֵ���ģʽ, û��ʹ��synchronized�ؼ���
	 * �ڲ�����ⲿ�����ȼ���, LazyHolder������Ҫ�ȵ��ⲿ����õ�ʱ���ִ��
	 * ����jvmʵ�ֻ���, �������̰߳�ȫ����
	 */
	public static final LazyInnerClassSingleton getInstance(){
		return LazyHolder.LICS;
	}

	private static class LazyHolder {
		private static final LazyInnerClassSingleton LICS = new LazyInnerClassSingleton();
	}
	
}
