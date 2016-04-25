package com.codeclan.mh;

import java.util.ArrayList;

public abstract class Animal {

		protected String type;
		protected int numberOFLegs;
		protected Ringable ringer;
		protected Stock stock;
		protected double value;
		protected ArrayList<Food> stomach;
		
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getNumberOFLegs() {
			return numberOFLegs;
		}
		public void setNumberOFLegs(int numberOFLegs) {
			this.numberOFLegs = numberOFLegs;
		}
		public Ringable getRinger() {
			return ringer;
		}
		public void setRinger(Ringable ringer) {
			this.ringer = ringer;
		}
		public Stock getStock() {
			return stock;
		}
		public void setStock(Stock stock) {
			this.stock = stock;
		}
		public ArrayList<Food> getStomach() {
			return stomach;
		}
		public void setStomach(ArrayList<Food> stomach) {
			this.stomach = stomach;
		}
	
		public String animalNoise(){
			return ringer.makeSound();
		}
		public String animalStock(){
			return stock.stockType();
		}
		public void eatFood(Food food){
			stomach.add(food);
		}
		
	
}
