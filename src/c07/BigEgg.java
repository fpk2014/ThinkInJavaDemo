//: BigEgg.java
//  An inner class cannot be overriden
//  like a method

package c07;

import Prt.Prt;

class Egg{
	protected class Yolk{
		public Yolk(){
			Prt.Prt("Egg.York()");
		}
	}
	private Yolk y;
	public Egg(){
		Prt.Prt("new Egg()");
		y = new Yolk();
	}
}

public class BigEgg extends Egg{
	public class Yolk{
		public Yolk(){
			Prt.Prt("BigEgg.Yolk()");
		}
	}
	public static void main(String[] args){
		new BigEgg();
		new BigEgg().new Yolk();
	}
}
