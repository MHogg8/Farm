package com.codeclan.mh;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSheep {
	@Test
	public void testType(){
		Sheep Gerald = new Sheep();
		assertEquals("Sheep", Gerald.getType());
	}
	@Test
	public void testNumberOfLegs(){
		Sheep Gerald = new Sheep();
		assertEquals(4, Gerald.getNumberOFLegs());
	}
	@Test
	public void testAnimalNoise(){
		Sheep Gerald = new Sheep();
		assertEquals("BAA!", Gerald.animalNoise());
	}
	@Test
	public void testAnimalStock(){
		Sheep Gerald = new Sheep();
		assertEquals("Wool", Gerald.animalStock());
	}
	
	@Test
	public void testStomachEmpty(){
		Sheep Gerald = new Sheep();
		assertEquals(0, Gerald.getStomach().size());
	}
	
	@Test
	public void testAnimalCanEat(){
		Sheep Gerald = new Sheep();
		Silage Grass = new Silage();
		Gerald.eatFood(Grass);
		assertEquals(1, Gerald.getStomach().size());
	}
}
