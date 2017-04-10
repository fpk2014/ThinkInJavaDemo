//: Month.java
//  A more robust enumeration system

package c07;

import Prt.Prt;

public class Month {
	private String name;
	private Month(String i){name = i;}
	public String toString(){return name;}
	public final static Month
		JAN = new Month("January"),
		FEB = new Month("February"),
		MAR = new Month("March"),
		APR = new Month("April"),
		MAY = new Month("May"),
		JUN = new Month("June"),
		JUL = new Month("July"),
		AUG = new Month("August"),
		SEP = new Month("September"),
		OCT = new Month("Ocober"),
		NOV = new Month("November"),
		DEC = new Month("December");
	public final static Month[] month = {
		JAN, JAN, FEB, MAR, APR, MAY, JUN,
		JUL, AUG, SEP, OCT, NOV, DEC
	};
	
	public static void main(String[] args){
		Month m = Month.JAN;
		Prt.Prt(m);
	}
}
