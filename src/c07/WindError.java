//: WindError.java
//  Accidentally changing the interface

package c07;

import Prt.Prt;

class  NoteX{
	static final int MIDDLE_C = 0;
}

class InstrumentX{

	public void play(int i) {
		Prt.Prt("InstrumentX.play()");
	}
	
}

class WindX extends InstrumentX{
	public void play(NoteX i){
		Prt.Prt("WindX.play(Note)");
	}
}

public class WindError {
	public static void main(String[] args){
		tune(new WindX());  //not the desired behavior!
	}

	private static void tune(InstrumentX i) {
		i.play(NoteX.MIDDLE_C);
	}
}
