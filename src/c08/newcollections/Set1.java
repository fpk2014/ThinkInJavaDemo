package c08.newcollections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Prt.Prt;

public class Set1 {
	public static void main(String[] args){
		testVisual(new HashSet());
		
		testVisual(new TreeSet());
	}

	private static void testVisual(Set a) {
		setFill(a);
		setFill(a);
		print(a);  //No duplicates
		
		a.addAll(a);
		a.add("one");
		print(a);
		Prt.Prt(a.contains("one"));
	}
	
	public static Collection setFill(Collection c, int start, int size) {
		for(int i = start; i < start + size; i++)
			c.add(Integer.toString(i));
		return c;
	}
	public static Collection setFill(Collection c, int size) {
		return setFill(c, 0, size);
	}
	public static Collection setFill(Collection c) {
		return setFill(c, 0, 10);
	}
	
	private static void print(Collection c) {
		for(Iterator x = c.iterator(); x.hasNext();)
			Prt.Prt(x.next()+" ");
	}
}
