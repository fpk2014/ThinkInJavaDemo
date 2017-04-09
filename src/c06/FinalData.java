//: FinalData.java
//  The effect of final of fields

package c06;

class Value{
	int i = 1;
}

public class FinalData {
	final int i1 = 9;
	private final Value v2 = new Value();
	private Value v1;

	public static void main(String[] args){
		FinalData fd1 = new FinalData();
		//! fd1.i1++
		fd1.v2.i++;
		fd1.v1 = new Value();
	}
}
