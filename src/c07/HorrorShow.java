//: HorrorShow.java
//  Extending an interface with inheritance

package c07;

interface Monster{
	void menace();
}

interface DangerousMonster extends Monster{
	void destory();
}

interface Lethal{
	void kill();
}

class DragonZilla implements DangerousMonster{
	public void menace(){ }
	public void destory(){ }
}

interface Vampire extends DangerousMonster, Lethal{
	void drinkBlood();
}

public class HorrorShow {
	static void u(Monster b){b.menace();}
	public static void main(String[] args){
		DragonZilla d = new DragonZilla();
		u(d);
	}
	
	
}
