
public class SimpleScopeDemo {
	public static void main(String[] args){
		{
			int x = 1;
		}
		//would be error: Prt.prt(x);
		
		
		int y;
		{
			y = 2;
		}
		Prt.prt(y);
	}
}
