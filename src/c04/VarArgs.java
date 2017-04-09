//: VarArgs.java
//  Using the java array syntax to
//  create variable argument lists

package c04;

import Prt.Prt;

public class VarArgs {
	public static void main(String[] args){
		f(new Object[]{
				new Integer(47), new VarArgs(),
				new Float(3.14), new Double(11.11)
		});
		f(new Object[]{
				"one", "two", "three"
		});
	}

	private static void f(Object[] objects) {
		for(int i=0; i<objects.length; i++)
			Prt.Prt(objects[i]);
	}
}
