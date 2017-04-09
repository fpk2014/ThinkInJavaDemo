//: OverloadingOrder.java
//  Overloading based on the order of
//  the arguments

package c04;

import Prt.Prt;

public class OverloadingOrder {
	static void print(String s, int i){
		Prt.Prt(s + " " + i);
	}
	static void pring(int i, String s){
		Prt.Prt(i + " " + s);
	}
	public static void main(String[] args){
		print("String first", 11);
		pring(99, "Int first");
	}
}
