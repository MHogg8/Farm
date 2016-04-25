package com.codeclan.mh;

import java.util.ArrayList;

public class Cow extends Animal{

	public Cow(){
		type = "Cow";
		numberOFLegs = 4;
		ringer = new Moo();
		stock = new Milk();
		stomach = new ArrayList<Food>();
		value = 204;
	}
}
