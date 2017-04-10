//: Parcell.java
//  Creating inner class

package c07;

public class Parcell {
	class Contents{
		private int i = 11;
		public int value(){return i;}
	}
	
	private void ship(String string) {
		new Contents();
	}
	
	public static void main(String[] args){
		new Parcell().ship("Tanzania");
	}
}
