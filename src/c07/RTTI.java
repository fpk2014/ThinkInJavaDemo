//: RTTI.java
//  Downcasting & Rnn-Time Type
//  Identification(RTTI)

package c07;

class Useful{
	void f(){}
	void g() {}
}

class MoreUseful extends Useful{
	void u(){}
}

public class RTTI {
	public static void main(String[] args){
		Useful[] x = {
				new Useful(),
				new MoreUseful()
		};
		x[0].f();
		x[1].g();
		//! x[1].u();
		((MoreUseful) x[1]).u();
		((MoreUseful) x[0]).u(); // exception
	}
}
