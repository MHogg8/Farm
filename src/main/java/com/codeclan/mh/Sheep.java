package com.codeclan.mh;

import java.util.ArrayList;

public class Sheep extends Animal {

	public Sheep(){
		type = "Sheep";
		numberOFLegs = 4;
		stock = new Wool();
		ringer = new Baa();
		value = 102;
		stomach = new ArrayList<Food>();
		
	}

}
