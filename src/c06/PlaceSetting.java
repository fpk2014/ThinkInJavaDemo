//: PlaceSetting.java
//  Combining composition & inheritance

package c06;

import Prt.Prt;

class Utensil{

	public Utensil(int i) {
		Prt.Prt("Utensil "  + i );
	}
	
}

class Spoon extends Utensil{

	public Spoon(int i) {
		super(i);
		Prt.Prt("Spoon "  + i );
	}
	
}

class Fork extends Utensil{

	public Fork(int i) {
		super(i);
		Prt.Prt("Fork "  + i );
	}
	
}

class Knife extends Utensil{

	public Knife(int i) {
		super(i);
		Prt.Prt("Knife "  + i );
	}
	
}

class Plate{

	public Plate(int i) {
		Prt.Prt("Plate " + i );
	}
}

class DinnerPlate extends Plate{

	public DinnerPlate(int i) {
		super(i);
	}
	
}

class Custom{

	public Custom(int i) {
		Prt.Prt("Cutston " + i);
	}
	
}

public class PlaceSetting extends Custom{
	public PlaceSetting(int i) {
		super(i+1);
		new Spoon(i+2);
		new Fork(i+3);
		new Knife(i+4);
		new DinnerPlate(i+5);
		Prt.Prt("PlaceSetting " + i);
	}

	public static void main(String[] args){
		new PlaceSetting(9);
	}
}
