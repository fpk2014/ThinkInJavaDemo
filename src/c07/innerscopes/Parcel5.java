package c07.innerscopes;

public class Parcel5 {


	private void track() {
		internalTracking(true);
	}
	
	private void internalTracking(boolean b) {
		if(b){
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip(){
					return id;
				}
				TrackingSlip ts = new TrackingSlip("slip");
				String s = ts.getSlip();
			}
		}
		//! TrackingSlip ts;
	}

	public static void main(String[] args){
		new Parcel5().track();
	}
}
