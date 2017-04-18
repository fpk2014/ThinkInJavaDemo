//: CrashJava.java
//  One way to crash java

package c08;

import java.util.Vector;

import Prt.Prt;

public class CrashJava {
	public String toString(){
		return this+"\n";
		//return super.toString()+"\n";
	}
	public static void main(String[] args){
		Vector v = new Vector();
		for(int i=0; i<10; i++)
			v.addElement(new CrashJava());
		Prt.Prt(v);
	}
}
