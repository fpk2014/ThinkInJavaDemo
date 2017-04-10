//: TestRandVals.java

package c07;

import Prt.Prt;

// interface have static and final
interface RandVals{
	int rint = 1;
	long rlong = 2;
}

public class TestRandVals {
	public static void main(String[] args){
		Prt.Prt(RandVals.rint);
		Prt.Prt(RandVals.rlong);
	}
}
