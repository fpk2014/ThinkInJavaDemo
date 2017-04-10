//: PolyConstructors.java
//  Constructors and polymorphism
//  don't produce what you might expect

package c07;

import Prt.Prt;

abstract class Glyph{
	public Glyph(int i) {
		//will get RoundGlyph.draw()
		draw();
	}
	
	abstract void draw();
}

class RoundGlyph extends Glyph{
	int radius = 1;
	public RoundGlyph(int i) {
		super(i);
	}

	@Override
	void draw() {
		Prt.Prt("RoundGlyph.draw()");
		//output: 0
		Prt.Prt(radius);
	}
	
}

public class PolyConstructors {
	public static void main(String[] args){
		new RoundGlyph(5);
	}
}
