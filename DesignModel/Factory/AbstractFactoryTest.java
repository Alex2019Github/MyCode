package gupao_edu.part1.designModel.test;

import gupao_edu.part1.designModel.abstractFactory.ICourseFactory;
import gupao_edu.part1.designModel.abstractFactory.INotes;
import gupao_edu.part1.designModel.abstractFactory.ISource;
import gupao_edu.part1.designModel.abstractFactory.IVideo;
import gupao_edu.part1.designModel.abstractFactory.JavaTypeFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICourseFactory factory = new JavaTypeFactory();
		ISource source = factory.resource();
		INotes note = factory.notes();
		IVideo video = factory.video();
		source.getSource();
		note.getNotes();
		video.getVideo();
		
	}

}
