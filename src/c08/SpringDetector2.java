//: SpringDetector2.java
//  If you create a class that's used as a key in
//  a Hashtable, you must 
//  override hashCode() and equals()

package c08;

import java.util.Hashtable;

import Prt.Prt;

class Groundhog2{
	int value;
	public Groundhog2(int i) {
		value = i;
	}
	
	public int hashCode(){
		return value;
	}
	public boolean equals(Object o){
		return (o instanceof Groundhog2)
				&&
				(value == ((Groundhog2) o).value);
	}
}

class Prediction2{
	
}

public class SpringDetector2 {
	public static void main(String[] args){
		Hashtable ht = new Hashtable();
		for(int i=0; i<10; i++)
			ht.put(new Groundhog2(i), new Prediction2());
		//Prt.Prt(ht);
		Groundhog2 gh = new Groundhog2(3);
		if(ht.containsKey(gh))
			Prt.Prt("ok"+(Prediction2)ht.get(gh));
	}
}
