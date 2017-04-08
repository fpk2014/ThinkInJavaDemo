//:TemaryOperator.java

package c03;

import Prt.Prt;

public class TemaryOperator {
	public static void main(String[] args){
		int i = 2;
		i = i < 10 ? i * 100 : i * 10;
		Prt.Prt(i);
	}
}
