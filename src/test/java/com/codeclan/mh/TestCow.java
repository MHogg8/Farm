package com.codeclan.mh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCow {

	@Test
	public void testType(){
		Cow Henry = new Cow();
		assertEquals("Cow", Henry.getType());
	}
	@Test
	public void testNumberOfLegs(){
		Cow Henry = new Cow();
		assertEquals(4, Henry.getNumberOFLegs());
	}
	@Test
	public void testAnimalNoise(){
		Cow Henry = new Cow();
		assertEquals("MOOOO!", Henry.animalNoise());
	}
	@Test
	public void testAnimalStock(){
		Cow Henry = new Cow();
		assertEquals("Milk!", Henry.animalStock());
	}
	@Test
	public void testStomachEmpty(){
		Cow Henry = new Cow();
		assertEquals(0, Henry.getStomach().size());
	}
	
	@Test
	public void testAnimalCanEat(){
		Cow Henry = new Cow();
		Silage Grass = new Silage();
		Henry.eatFood(Grass);
		assertEquals(1, Henry.getStomach().size());
	}
}
