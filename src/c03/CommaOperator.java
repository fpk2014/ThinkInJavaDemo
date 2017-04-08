//:CommaOperator.java

package c03;

import Prt.Prt;

public class CommaOperator {
	public static void main(String[] args){
		for(int i=1, j=i+10; i<5; i++, j = i*2)
			Prt.Prt(i+" "+j);
	}
}
