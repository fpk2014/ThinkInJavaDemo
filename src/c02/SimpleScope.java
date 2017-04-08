package c02;

import Prt.Prt;

public class SimpleScope{
	public static void main(String[] args){
		{
			int x = 1;
		}
		//would be error: Prt.prt(x);
		
		
		int y;
		{
			y = 2;
		}
		Prt.Prt(y);
	}
}