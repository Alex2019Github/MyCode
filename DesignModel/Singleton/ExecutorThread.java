package gupao_edu.part1.designModel.test;

import gupao_edu.part1.designModel.singleton.RegisterContainerSingleton;

public class ExecutorThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Object rcs = RegisterContainerSingleton.getBean("gupao_edu.part1.designModel.singleton.RegisterContainerSingleton");
		System.out.println(Thread.currentThread().getName() + ": " + rcs);
	}

}
