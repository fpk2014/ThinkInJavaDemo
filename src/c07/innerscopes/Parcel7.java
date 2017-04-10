package c07.innerscopes;

import Prt.Prt;

public class Parcel7 {
	private Wrapping wrap(int i) {
		return new Wrapping(i){
			public int value(){
				return super.value()*47;
			}
		};
	}
	
	public static void main(String[] args){
		Parcel7 p = new Parcel7();
		Wrapping w = p.wrap(10);
		Prt.Prt(w.value());
	}
}
