package c07.innerscopes;

public class Parcel11 {
	class Contents{
		
	}
	class Destination{
		
	}
	
	public static void main(String[] args){
		Parcel11 p = new Parcel11();
		Parcel11.Contents c = p.new Contents();
		Parcel11.Destination d = p.new Destination();
	}
}
