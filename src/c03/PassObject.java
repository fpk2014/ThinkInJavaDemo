//:PassObject.java
// Passing objects to methods can be a bit tricky
package c03;

import Prt.Prt;

class Letter{
	char c;
}

public class PassObject {
	static void func(Letter y){
		y.c = 'z';
	}
	
	public static void main(String[] args){
		Letter x = new Letter();
		x.c = 'a';
		Prt.Prt(x.c);
		
		func(x);
		Prt.Prt(x.c);
	}
}
