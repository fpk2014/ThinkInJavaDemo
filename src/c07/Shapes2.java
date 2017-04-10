package c07;

import Prt.Prt;

abstract class ShapeX{
	abstract void draw();
	abstract void erase();
}

class CircleX extends ShapeX{
	void draw(){
		Prt.Prt("Circle.draw()");
	}
	void erase(){
		Prt.Prt("Circle.erase()");
	}
}

public class Shapes2 {
	public static void main(String[] args){
		new CircleX().draw();
	}
}
