//: ArrayClassObj.java
//  Creating an array of non-primitive objects

package c04;

import java.util.Random;

import Prt.Prt;

public class ArrayClassObj {
	static int pRand(int mod){
		return Math.abs(new Random().nextInt()%mod+1);
	}
	public static void main(String[] args){
		Integer[] a = new Integer[pRand(20)];
		for(int i=0; i<a.length; i++){
			a[i] = new Integer(pRand(500));
			Prt.Prt(a[i]);
		}
	}
}
