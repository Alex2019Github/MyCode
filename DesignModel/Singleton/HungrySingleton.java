package gupao_edu.part1.designModel.singleton;

public class HungrySingleton {
	
	/*
	 * ����ؾͳ�ʼ��, ��finalΪ�˷�ֹ�����޸Ķ���
	 * ȱ��: ��ûʹ�þͳ�ʼ��, �˷��ڴ�ռ�
	 */
	private static final HungrySingleton hs = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return hs;
	}
	
}
