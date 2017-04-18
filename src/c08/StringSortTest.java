//: StringSortTest.java
//  Testing the generic sorting Vector

package c08;

import java.util.Enumeration;

import Prt.Prt;

public class StringSortTest {
	static class StringCompare implements Compare{

		@Override
		public boolean lessThan(Object l, Object r) {
			return ((String)l).toLowerCase().compareTo(
					((String)r).toLowerCase()) < 0;
		}

		@Override
		public boolean lessThanOrEqual(Object l, Object r) {
			return ((String)l).toLowerCase().compareTo(
					((String)r).toLowerCase()) <= 0;
		}
		
	}
	public static void main(String[] args){
		SortVector sv = new SortVector(
				new StringCompare()){
			{
				addElement("d");
				addElement("A");
				addElement("C");
				addElement("c");
				addElement("b");
				addElement("B");
				addElement("D");
				addElement("a");
				sort();
			}
		};
		
		Enumeration e = sv.elements();
		while(e.hasMoreElements())
			Prt.Prt(e.nextElement());
	}
}
