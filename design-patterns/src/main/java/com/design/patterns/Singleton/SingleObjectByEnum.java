package com.design.patterns.Singleton;

public enum SingleObjectByEnum {
	himself;
	
	public void getSingleObj(){
		System.out.println("success");
	}
	
	public static void main(String[] args) {
		SingleObjectByEnum s = SingleObjectByEnum.himself;
		s.getSingleObj();
	}
}

