package gupao_edu.part1.designModel.observer;

public class Question {
	
	private String name;
	
	private String content;

	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public Question(String name, String content){
		this.name = name;
		this.content = content;
		System.out.println(name + ", 在GPer社区上提了一个问题! 内容是: " + content);
		System.out.println("==============================================================================");
	}
	
}
