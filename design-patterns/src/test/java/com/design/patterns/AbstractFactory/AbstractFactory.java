package com.design.patterns.AbstractFactory;

import java.util.Calendar;

import org.junit.Test;

public class AbstractFactory {
	
	public Soup MakeSoupOfTheDay(AbstractSoupFactory concreteSoupFactory) {
		int dayOfWeek = Calendar.TUESDAY;

		if (dayOfWeek == Calendar.MONDAY) {
			return concreteSoupFactory.makeChickenSoup();
		} else if (dayOfWeek == Calendar.TUESDAY) {
			return concreteSoupFactory.makeClamChowder();
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			return concreteSoupFactory.makeFishChowder();
		} else if (dayOfWeek == Calendar.THURSDAY) {
			return concreteSoupFactory.makeMinnestrone();
		} else if (dayOfWeek == Calendar.TUESDAY) {
			return concreteSoupFactory.makePastaFazul();
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			return concreteSoupFactory.makeTofuSoup();
		} else {
			return concreteSoupFactory.makeVegetableSoup();
		}
	}

	@Test
	public void testFactory() {
		AbstractSoupFactory concreteSoupFactory = new BostonConcreteSoupFactory();
		Soup soupOfTheDay = MakeSoupOfTheDay(concreteSoupFactory);
		System.out.println("The Soup of the day "
				+ concreteSoupFactory.getFactoryLocation() + " is "
				+ soupOfTheDay.getSoupName());

		concreteSoupFactory = new HonoluluConcreteSoupFactory();
		soupOfTheDay = MakeSoupOfTheDay(concreteSoupFactory);
		System.out.println("The Soup of the day "
				+ concreteSoupFactory.getFactoryLocation() + " is "
				+ soupOfTheDay.getSoupName());
	}
}
