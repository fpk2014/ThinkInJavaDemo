package c07.innerscopes;

import Prt.Prt;

public class Parcel8 {

	private Destination dest(String string) {
		return new Destination(){
			private String label = string;
			public String readLabel(){
				return label;
			}
		};
	}
	
	public static void main(String[] args){
		Parcel8 p = new Parcel8();
		Destination d = p.dest("Tanzania");
		Prt.Prt(d.readLabel());
	}
}
