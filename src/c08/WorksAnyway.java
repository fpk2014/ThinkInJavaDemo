//: WorksAnyway.java
//  In special cases, thing just
//  seem to work correctly

package c08;

import java.util.Vector;

import Prt.Prt;

class Mouse{
	private int mouseNumber;
	public Mouse(int i) {
		mouseNumber = i;
	}
	public String toString(){
		return "This is Mouse " + mouseNumber;
	}
	public void print(String string) {
		Prt.Prt(string);
	}
	
}

class MouseTrap{

	public static void caughtYa(Object elementAt) {
		Mouse mouse = (Mouse) elementAt;
		mouse.print("Caught one");
	}
	
}

public class WorksAnyway {
	public static void main(String[] args){
		Vector mice = new Vector();
		for(int i=0; i<3; i++)
			mice.addElement(new Mouse(i));
		for(int i=0; i<mice.size(); i++){
			Prt.Prt(mice.elementAt(i));
			
			MouseTrap.caughtYa(mice.elementAt(i));
		}
	}
}
