//: Wind.java
//  Inheritance & upcasting

package c06;

import Prt.Prt;

class Instrument{
	void play(){
		Prt.Prt("Instrument");
	}
	public static void tune(Instrument i) {
		i.play();
	}
	
}

public class Wind extends Instrument{
	void play(){
		Prt.Prt("Wind");
	}
	public static void main(String[] args){
		Instrument.tune(new Wind());
	}
}
