package com.design.patterns.facade;

import org.junit.Test;

public class FacadePattern {
	
	@Test
	public void testFacade() {
		FacadeCuppaMaker cuppaMaker = new FacadeCuppaMaker();
		FacadeTeaCup teaCup = cuppaMaker.makeACuppa();
		System.out.println(teaCup);
	}
}
