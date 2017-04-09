//: MultiDimArray.java
//  Creating multidimensional arrays.

package c04;

import Prt.Prt;

public class MultiDimArray {
	public static void main(String[] args){
		int[][] a1 = {
				{
					1,2,3,
				},
				{
					4,5,6,
				},
		};
		for(int i=0; i<a1.length; i++)
			for(int j=0; j<a1[i].length; j++)
				Prt.Prt(a1[i][j]);
	}
}
