//: Frog.java
//  Testing finalize with inheritance

package c07;

import Prt.Prt;

class DoBaseFinalization{
	public static boolean flag;
}

class LivingCreature{
	protected void finalize(){
		Prt.Prt("LivingCreature.finalize()");
		if(DoBaseFinalization.flag)
			try{
				super.finalize();
			}catch(Throwable t){}
	}
}

class Animal extends LivingCreature{
	protected void finalize(){
		Prt.Prt("Animal.finalize()");
		if(DoBaseFinalization.flag)
			try{
				super.finalize();
			}catch(Throwable t){}
	}
}

class Amphibian extends Animal{
	protected void finalize(){
		Prt.Prt("Amphibian.finalize()");
		if(DoBaseFinalization.flag)
			try{
				super.finalize();
			}catch(Throwable t){}
	}
}

public class Frog extends Amphibian{
	protected void finalize(){
		Prt.Prt("Frog.finalize()");
		if(DoBaseFinalization.flag)
			try{
				super.finalize();
			}catch(Throwable t){}
	}
	public static void main(String[] args){
		// true or false will be different
		DoBaseFinalization.flag = true;
		new Frog();
		System.gc();
		System.runFinalization();
	}
}
