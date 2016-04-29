package com.design.patterns.builder;

import org.junit.Test;

public class BuilderPattern {


	@Test
	public void TestBuild() {
		DoDoContact contact = new DoDoContact.Builder("lukuan").age(25).sefeID(001).address("beijing").builder();
		
		System.out.println(contact.toString());
	}
}

