//: StaticInitialzation.java
//  Specifying initial values in a
//  class definition

package c04;

import Prt.Prt;

class Bowl{

	public Bowl(int i) {
		Prt.Prt("Bowl(i) i= " + i);
	}

	public void f(int i) {
		Prt.Prt("Bowl.f(i) i= " + i);
	}
	
	
	
}

class Table{
	static Bowl b1 = new Bowl(1);
	static Bowl b2 = new Bowl(2);
	public void f2(int i) {
		Prt.Prt("Table.f2(i) i= " + i);
	}
	
	Table(){
		b2.f(1);
	}
}

class Cupboard{
	Bowl b3 = new Bowl(3);
	static Bowl b4 = new Bowl(4);
	static Bowl b5 = new Bowl(5);
	public void f3(int i) {
		Prt.Prt("Cupboard.f3(i) i= " + i);
	}
	
	Cupboard(){
		b4.f(2);
	}
}

public class StaticInitialzation {
	static Table t2 = new Table();
	static Cupboard t3 = new Cupboard();
	public static void main(String[] args){
		new Cupboard();
		new Cupboard();
		
		t2.f2(1);
		t3.f3(1);
	}
}
