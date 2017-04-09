//: Beetle.java
//  The full process of initialization

package c06;

import Prt.Prt;

class Insect{
	Insect(){
		Prt.Prt("Insert constructor");
	}
	static int x1 = prt("Insect.x1");
	static int prt(String s){
		Prt.Prt(s);
		return 63;
	}
}

public class Beetle extends Insect{
	Beetle(){
		Prt.Prt("Beetle constructor");
	}
	static int x2 = prt("Beetle.x2");
	static int prt(String s){
		Prt.Prt(s);
		return 63;
	}
	public static void main(String[] args){
		Prt.Prt("Beetle");
		new Beetle();
	}
}
