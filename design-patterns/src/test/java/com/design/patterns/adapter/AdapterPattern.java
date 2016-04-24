package com.design.patterns.adapter;

import org.junit.Test;

public class AdapterPattern {

	@Test
	public void testAdaptern() {
		TeaCup teaCup = new TeaCup();

		System.out.println("Steeping tea bag");
		TeaBag teaBag = new TeaBag();
		teaCup.steepTeaBag(teaBag);

		System.out.println("Steeping loose leaf tea");
		LooseLeafTea looseLeafTea = new LooseLeafTea();
		TeaBall teaBall = new TeaBall(looseLeafTea);
		teaCup.steepTeaBag(teaBall);
	}
}
