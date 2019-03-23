package gupao_edu.part1.designModel.factoryMethod;

import gupao_edu.part1.designModel.simpleFactory.ICourse;
import gupao_edu.part1.designModel.simpleFactory.PHPCourse;

public class PHPFactory implements ICourseFactory{

	@Override
	public ICourse create() {
		return new PHPCourse();
	}

}
