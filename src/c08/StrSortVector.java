//: StrSortVector.java
//  Automatically sorted Vector that
//  accepts and produces only Strings

package c08;

import java.util.Enumeration;

import Prt.Prt;

public class StrSortVector {
	private boolean sorted = false;
	private SortVector v = new SortVector(
			new Compare(){
				public boolean
				lessThan(Object l, Object r) {
				return
				((String)l).toLowerCase().compareTo(
				((String)r).toLowerCase()) < 0;
				}
				public boolean
				lessThanOrEqual(Object l, Object r) {
				return
				((String)l).toLowerCase().compareTo(
				((String)r).toLowerCase()) <= 0;
				}
			}
			);
	public static void main(String[] args){
		StrSortVector sv = new StrSortVector();
		sv.addElement("d");
		sv.addElement("A");
		sv.addElement("C");
		sv.addElement("c");
		sv.addElement("b");
		sv.addElement("B");
		sv.addElement("D");
		sv.addElement("a");
		
		Enumeration e = sv.elements();
		while (e.hasMoreElements())
			Prt.Prt(e.nextElement());
	}

	private Enumeration elements() {
		if(!sorted){
			v.sort();
			sorted = true;
		}
		return v.elements();
	}

	private void addElement(String string) {
		v.addElement(string);
		sorted = false;
	}
	
	private String elementAt(int index){
		if(!sorted){
			v.sort();
			sorted = true;
		}
		return (String)v.elementAt(index);
	}
}
