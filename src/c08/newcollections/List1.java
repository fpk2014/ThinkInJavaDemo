package c08.newcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import Prt.Prt;

public class List1 {
	private static boolean b;
	private static Object o;
	private static int i;
	private static Iterator it;
	private static Iterator lit;
	
	public static void main(String[] args){
		basicTest(fill(new ArrayList()));
		
		iterMotion(fill(new ArrayList()));
		
		iterManipulation(fill(new ArrayList()));
		
		testVisual(fill(new LinkedList()));
		
		testLinkedList();
		
	}

	private static void testLinkedList() {
		// TODO Auto-generated method stub
		
	}

	private static void testVisual(List a) {
		print(a);
		List b = new ArrayList();
		System.out.print("b = ");
		print(b);
		a.addAll(b);
		a.addAll(fill(new ArrayList()));
		System.out.print("a = ");
		print(a);
	}
	

	private static void print(Collection c) {
		for(Iterator x = c.iterator(); x.hasNext();)
			Prt.Prt(x.next()+" ");
	}

	private static void iterManipulation(List a) {
		ListIterator it = a.listIterator();
		it.add("47");
		it.next();
		it.remove();
		it.next();
		it.set("47");
	}

	private static void iterMotion(List a) {
		ListIterator it = a.listIterator();
		b = it.hasNext();
		b = it.hasPrevious();
		o = it.next();
		i = it.nextIndex();
		o = it.previous();
		i = it.previousIndex();
	}

	private static void basicTest(List a) {
		a.add(1, "x"); //add at first
		a.add("x"); //add at end
		
		a.addAll(fill(new ArrayList())); //addd a collection
		a.addAll(3, fill(new ArrayList()));
		
		b = a.contains("1"); // Is it in there?
		b = a.containsAll(new ArrayList());
		b = a.isEmpty(); //Any Elements inside>
		
		o = a.get(1); //Get object at locatio 1
		i = a.indexOf("1"); //Tell the index of object
		i = a.lastIndexOf("1"); //Last match
		//i = a.lastIndexOf("1", 2); // ...after loc 2
		
		it = a.iterator();  //ordinary Iterator
		lit = a.listIterator();  //ListIterator
		lit = a.listIterator(3);  //start at location 3
		
		a.remove(1); 
		a.remove("3");
		a.set(1,  "y"); // set location 1 to "y"
		a.retainAll(fill(new ArrayList()));
		//a.removeRange(0, 2);
		a.removeAll(fill(new ArrayList()));
		
		i = a.size();
		a.clear(); //remove all
	}

	private static List fill(List a) {
		return (List) listFill(a);
	}
	
	public static Collection listFill(Collection c, int start, int size) {
		for(int i = start; i < start + size; i++)
			c.add(Integer.toString(i));
		return c;
	}
	public static Collection listFill(Collection c, int size) {
		return listFill(c, 0, size);
	}
	public static Collection listFill(Collection c) {
		return listFill(c, 0, 10);
	}
}
