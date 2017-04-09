//: Garbage.java
//  Demonstration of the garbage
//  collector and finalization

package c04;

import Prt.Prt;

class Chair{
	static boolean gcrun = false;
	static boolean f = false;
	static int created = 0;
	static int finalized = 0;
	int i;
	Chair(){
		i = ++created;
		if(created == 47)
			Prt.Prt("Created 47");
	}
	
	protected void finalize(){
		if(!gcrun){
			gcrun = true;
			Prt.Prt("Beginning to finalize after "+created+
					" Chairs have been created");
		}
		if(i == 47){
			Prt.Prt("Setting flag to stop Chair creation");
			f = true;
		}
		finalized++;
	}
}

public class Garbage {
	public static void main(String[] args){
		while(!Chair.f){
			new Chair();
			new String("to take up space");
		}
		Prt.Prt(Chair.created + " and " + Chair.finalized);
		
		System.gc();
		System.runFinalization();
	}
}
