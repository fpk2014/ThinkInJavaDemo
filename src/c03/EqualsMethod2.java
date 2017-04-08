//: EqualsMethod2.java
package c03;

import Prt.Prt;

class Value{
	int i;
}

public class EqualsMethod2 {
	public static void main(String[] args){
		Value v1 = new Value();
		Value v2 = new Value();
		v1.i = v2.i = 100;
		Prt.Prt(v1.equals(v2));  // will be return false;
	}
}
