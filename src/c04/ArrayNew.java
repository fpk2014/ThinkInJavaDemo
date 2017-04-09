//: ArrayNew.java
//  Creating arrays with new

package c04;

import java.util.Random;

import Prt.Prt;

public class ArrayNew {
	static int pRand(int mod){
		return Math.abs(new Random().nextInt())%mod + 1;
	}
	
	
	public static void main(String[] args){
		int[] a;
		a = new int[pRand(20)];
		for(int i=0; i<a.length; i++)
			Prt.Prt(a[i]);
	}
}
