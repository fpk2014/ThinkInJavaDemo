//: Shapes.java
//  Polymorphism in java

package c07;

import Prt.Prt;

class Shape{
	void draw(){}
	void erase(){}
}

class Circle extends Shape{
	void draw(){
		Prt.Prt("Circle.draw()");
	}
	void erase(){
		Prt.Prt("Circle.erase()");
	}
}

class Square extends Shape{
	void draw(){
		Prt.Prt("Square.draw()");
	}
	void erase(){
		Prt.Prt("Square.erase()");
	}
}

public class Shapes {
	public static void main(String[] args){
		new Circle().draw();
		new Square().draw();
	}
}
