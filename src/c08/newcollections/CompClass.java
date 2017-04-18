package c08.newcollections;

import java.util.Arrays;

import Prt.Prt;

public class CompClass implements Comparable{
	private int i;
	public CompClass(double d) {
		i = (int)d;
	}
	
	public String toString(){
		return i+"";
	}

	@Override
	public int compareTo(Object o) {
		int argi = ((CompClass) o).i;
		return argi==i? 0:(argi <i? -1: 1);
	}

	private static void print(Object[] a) {
		for(int i=0; i<a.length;i++)
			Prt.Prt(a[i]);
	}
	
	public static void main(String[] args){
		CompClass[] a = new CompClass[4];
		
		for(int i=0; i<a.length; i++)
			a[i] = new CompClass((int)(Math.random()*100));
		print(a);
		
		Arrays.sort(a);
		print(a);
	}
	
}
