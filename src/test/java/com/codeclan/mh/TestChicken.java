package com.codeclan.mh;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestChicken {
	@Test
	public void testType(){
		Chicken Colin = new Chicken();
		assertEquals("Chicken", Colin.getType());
	}
	@Test
	public void testNumberOfLegs(){
		Chicken Colin = new Chicken();
		assertEquals(2, Colin.getNumberOFLegs());
	}
	@Test
	public void testAnimalNoise(){
		Chicken Colin = new Chicken();
		assertEquals("Cluck!", Colin.animalNoise());
	}
	@Test
	public void testAnimalStock(){
		Chicken Colin = new Chicken();
		assertEquals("Egg", Colin.animalStock());
	}
	@Test
	public void testAnimalCanEat(){
		Chicken Colin = new Chicken();
		Corn GGiant = new Corn();
		Colin.eatFood(GGiant);
		assertEquals(1, Colin.getStomach().size());
		
	}

}
