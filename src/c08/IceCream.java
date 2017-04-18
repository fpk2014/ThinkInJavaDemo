//: IceCream.java
//  Returning arrays from methods

package c08;

import Prt.Prt;

public class IceCream {
	static String[] flav = {
			"a" , "b"
	};
	
	private static String[] flavorSet(int i) {
		String[] result = new String[i];
		for(int j=0; j<i; j++)
			result[j] = i+"";
		return result;
	}
	
	public static void main(String[] args){
		for(int i=0; i<20; i++){
			String[] f1 = flavorSet(flav.length);
			for(int j=0; j<f1.length; j++)
				Prt.Prt(f1[j]);
		}
	}

}
