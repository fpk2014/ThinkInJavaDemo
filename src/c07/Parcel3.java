package c07;

abstract class Contents{
	abstract public int value();
}

interface Destination{
	String readLabel();
}

public class Parcel3 {
	private class PContents extends Contents{

		@Override
		public int value() {
			return 0;
		}
		
	}
	
	public Contents cont(){
		return new PContents();
	}

	public Destination dest(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

class Test{
	public static void main(String[] args){
		Parcel3 p = new Parcel3();
		Contents c = p.cont();
		Destination d = p.dest("Tanzania");
		
		//! Parcel3.PContents pp = p.new PContents();
	}
}