//: Enumerators2.java

package c08;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import Prt.Prt;

class Mouse2{

	public Mouse2(int i) {
		// TODO Auto-generated constructor stub
	}
	
}

class Hamster2{
	int value;
	public Hamster2(int i) {
		value = i;
	}
	
}

class PrintData{

	public static void print(Enumeration elements) {
		while(elements.hasMoreElements())
			Prt.Prt(elements.nextElement().toString());
	}
	
}

public class Enumerators2 {
	public static void main(String[] args){
		Vector v = new Vector();
		for(int i=0; i<5; i++)
			v.addElement(new Mouse2(i));
		
		Hashtable h = new Hashtable();
		for(int i=0; i<5; i++)
			h.put(new Integer(i), new Hamster2(i));
	
		Prt.Prt(v.elements());
		PrintData.print(h.elements());
	}
}
