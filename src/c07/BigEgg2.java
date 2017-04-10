package c07;

import Prt.Prt;

class Egg2{
	protected class Yolk{
		public Yolk(){
			Prt.Prt("Egg2.Yolk()");
		}
		public void f(){
			Prt.Prt("Egg2.Yolk.f()");
		}
	}
	
	private Yolk y = new Yolk();
	public Egg2(){
		Prt.Prt("Egg2()");
	}
	
	public void insertYolk(Yolk yy){y = yy;}
	public void g(){y.f();}
}

public class BigEgg2 extends Egg2{
	public class Yolk extends Egg2.Yolk{
		public Yolk(){
			Prt.Prt("BigEgg2.Yolk()");
		}
	}
	
	//overriden
	public BigEgg2(){insertYolk(new Yolk());}

	public static void main(String[] args){
		new BigEgg2().g();
	}
}
