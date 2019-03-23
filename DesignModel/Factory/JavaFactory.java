package gupao_edu.part1.designModel.factoryMethod;

import gupao_edu.part1.designModel.simpleFactory.ICourse;
import gupao_edu.part1.designModel.simpleFactory.JavaCourse;

public class JavaFactory implements ICourseFactory{

	@Override
	public ICourse create() {
		return new JavaCourse();
	}

}
