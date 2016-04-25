package com.codeclan.mh;

import java.util.ArrayList;

public class Pig extends Animal{
	
	public Pig(){
		type = "Pig";
		numberOFLegs = 4;
		ringer = new Grunt();
		stock = new Sausages();
		stomach = new ArrayList<Food>();
	}

}
