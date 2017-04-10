package c07.innerscopes;

import Prt.Prt;

public class Parcel4 {
	public Destination dest(String s){
		class PDestination implements Destination{
			private String label;
			
			public PDestination(String s) {
				label = s;
			}
			
			@Override
			public String readLabel() {
				return label;
			}
			
		}
		return new PDestination(s);
	}
	
	public static void main(String[] args){
		Parcel4 p = new Parcel4();
		Destination d = p.dest("Tanzania");
		Prt.Prt(d.readLabel());
	}
}
