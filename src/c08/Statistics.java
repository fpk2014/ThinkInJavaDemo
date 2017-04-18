//: Statistics.java
//  Simple demonstration of Hashtable

package c08;

import java.util.Hashtable;

import Prt.Prt;

class Counter{

	public static int i;
	
}

public class Statistics {
	public static void main(String[] args){
		Hashtable ht = new Hashtable();
		for(int i=0; i<10000; i++){
			Integer r = 
					new Integer((int)(Math.random()*20));
			if(ht.containsKey(r))
				((Counter) ht.get(r)).i++;
			else
				ht.put(r, new Counter());
			Prt.Prt(ht);
		}
	}
}
