//: GopherVector.java
//  A type-conscious Vector

package c08;

import java.util.Vector;

import Prt.Prt;

class Gopher{
	private int value;
	public Gopher(int i) {
		this.value = i;
	}

	public void print() {
		Prt.Prt(this.value);
	}
	
}

class GopherTrap{

	public static void caugetYa(Gopher elementAt) {
		elementAt.print();
	}
	
}

public class GopherVector {
	private Vector v = new Vector();
	
	public static void main(String[] args){
		GopherVector gophers = new GopherVector();
		for(int i=0; i<3; i++)
			gophers.addElement(new Gopher(i));
		for(int i=0; i<gophers.size(); i++)
			GopherTrap.caugetYa(gophers.elementAt(i));
	}

	private Gopher elementAt(int i) {
		// TODO Auto-generated method stub
		return (Gopher) v.elementAt(i);
	}

	private int size() {
		return v.size();
	}

	private void addElement(Gopher gopher) {
		v.addElement(gopher);
	}
}
