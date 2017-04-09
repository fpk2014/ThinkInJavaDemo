//:SimpleConstructor.java
// Demonstration of a simple Constructor
// initialize

package c04;

import Prt.Prt;

class Rock{
	Rock(int i){
		Prt.Prt("Creating Rock " + i);
	}
}

public class SimpleConstructor {
	public static void main(String[] args){
		for(int i=0; i<10; i++)
			new Rock(i);
	}
}
