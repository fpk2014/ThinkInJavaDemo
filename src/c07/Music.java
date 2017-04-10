//: Music.java
//  Inheritance &¡¡upcasting

package c07;

import Prt.Prt;

class Note{
	private int value;
	public Note(int i) {
		value = i;
	}

	public static Note middleC = new Note(0);
}

class Instrument{
	void play(Note n){
		Prt.Prt("Instrument.play()");
	}
}

class Wind extends Instrument{

	public void play(Note middleC) {
		Prt.Prt("Wind.play()");
	}
	
}

public class Music {
	private static void tune(Instrument i) {
		i.play(Note.middleC);
	}
	
	public static void main(String[] args){
		tune(new Wind());
	}
}
