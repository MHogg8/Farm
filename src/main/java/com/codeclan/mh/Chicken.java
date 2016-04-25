package com.codeclan.mh;

import java.util.ArrayList;

public class Chicken extends Animal {
	
	public Chicken(){
		type = "Chicken";
		numberOFLegs = 2;
		stock = new Egg();
		ringer = new Cluck();
		stomach = new ArrayList<Food>();
		value = 23;
		
	}

}
