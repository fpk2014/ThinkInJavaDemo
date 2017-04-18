//: HamsterMaze.java
//  Using an Enumeration

package c08;

import java.util.Enumeration;
import java.util.Vector;

import Prt.Prt;

class Hamster{
	private int value;
	public Hamster(int i) {
		this.value = i;
	}
	public String toString(){
		return ""+this.value;
	}
}

class Printer{

	public static void printAll(Enumeration elements) {
		while(elements.hasMoreElements())
			Prt.Prt(elements.nextElement().toString());
	}
	
}

public class HamsterMaze {
	public static void main(String[] args){
		Vector v = new Vector();
		for(int i=0; i<3; i++)
			v.addElement(new Hamster(i));
		Printer.printAll(v.elements());
	}
}
