package c08;

import java.util.Stack;

import Prt.Prt;

public class Stacks {
	public static void main(String[] args){
		Stack stk = new Stack();
		String[] months = {
				"January", "February"
		};
		for(int i=0; i<months.length; i++)
			stk.push(months[i]+" ");
		Prt.Prt(stk);
		
		stk.addElement("The last line");
		Prt.Prt(stk.elementAt(2));
		
		while(!stk.empty())
			Prt.Prt(stk.pop());
	}
}
