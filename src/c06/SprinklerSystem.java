//: SprinklerSystem.java
//  Composition for code reuse

package c06;

import Prt.Prt;

class WaterSource{
	public String toString(){
		return "WaterSource()";
	}
}

public class SprinklerSystem {
	WaterSource source = new WaterSource();
	public static void main(String[] args){
		Prt.Prt(new SprinklerSystem().source);
	}
}
