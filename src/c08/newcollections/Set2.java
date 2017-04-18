package c08.newcollections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import Prt.Prt;

class MyType implements Comparable{
	int i;
	public MyType(int i) {
		this.i = i;
	}

	@Override
	public int compareTo(Object o) {
		int i2 = ((MyType) o).i;
		return (i2<i? -1 : (i2 == i ? 0 : 1));
	}
	
}

public class Set2 {

	public static void main(String[] args){
		test(new HashSet());
		
		test(new TreeSet());
	}

	private static void test(Set a) {
		fill(a);
		
		a.addAll(fill(new TreeSet()));
		Prt.Prt(a);
	}
	
	private static Set fill(Set a) {
		return fill(a, 2);
	}

	private static Set fill(Set a, int size) {
		for(int i=0; i<size; i++){
			a.add(new MyType(i));
		}
		return a;
	}

	private static void print(Collection c) {
		for(Iterator x = c.iterator(); x.hasNext();)
			Prt.Prt(x.next()+" ");
	}
}
