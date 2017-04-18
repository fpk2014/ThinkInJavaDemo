package c08.newcollections;

import java.util.Arrays;
import java.util.Comparator;

public class AlphaComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = ((String) o1).toLowerCase();
		String s2 = ((String) o2).toLowerCase();
		return s1.compareTo(s2);
	}

	
	public static void main(String[] args){
		String[] s = Array1.randString(4, 4);
		Array1.print(s);
		
		AlphaComp ac = new AlphaComp();
		Arrays.sort(s, ac);
		Array1.print(s);
	}
}
