//: Cartoon.java
//  Constructor calls during inheritance

package c06;

import Prt.Prt;

class Art{
	Art(){
		Prt.Prt("Art");
	}
}

class Drawing extends Art{
	Drawing(){
		Prt.Prt("Drawing");
	}
}

public class Cartoon extends Drawing {
	Cartoon(){
		Prt.Prt("Cartoon");
	}
	public static void main(String[] args){
		new Cartoon();
	}
}
