//: Lunch.java
//  Demonstrates class acccess specifiers
//  Make a class effectively private
//  with private constructors

package c05;

class Soup{
	private Soup(){}
	public static Soup makeSoup(){
		return new Soup();
	}
	public static Soup access() {
		// TODO Auto-generated method stub
		return new Soup();
	}
	public void f(){}
}

class Sanwich{	
}

public class Lunch {
	void test(){
		//! Soup priv1 = new Soup();
		Soup.makeSoup();
		new Sanwich();
		Soup.access().f();
	}
}
