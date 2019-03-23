package gupao_edu.part1.designModel.abstractFactory;

public class JavaTypeFactory implements ICourseFactory{

	@Override
	public ISource resource() {
		return new Source();
	}

	@Override
	public INotes notes() {
		return new Notes();
	}

	@Override
	public IVideo video() {
		return new Video();
	}


}
