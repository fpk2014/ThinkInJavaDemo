//: Shapes3.java
//  Interfaces

package c07;

import Prt.Prt;

interface ShapeY{
	void draw();
	void erase();
}

class CircleY implements ShapeY{
	public void draw(){
		Prt.Prt("Circle.draw()");
	}
	public void erase(){
		Prt.Prt("Circle.erase()");
	}
}

public class Shapes3 {
	public static void main(String[] args){
		new CircleY().draw();
	}
}

