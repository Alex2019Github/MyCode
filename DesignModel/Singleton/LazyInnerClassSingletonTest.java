package gupao_edu.part1.designModel.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import gupao_edu.part1.designModel.singleton.LazyInnerClassSingleton;

public class LazyInnerClassSingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> cls = LazyInnerClassSingleton.class;
		try {
			//利用反射机制破坏线程安全机制
			Constructor<?> construt = cls.getDeclaredConstructor();
			construt.setAccessible(true);
			Object obj1 = construt.newInstance();
			Object obj2 = LazyInnerClassSingleton.getInstance();
			System.out.println(obj1 == obj2);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
