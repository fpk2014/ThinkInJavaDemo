//: Arrays.java
//  Arrays of primitives

package c04;

import Prt.Prt;

public class Arrays {
	public static void main(String[] args){
		int[] a1 = {1, 2, 3};
		for(int i=0; i<a1.length; i++)
			Prt.Prt(a1[i]);
		
		Integer[] a2 = new Integer[]{
			new Integer(4),
			new Integer(5),
			new Integer(6),
		};
		for(int i=0; i<a2.length; i++)
			Prt.Prt(a2[i]);
		
		Integer[] a3 = {
			new Integer(1),
			new Integer(2),
			new Integer(3),
		};
		
		Integer[] a4 = new Integer[3];
		a4[0] = 1;a4[1] = 2;a4[2] = 3;
		
		int[] b = new int[]{1,2,3};
		
	}
}
