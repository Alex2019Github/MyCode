package gupao_edu.part1.designModel.observer;

import com.google.common.eventbus.Subscribe;

public class EventListener {
	
	/**
	 * 消息监听者(接受者)
	 * @param question
	 */
	@Subscribe
	public String issue(Teacher teacher){
		return teacher.getName() + ",你好! 您收到一条来自GPer社区的问题!";
	}
	
	@Subscribe
	public String gather(Engineer engineer){
		return engineer.getEngineerName() + "你好! 您有一个问题等待处理!";
	}
	
}
