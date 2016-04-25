package com.codeclan.mh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFarm {
	
	@Test
	public void testNewFarm(){
		Farm Bist = new Farm("Bist", "Colin Blakeson", 8);
		assertEquals("Bist", Bist.getName());
	}
	@Test
	public void testNewFarmer(){
		Farm Bist = new Farm("Bist", "Colin Blakeson", 8);
		assertEquals("Colin Blakeson", Bist.getFarmer());
	}

	@Test 
	public void testEmptyFarmyard(){
		Farm Bist = new Farm("Bist", "Colin Blakeson", 8);
		assertEquals(0, Bist.getInventory().size());
	}

	
	@Test
	public void testFarmHasAnimals(){
		Farm Bist = new Farm("Bist", "Colin Blakeson", 8);
		Pig Charles = new Pig();
		Sheep Jess = new Sheep();
		Chicken Jim = new Chicken();
		Bist.addAnimal(Jim);
		Bist.addAnimal(Jess);
		Bist.addAnimal(Charles);
		assertEquals(3, Bist.getInventory().size());
	}
	@Test
	public void testFarmCanSellAnimals(){
		Farm Bist = new Farm("Bist", "Colin Blakeson", 8);
		Pig Charles = new Pig();
		Sheep Jess = new Sheep();
		Chicken Jim = new Chicken();
		Bist.addAnimal(Jim);
		Bist.addAnimal(Jess);
		Bist.addAnimal(Charles);
		Bist.sellAnimal(Jim);
		Bist.sellAnimal(Charles);
		assertEquals(1, Bist.getInventory().size());
	}
	@Test
	public void testFarmCanEarnMoneyFromAnimals(){
		Farm Bist = new Farm("Bist", "Colin Blakeson", 8);
		Sheep Charles = new Sheep();
		Chicken Jess = new Chicken();
		Cow Jim = new Cow();
		Bist.addAnimal(Jim);
		Bist.addAnimal(Jess);
		Bist.addAnimal(Charles);
		Bist.sellAnimal(Jess);
		Bist.sellAnimal(Charles);
		Bist.sellAnimal(Jim);
		assertEquals(0, Bist.getInventory().size());
		assertTrue(Bist.getFarmValue()==329);
	}
	@Test
	public void testCropsCanBeAddedToFarm(){
		Farm Bist = new Farm("Bist", "Colin Blakeson", 8);
		Maze maze1 = new Maze();
		Maze maze2 = new Maze();
		Maze maze3 = new Maze();
		Maze maze4 = new Maze();
		Maze maze5 = new Maze();
		Maze maze6 = new Maze();
		Maze maze7 = new Maze();
		Maze maze8 = new Maze();
		Maze maze9 = new Maze();
		Bist.addCrops(maze9);
		Bist.addCrops(maze8);
		Bist.addCrops(maze7);
		Bist.addCrops(maze6);
		Bist.addCrops(maze5);
		Bist.addCrops(maze4);
		Bist.addCrops(maze3);
		Bist.addCrops(maze2);
		Bist.addCrops(maze1);
		assertEquals(9,Bist.getFarmLand().size());
	}
	@Test
	public void testCropsCanBeSold(){
		Farm Bist = new Farm("Bist", "Colin Blakeson", 8);
		Maze maze1 = new Maze();
		Maze maze2 = new Maze();
		Maze maze3 = new Maze();
		Maze maze4 = new Maze();
		Maze maze5 = new Maze();
		Maze maze6 = new Maze();
		Maze maze7 = new Maze();
		Hops hoppy = new Hops();
		Potatoes tatties = new Potatoes();
		Strawberries frais = new Strawberries();
		Bist.addCrops(frais);
		Bist.addCrops(hoppy);
		Bist.addCrops(maze7);
		Bist.addCrops(maze6);
		Bist.addCrops(maze5);
		Bist.addCrops(maze4);
		Bist.addCrops(maze3);
		Bist.addCrops(maze2);
		Bist.addCrops(maze1);
		Bist.addCrops(tatties);
		Bist.sellCrops(maze1);
		Bist.sellCrops(tatties);
		Bist.sellCrops(frais);
		Bist.sellCrops(hoppy);
		assertEquals(6,Bist.getFarmLand().size());
		assertTrue(Bist.getFarmValue()==892);
		
	}


}
