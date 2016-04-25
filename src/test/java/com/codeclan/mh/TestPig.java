package com.codeclan.mh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPig {
	
	@Test
	public void testType(){
		Pig Charlie  = new Pig();
		assertEquals("Pig", Charlie.getType());
	}
	@Test
	public void testLegs(){
		Pig Charlie = new Pig();
		assertEquals(4, Charlie.getNumberOFLegs());
	}
	@Test
	public void testNoise(){
		Pig Charlie = new Pig();
		assertEquals("GRUNTT!", Charlie.animalNoise());
	}
	@Test
	public void testStockType(){
		Pig Charlie = new Pig();
		assertEquals("Sausages", Charlie.animalStock());
	}
	@Test
	public void testStomachEmpty(){
		Pig Charlie = new Pig();
		assertEquals(0, Charlie.getStomach().size());
	}
	
	@Test
	public void testAnimalCanEat(){
		Pig Charlie = new Pig();
		Corn GGiant = new Corn();
		Charlie.eatFood(GGiant);
		assertEquals(1, Charlie.getStomach().size());
	}

}
