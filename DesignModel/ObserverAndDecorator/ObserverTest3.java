package gupao_edu.part1.designModel.observer;

import com.google.common.eventbus.EventBus;

public class ObserverTest3 {

	public static void main(String[] args) {
		Question question = new Question("Mark", "菜单栏的菜单切换功能有BUG!");
		
		//消息总线
		EventBus eventBus = new EventBus();
		EventListener listener = new EventListener();
		eventBus.register(listener);
		eventBus.post(question);
		
		StringBuilder sb = new StringBuilder();
		sb.append(" 内容是: " + question.getContent() + " 来自一名叫 [" + question.getName() + "]的同学").toString();
		
		System.out.println(listener.issue(new Teacher("Tom")) + sb);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(listener.issue(new Teacher("James")) + sb);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(listener.gather(new Engineer("Alex")) + sb);
	}

}
