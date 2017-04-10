package c07.innerscopes;

public class parcel10 {
	//change to static
	static class PDestination implements Destination{

		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

	private static Destination dest(String string) {
		return new PDestination();
	}
	
	//change to static
	static class PContents implements Contents{
		private int i = 11;
		@Override
		public int value() {
			return i;
		}
		
	}

	private static Contents cont() {
		return new PContents();
	}
	
	public static void main(String[] args){
		Contents c =  cont();
		Destination d = dest("Tanzania");
	}
}
