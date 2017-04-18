//: SimpleCollection.java
//  A simple example using the new Collections

package c08;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import Prt.Prt;

public class SimpleCollection {
	public static void main(String[] args){
		Collection c = new ArrayList();
		for(int i=0; i<10; i++)
			c.add(i+"");
		
		Iterator it = (Iterator) c.iterator();
		while(it.hasNext())
			Prt.Prt(it.next());
	}
}
