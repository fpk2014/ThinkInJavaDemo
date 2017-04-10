package c07.innerscopes;

public class Parcel6 {

	private Contents cont() {
		/*
		 * class MyContents extends Contents{
		 * 	private int i = 11;
		 * 	public  int value(){return i;}
		 * }
		 * return new MyContents();ss
		 */		
		return new Contents(){
			private int i = 11;
			public int value(){return i;}
		};
	}
	
	
	public static void main(String[] args){
		Parcel6 p = new Parcel6();
		Contents c = p.cont();
	}

}
