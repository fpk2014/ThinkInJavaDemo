//: Parcel2.java

package c07;

public class Parcel2 {
	class Contents{
		
	}
	
	class Destination{

		public Destination(String string) {
			
		}
		
	}

	
	private void ship(String string) {
		cont();
		to(string);
	}
	
	
	Contents cont(){
		return new Contents();
	}
	Destination to(String string){
		return new Destination(string);
	}
	
	public static void main(String[] args){
		new Parcel2().ship("Tanzania");
		
		//difference
		Parcel2 p = new Parcel2();
		Parcel2.Contents c = p.cont();
		Parcel2.Destination d = p.to("Borneo");
	}
}
