//: SpringDetector.java
//  Looks plausible, but doesn't work right

package c08;

import java.util.Hashtable;

import Prt.Prt;

class Groundhog{
	private int value;
	public Groundhog(int i) {
		value = i;
	}
	
}

class Prediction{
	
}

public class SpringDetector {
	public static void main(String[] args){
		Hashtable ht = new Hashtable();
		for(int i=0; i<10; i++)
			ht.put(new Groundhog(i), new Prediction());
		//Prt.Prt(ht);
		Groundhog gh = new Groundhog(3);
		if(ht.containsKey(gh))
			Prt.Prt("ok"+(Prediction)ht.get(gh));
	}
}
