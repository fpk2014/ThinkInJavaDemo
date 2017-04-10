package c07.innerscopes;

import Prt.Prt;

public class Parcel9 {
	private Destination dest(String string, float f) {
		// TODO Auto-generated method stub
		return new Destination(){
			public int cost = (int)f;
			private String label = string;
			@Override
			public String readLabel() {
				return label;
			}
			
		};
	}
	
	public static void main(String[] args){
		Parcel9 p = new Parcel9();
		Destination d = p.dest("Tanzania", 101.3F);
		Prt.Prt(d.readLabel());
		//! Prt.Prt(d.cost);
	}
}
