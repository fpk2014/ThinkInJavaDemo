//: AssocArray.java
//  Simple version of a Dictionary

package c08;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Vector;

import Prt.Prt;

public class AssocArrray extends Dictionary{
	private Vector keys = new Vector();
	private Vector values = new Vector();
	
	public static void main(String[] args){
		AssocArrray aa = new AssocArrray();
		for(char c='a'; c<='z'; c++)
			aa.put(String.valueOf(c),
				   String.valueOf(c).toUpperCase());
		char[] ca = {
				'a', 'e', 'i', 'o', 'u'
		};
		for(int i=0; i<ca.length; i++)
			Prt.Prt(aa.get(String.valueOf(ca[i])));
	}


	@Override
	public int size() {
		return keys.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return keys.isEmpty();
	}

	@Override
	public Enumeration keys() {
		return keys.elements();
	}

	@Override
	public Enumeration elements() {
		return values.elements();
	}

	@Override
	public Object get(Object key) {
		int index = keys.indexOf(key);
		if(index == -1)
			return null;
		return values.elementAt(index);
	}

	@Override
	public Object remove(Object key) {
		int index = keys.indexOf(key);
		keys.removeElementAt(index);
		
		Object returnval = values.elementAt(index);
		values.removeElementAt(index);
		return returnval;
	}

	@Override
	public Object put(Object key, Object value) {
		keys.addElement(key);
		values.addElement(value);
		return key;
	}
}
