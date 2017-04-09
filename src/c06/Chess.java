//: Chess.java
//  Inheritance, constructors and arguments

package c06;

import Prt.Prt;

class Game{
	Game(int i){
		Prt.Prt("Game " + i);
	}
}

class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		Prt.Prt("BoardGame " + i);
	}
}

public class Chess extends BoardGame {
	Chess(int i){
		super(i);
		Prt.Prt("Chess " + i);
	}
	public static void main(String[] args){
		new Chess(1);
	}
}
