//: ExplicitStatic.java
//  Explicit static initialzation
//  with the "static" clause

package c04;

import Prt.Prt;

class Cup{

	public void f(int i) {
		Prt.Prt(i);
	}
	
}

class Cups{

	static Cup c1;
	static {
		c1 = new Cup();
	}
	
	Cups(){
		Prt.Prt("Cups()");
	}
}

public class ExplicitStatic {
	static Cups x = new Cups();
	static Cups y = new Cups();
	
	public static void main(String[] args){
		Cups.c1.f(99);
	}
}
