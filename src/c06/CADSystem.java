//: CADSystem.java
// Ensuring proper cleanup

package c06;

import Prt.Prt;

class Shape{

	public Shape(int i) {
		Prt.Prt("Shape " + i);
	}
	
	void cleanup(){
		Prt.Prt("Shape cleanup");
	}
	
}

class Line extends Shape{

	public Line(int i, int j) {
		super(i);
	}
	
}

class Circle  extends Shape{

	public Circle(int i) {
		super(i);
	}
	
}

class Triangle  extends Shape{

	public Triangle(int i) {
		super(i);
	}
	
}

public class CADSystem extends Shape{
	private Line l;
	private Circle c;
	private Triangle t;
	public CADSystem(int i) {
		super(i+1);
		l = new Line(1, 1*1);
		c = new Circle(1);
		t = new Triangle(1);
		Prt.Prt("Commbined " + i);
	}

	public static void main(String[] args){
		CADSystem x =new CADSystem(47);
		try{
			
		}finally{
			x.cleanup();
		}
	}

	void cleanup() {
		t.cleanup();
		c.cleanup();
		l.cleanup();
		
		super.cleanup();
	}
}
