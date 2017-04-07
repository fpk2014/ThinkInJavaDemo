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
	public static void main(String[] args){
		Prt.prt(new Date());
		
		Properties p = System.getProperties();
		p.list(System.out);
		
		Prt.prt("--- Memory Usage:");
		Runtime rt = Runtime.getRuntime();
		Prt.prt("Total memory = "+ rt.totalMemory()/1024/1024+
				" \nFree Memory = "+ rt.freeMemory()/1024/1024);
	}
}
