package c08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import Prt.Prt;

public class ListPerformance {
	private static final int REPS = 100;
	private static abstract class Tester{
		String name;
		int size;
		Tester(String name, int size){
			this.name = name;
			this.size = size;
		}
		abstract void test(List a);
	}
	
	private static Tester[] tests = {
			new Tester("get", 300){
				void test(List a){
					for(int i=0; i<REPS; i++)
						for(int j=0; j<a.size(); j++)
							a.get(j);
				}
			},
			new Tester("iteration", 300){
				void test(List a){
					for(int i=0; i<REPS; i++){
						Iterator it = a.iterator();
						while(it.hasNext())
							it.next();
					}
				}
			},
			new Tester("insert", 1000){
				void test(List a){
					int half = a.size()/2;
					String s = "test";
					ListIterator it = a.listIterator(half);
					for(int i=0; i<size*10; i++)
						it.add(s);
				}
			},
			new Tester("remove", 5000){
				void test(List a){
					ListIterator it = a.listIterator(3);
					while(it.hasNext()){
						it.next();
						it.remove();
					}
				}
			},
	};
	

	private static void test(List a) {
		for(int i=0; i<tests.length; i++){
			setFill(a, tests[i].name);
			Prt.Prt(tests[i].name);
			
			long t1 = System.currentTimeMillis();
			tests[i].test(a);
			long t2 = System.currentTimeMillis();
			Prt.Prt(t2-t1);
		}
	}
		
	
	
	private static void setFill(Collection c, String name) {
		for(int i = 0; i < 10; i++)
			c.add(name);		
	}
	public static void main(String[] args){
		test(new ArrayList());
		
		Prt.Prt("\nother\n");
		test(new LinkedList());
	}

}
