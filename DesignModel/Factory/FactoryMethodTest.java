package gupao_edu.part1.designModel.test;

import gupao_edu.part1.designModel.factoryMethod.ICourseFactory;
import gupao_edu.part1.designModel.factoryMethod.JavaFactory;
import gupao_edu.part1.designModel.factoryMethod.PHPFactory;
import gupao_edu.part1.designModel.factoryMethod.PythonFactory;
import gupao_edu.part1.designModel.simpleFactory.ICourse;

public class FactoryMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICourseFactory factory1 = new JavaFactory();
		ICourseFactory factory2 = new PHPFactory();
		ICourseFactory factory3 = new PythonFactory();
		ICourse course1 = factory1.create();
		ICourse course2 = factory2.create();
		ICourse course3 = factory3.create();
		course1.study();
		course2.study();
		course3.study();
	}

}
