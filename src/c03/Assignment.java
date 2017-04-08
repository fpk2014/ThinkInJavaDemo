//:Assignment.java
// Assignment with objects is a bit tricky

package c03;

import Prt.Prt;

class Number{
	int i;
}

public class Assignment {
	public static void main(String[] args){
		Number n1 = new Number();
		Number n2 = new Number();
		n1.i = 9;
		n2.i = 7;
		Prt.Prt(n1.i + " " + n2.i);
		
		//n2句柄实际上已经丢失
		n1 = n2;
		Prt.Prt(n1.i + " " + n2.i);
		
		n1.i = 97;
		Prt.Prt(n1.i + " " + n2.i);
	}
}///:~
