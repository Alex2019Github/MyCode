package gupao_edu.part1.designModel.observer;

import com.google.common.eventbus.EventBus;

public class ObserverTest3 {

	public static void main(String[] args) {
		Question question = new Question("Mark", "�˵����Ĳ˵��л�������BUG!");
		
		//��Ϣ����
		EventBus eventBus = new EventBus();
		EventListener listener = new EventListener();
		eventBus.register(listener);
		eventBus.post(question);
		
		StringBuilder sb = new StringBuilder();
		sb.append(" ������: " + question.getContent() + " ����һ���� [" + question.getName() + "]��ͬѧ").toString();
		
		System.out.println(listener.issue(new Teacher("Tom")) + sb);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(listener.issue(new Teacher("James")) + sb);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(listener.gather(new Engineer("Alex")) + sb);
	}

}
