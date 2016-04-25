package com.codeclan.mh;

import java.util.ArrayList;

public class Farm {

	protected String name;
	protected String farmer;
	protected ArrayList<Crop> farmLand;
	protected ArrayList<Animal> inventory;
	protected double farmValue;
	
	public Farm(String name, String farmer, int fields){
		this.name = name;
		this.farmer = farmer;
		farmLand = new ArrayList<Crop>(fields);
		inventory = new ArrayList<Animal>();
		farmValue = 0;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarmer() {
		return farmer;
	}
	public void setFarmer(String farmer) {
		this.farmer = farmer;
	}

	public ArrayList<Animal> getInventory() {
		return inventory;
	}
	public void setInventory(ArrayList<Animal> inventory) {
		this.inventory = inventory;
	}
	
	public double getFarmValue() {
		return farmValue;
	}
	
	public void setFarmValue(double farmValue) {
		this.farmValue = farmValue;
	}

	public void addAnimal(Animal animal){
		inventory.add(animal);
	}
	
	public void sellAnimal(Animal animal){
		inventory.remove(animal);
		farmValue += animal.value;
	}

	public ArrayList<Crop> getFarmLand() {
		return farmLand;
	}

	public void setFarmLand(ArrayList<Crop> farmLand) {
		this.farmLand = farmLand;
	}
	public void addCrops(Crop crop){
		farmLand.add(crop);
	}
	public void sellCrops(Crop crop){
		farmLand.remove(crop);
		farmValue += crop.harvest();
		
	}
	 
}
