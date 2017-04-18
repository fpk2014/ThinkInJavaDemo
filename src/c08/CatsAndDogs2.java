package c08;

import java.util.Enumeration;
//: CatsAndDogs.java
//  Simple collection with Enumeration

import java.util.Vector;


import Prt.Prt;

class Cat2{
	private int value;
	public Cat2(int i) {
		this.value = i;
	}

	public void print() {
		Prt.Prt(this.value);
	}
	
}

public class CatsAndDogs2 {
	public static void main(String[] args){
		Vector cats = new Vector();
		for(int i=0; i<7; i++)
			cats.addElement(new Cat2(i));
		
		Enumeration e = cats.elements();
		while(e.hasMoreElements())
			((Cat2) e.nextElement()).print();
	}
}
