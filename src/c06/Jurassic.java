//: Jurassic.java
//  Making an entire class final

package c06;

class SmallBrain{}


//can't be inherited 
final class Dinosaur extends SmallBrain{

	public int j = 1;
	public int i = 7;
	SmallBrain x = new SmallBrain();
	public void f() {
		
	}
	
}

public class Jurassic {
	public static void main(String[] args){
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}
