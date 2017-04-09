//: Hide.java

package c06;

import Prt.Prt;

class Homer{
	void doh(int i){
		Prt.Prt("doh(int)");
	}
	void doh(char i){
		Prt.Prt("doh(char)");
	}
	void doh(float i){
		Prt.Prt("doh(float)");
	}
}

class Bart extends Homer{
	void doh(MilHouse i){
		Prt.Prt("doh(MilHouse)");
	}
}

class MilHouse{
	
}

public class Hide {
	public static void main(String[] args){
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new MilHouse());
	}
}
