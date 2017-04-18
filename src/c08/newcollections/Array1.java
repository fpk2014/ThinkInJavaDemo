package c08.newcollections;

import java.util.Arrays;
import java.util.Random;

import Prt.Prt;

public class Array1 {
	static Random r = new Random();
	public static void main(String[] args){
		byte[] b = new byte[15];
		r.nextBytes(b);
		//print(b);
		
		Arrays.sort(b);
		//print(b);
		
		int loc = Arrays.binarySearch(b, b[10]);
		Prt.Prt(loc);
		
		String[] s = randString(4, 10);
		//print(s);
		loc = Arrays.binarySearch(s, s[4]);
		Prt.Prt(loc);
	}
	
	public static String[] randString(int length, int size) {
		String[] s = new String[size];
		for(int i=0; i<size; i++)
			s[i] = randString(length);
		return s;
	}

	static String ssource =
			"ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
			"abcdefghijklmnopqrstuvwxyz";
	static char[] src = ssource.toCharArray();
	public static String randString(int length) {
		char[] buf = new char[length];
		int rnd;
		for(int i=0; i<length; i++){
			rnd = Math.abs(r.nextInt())% src.length;
			buf[i] = src[rnd];
		}
		return new String(buf);
	}

	static void print(Object[] b){
		for(int i=0; i<b.length;)
			Prt.Prt(b[i++]);
	}
}
