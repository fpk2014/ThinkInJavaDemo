//: Adventure.java
//  Multiple interfaces

package c07;

interface CanFight{
	void fight();
}

interface CanSwim{
	void swim();
}


class ActionCharacter{
	public void fly(){}
}

class Hero extends ActionCharacter implements 
	CanFight, CanSwim{
	public void swim(){}
	public void fight() {}
}

public class Adventure {
	static void f(CanFight x){x.fight();}
	static void s(CanSwim x){x.swim();}
	static void fl(ActionCharacter x){x.fly();}
	public static void main(String[] args){
		Hero h = new Hero();
	}

}
