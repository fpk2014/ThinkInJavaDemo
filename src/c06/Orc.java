//: Orc.java
//  The protected keyword

package c06;

class Villain{
	private int ii;
	
	public Villain(int i) {
		// TODO Auto-generated constructor stub
	}
	protected void set(int i){
		i = ii;
	}
}

public class Orc extends Villain{
	Orc(int i){
		super(i);
	}
	void change(int x){
		set(x);
	}
}
