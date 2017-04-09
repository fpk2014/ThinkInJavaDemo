//: FinalArguments.java
//  Using "final" with method arguments

package c06;

class Gizmo{

	public void spin() {
		
	}
	
}

public class FinalArguments {
	void without(Gizmo g){
		g = new Gizmo();
		g.spin();
	}
	void with(final Gizmo g){
		g.spin();
	}
	public static void main(String[] args){
		FinalArguments bf = new FinalArguments();
		bf.without(null);
	}
}
