//: Leaf.java
//  Simple use of the "this" keyword

package c04;

import Prt.Prt;

public class Leaf {
	private int i = 0;
	Leaf increment(){
		i++;
		return this;
	}
	void print(){
		Prt.Prt("i = " + i);
	}
	
	public static void main(String[] args){
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}
}
