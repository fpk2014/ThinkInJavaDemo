package c02;
//: Property.java
import java.util.Date;
import java.util.Properties;

import Prt.Prt;

/** The first java demo.
  * Lists system information on current machine.
  * @author toto
  * @author http://www.forsu.cn
  * @version 1.0
*/


public class Property {
	/** Sole entry point to class & application
	* @param args array of string arguments
	* @return No return value
	* @exception exceptions No exceptions thrown
	*/
	public static void main(String[] args){
		Prt.Prt(new Date());
		
		Properties p = System.getProperties();
		p.list(System.out);
		
		Prt.Prt("--- Memory Usage:");
		Runtime rt = Runtime.getRuntime();
		Prt.Prt("Total memory = "+ rt.totalMemory()/1024/1024+
				" \nFree Memory = "+ rt.freeMemory()/1024/1024);
	}
}///:~
