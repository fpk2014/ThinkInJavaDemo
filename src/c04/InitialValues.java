//: InitialValues.java
//  show defaulst initial values

package c04;

import Prt.Prt;

class Measurement{
	boolean t;
	char c; //null
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	void print(){
		Prt.Prt("Data type Inital value:\n" +
				"boolean " + t + "\n" +
				"char " + c + "\n" +
				"byte " + b + "\n" +
				"short " + s + "\n" +
				"int " + i + "\n" +
				"long " + l + "\n" +
				"float " + f + "\n" +
				"double " + d);
	}
}

public class InitialValues {
	public static void main(String[] args){
		int i; 
		//! Prt.Prt(i) //will error
		new Measurement().print();
	}
}
