package gupao_edu.part1.designModel.observer;

import com.google.common.eventbus.Subscribe;

public class EventListener {
	
	/**
	 * ��Ϣ������(������)
	 * @param question
	 */
	@Subscribe
	public String issue(Teacher teacher){
		return teacher.getName() + ",���! ���յ�һ������GPer����������!";
	}
	
	@Subscribe
	public String gather(Engineer engineer){
		return engineer.getEngineerName() + "���! ����һ������ȴ�����!";
	}
	
}
