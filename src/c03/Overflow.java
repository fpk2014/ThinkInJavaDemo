//:Overflow.java

package c03;

import Prt.Prt;

public class Overflow {
	public static void main(String[] args){
		int big = 0x7fffffff; //max int value
		Prt.Prt(big); //2147483647
		
		int bigger = big * 4;
		Prt.Prt(bigger); //-4
	}
}
