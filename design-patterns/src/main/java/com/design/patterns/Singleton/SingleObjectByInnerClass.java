package com.design.patterns.Singleton;

public class SingleObjectByInnerClass {
	
	private SingleObjectByInnerClass() {
	}
	
	private static class SingletonHolder{
		private static SingleObjectByInnerClass singleObject = new SingleObjectByInnerClass();
	}
	
	public static SingleObjectByInnerClass getSingleObj(){
		return SingletonHolder.singleObject;
	}
}
