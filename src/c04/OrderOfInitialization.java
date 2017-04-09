//: OrderOfInitialization.java
//  Demonstrates initialization order

package c04;

import Prt.Prt;

class Tag{
	Tag(int marker){
		Prt.Prt(marker);
	}
}

class Card{
	Tag t1 = new Tag(1);
	Tag t2 = new Tag(2);
	Tag t3 = new Tag(3);
	
	Card(){
		t3 = new Tag(33);
	}
	
	void f(){
		Prt.Prt("f();");
	}
}

public class OrderOfInitialization {
	public static void main(String[] args){
		Card c = new Card();
		c.f();
	}
}
