//: TestRed.java
//  putting test code in a static inner class

package c07;

import Prt.Prt;

public class TestBed {
	TestBed(){}
	void f(){
		Prt.Prt("f()");
	}
	public static class Tester{
		public static void main(String[] args){
			TestBed t = new TestBed();
			t.f();
		}
	}
}
