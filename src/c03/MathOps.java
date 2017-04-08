//:MathOps.java
// Demonstrate the mathematical operators
package c03;

import java.util.Random;

import Prt.Prt;

public class MathOps {
	public static void main(String[] args){
		int j, k;
		Random rand = new Random();
		
		j = rand.nextInt() % 100;
		k = rand.nextInt() % 100;
		Prt.Prt(j + " " + k);
		Prt.Prt(j/k); //»°…Ã
		Prt.Prt(j%k); //»°”‡
		
		float u, v;
		u = rand.nextFloat();
		v = rand.nextFloat();
		Prt.Prt(u + " " + v);
		Prt.Prt(u/v);
	}
}
