package gupao_edu.part1.designModel.simpleFactory;

public class CourseFactory {
	
	public ICourse factory(Class cls){
		try {
			if(null != cls){
				return (ICourse)cls.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
