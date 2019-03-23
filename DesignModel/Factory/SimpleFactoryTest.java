package gupao_edu.part1.designModel.test;

import gupao_edu.part1.designModel.simpleFactory.CourseFactory;
import gupao_edu.part1.designModel.simpleFactory.ICourse;
import gupao_edu.part1.designModel.simpleFactory.JavaCourse;
import gupao_edu.part1.designModel.simpleFactory.PHPCourse;
import gupao_edu.part1.designModel.simpleFactory.PythonCourse;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现简单工厂类模式
		CourseFactory cf = new CourseFactory();
		ICourse java = cf.factory(JavaCourse.class);
		ICourse python = cf.factory(PythonCourse.class);
		ICourse php = cf.factory(PHPCourse.class);
		java.study();
		python.study();
		php.study();
	}

}
