//: Transmogrify.java
//  Dynamically changing the behavior of
//  an object via composition

package c07;

import Prt.Prt;

interface Actor{
	void act();
}

class HappyActor implements Actor{

	@Override
	public void act() {
		Prt.Prt("happy");
	}
	
}

class SadActor implements Actor{

	@Override
	public void act() {
		Prt.Prt("sad");
	}

	
}

class Stage{
	Actor a = new HappyActor();
	public void change() {
		a = new SadActor();
	}

	public void go() {
		a.act();
	}
	
}

public class Transmogrify {
	public static void main(String[] args){
		Stage s = new Stage();
		s.go();
		s.change();
		s.go();
	}
}
