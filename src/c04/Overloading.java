//: Overloading.java
//  Demonstration of both constructor
//  and ordinary method overloading

package c04;

import Prt.Prt;

class Tree{
	private int height;
	Tree(){
		Prt.Prt("Planting a seedling");
		this.height = 0;
	}
	
	Tree(int i){
		Prt.Prt("Creating new That is " + i +
				" feet tall");
		this.height = i;
	}
	
	void info(){
		Prt.Prt("Tree is " + this.height +
				" feet tall");
	}
	void info(String s){
		Prt.Prt("say : " + s);
	}
}

public class Overloading {
	public static void main(String[] args){
		for(int i=0; i<5; i++){
			Tree t = new Tree(i);
			t.info();
			t.info("overload method");
		}
		new Tree();
	}
}
