//: Sandwich.java
//  Order of constructor calls

package c07;

import Prt.Prt;

class Lunch{
	Lunch(){
		Prt.Prt("Lunch()");
	}
}

class PortableLunch extends Lunch{
	PortableLunch(){
		Prt.Prt("PortableLunch()");
	}
}

class Bread{
	Bread(){
		Prt.Prt("Bread()");
	}
}


public class Sandwich extends PortableLunch{
	Bread b = new Bread();
	
	Sandwich(){
		Prt.Prt("Sandwich()");
	}
	public static void main(String[] args){
		new Sandwich();
	}
}
