package com.design.patterns.Singleton;

public class SingleObject {
	private static SingleObject singleObject;
	
	private SingleObject() {
	}
	
	public static SingleObject getSingleObject(){
		if(singleObject == null){
			return getObject();
		}else
			return singleObject;
	}
	
	private synchronized static SingleObject getObject(){
		if(singleObject == null)
			return new SingleObject();
		else
			return singleObject;
	}

}
