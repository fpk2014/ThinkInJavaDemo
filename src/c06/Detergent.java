//: Detergent.java
//  Inheritance syntax & properties

package c06;

import Prt.Prt;

class Cleanser{
	private String s = "Cleanser";

	public void dilute() {
		append(" dilute() ");
	}

	public void apply() {
		append(" apply() ");
	}

	public void scrub() {
		append(" scrub() ");
	}
	
	public void foam() {
		append(" foam() ");
	}

	public void print() {
		Prt.Prt(s);
	}
	
	public void append(String string) {
		s += string;
	}
	
	public static void main(String[] args){
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.print();
	}
	
}

public class Detergent extends Cleanser {
	public void scrub() {
		append(" Detergent.scrub() ");
		super.scrub();
	}
	
	public static void main(String args[]){
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.print();
		
		Cleanser.main(args);
	}
}
