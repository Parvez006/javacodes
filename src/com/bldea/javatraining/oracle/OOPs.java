package com.bldea.javatraining.oracle;

public class OOPs {
	public static void main(String args[]) {
		Pen p1 = new Pen(); //created a pen object p1 in heap memory
		p1.setColor("Blue");
		System.out.println(p1.color);
		p1.setTipsize(5);
		System.out.println(p1.Tipsize);
	}

}

class Pen{
	//Properties
	String color;
	int Tipsize;
	
	//Functions
	void setColor(String newcolor) {
		color = newcolor;
	}
	void setTipsize(int newTipsize) {
		Tipsize = newTipsize;
	}
}
