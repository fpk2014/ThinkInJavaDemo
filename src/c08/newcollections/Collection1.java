//: Collection1.java
//  Things you can do with all Collections

package c08.newcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import Prt.Prt;

public class Collection1 {
	public static void main(String[] args){
		Collection c = newCollection();
		c.add("ten");
		c.add("eleven");
		print(c);
		
		Object[] array = c.toArray();
		String[] str = (String[]) c.toArray(new String[1]);
		Prt.Prt(Collections.max(c));
		Prt.Prt(Collections.min(c));
	}

	private static void print(Collection c) {
		for(Iterator x = c.iterator() ; x.hasNext();)
			Prt.Prt(x.next());
	}

	private static Collection newCollection() {
		return fill(new ArrayList());
	}

	private static Collection fill(ArrayList arrayList) {
		return fill(arrayList, 0, 10);
	}

	private static Collection 
	fill(ArrayList arrayList, int start, int size) {
		for(int i=start; i<size; i++)
			arrayList.add(i+"");
		return arrayList;
	}
	
}
