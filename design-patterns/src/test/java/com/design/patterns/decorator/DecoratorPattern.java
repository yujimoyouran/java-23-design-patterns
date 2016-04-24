package com.design.patterns.decorator;

import org.junit.Test;

public class DecoratorPattern {

	@Test
	public void testDecorator() {
		Tea teaLeaves = new TeaLeaves();
		Tea chaiDecorator = new ChaiDecorator(teaLeaves);
		chaiDecorator.steepTea();
	}
}
