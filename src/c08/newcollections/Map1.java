package c08.newcollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import Prt.Prt;

public class Map1 {
	private static String[][] testData1 = {
			{"a","1"},
			{"b","2"},
	};
	
	public static void main(String[] args){
		test(new HashMap());
	}

	private static void test(Map m) {
		fill(m, testData1);
		fill(m, testData1);
		printKeys(m);
		
		Map m2 = fill(new TreeMap(), testData1);
		m.putAll(m2);
		m.remove(testData1[0][0]);
		printKeys(m);
		
		m.clear();
		printKeys(m);
	}

	private static Map fill(Map m, Object[][] o) {
		for(int i=0; i<o.length; i++)
			m.put(o[i][0], o[i][1]);
		return m;
	}
	
	private static void print(Map m) {
		//Collection entries = ((Object) m).entries();
	}

	private static void printKeys(Map m){
		for(Iterator x = (Iterator) m.keySet().iterator();  x.hasNext();)
				Prt.Prt(x.next()+" ");
	}
	
	
}
