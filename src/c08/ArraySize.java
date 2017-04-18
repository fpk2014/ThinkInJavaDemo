//: ArraySize.java
//  Initialization & re-assignment of arrays

package c08;

import Prt.Prt;

class Weeble{}

public class ArraySize {
	public static void main(String[] args){
		Weeble[] a;
		Weeble[] b = new Weeble[5];
		Weeble[] c = new Weeble[4];
		for(int i=0; i<c.length; i++)
			c[i] = new Weeble();
		
		Weeble[] d ={
				new Weeble(),new Weeble()
		};
		
		//! b.length;
		a = d;
		a = new Weeble[]{
				new Weeble()
		};
		Prt.Prt(a.length);
	}
}
