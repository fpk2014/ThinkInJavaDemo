//: Bits.java
//  Demonstration of BitSet

package c08;

import java.util.BitSet;
import java.util.Random;

import Prt.Prt;

public class Bits {
	public static void main(String[] args){
		Random rand = new Random();
		byte bt = (byte) rand.nextInt();
		BitSet bs = new BitSet();
		for(int i=7; i>=0; i--)
			if(((1<<i) & bt) != 0)
				bs.set(i);
			else
				bs.clear(i);
		Prt.Prt(bt);
		printBitSet(bs);
		
		BitSet b127 = new BitSet();
		b127.set(127);
		printBitSet(b127);
	}

	private static void printBitSet(BitSet bs) {
		Prt.Prt(bs);
		String s = new String();
		for(int i=0; i<bs.size(); i++)
			s += (bs.get(i) ? "1" : "0");
		Prt.Prt(s);
	}
}
