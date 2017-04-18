//: CatsAndDogs.java
//  Simple collection example(Vector)

package c08;

import java.util.Vector;

import Prt.Prt;

class Cat{
	private int val;
	public Cat(int i) {
		val = i;
	}

	public void print() {
		Prt.Prt(val);
	}
}

class Dog{
	private int val;
	public Dog(int i) {
		val = i;
	}

	public void print() {
		Prt.Prt(val);
	}
}

public class CatsAndDogs {
	public static void main(String[] args){
		Vector cats = new Vector();
		for(int i=0; i<7; i++)
			cats.addElement(new Cat(i));
		
		cats.addElement(new Dog(7));
		
		for(int i=0; i<cats.size(); i++)
			((Cat) cats.elementAt(i)).print();
	}
}
