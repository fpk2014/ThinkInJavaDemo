//: GreenhouseControls.java
//  This produces a specific application of the
//  control system, all in a single class.
//  Inner classes allow you to encapsulate
//  different functionality for each type of event

package c07.controller;

public class GreenhouseControls extends Controller{
	class LightOn extends Event{

		public LightOn(long eventTime) {
			super(eventTime);
		}

		@Override
		public void action() {			
		}

		@Override
		public String description() {
			return "LightOn()";
		}
		
	}
	
	class Restart extends Event{
		public Restart(long tm) {
			super(tm);
		}

		@Override
		public void action() {
			long tm = System.currentTimeMillis();
			//difference
			addEvent(new LightOn(tm));
		}

		@Override
		public String description() {
			return "Restart()";
		}
	}
	
	public static void main(String[] args){
		GreenhouseControls gc = new GreenhouseControls();
		long tm = System.currentTimeMillis();
		gc.addEvent(gc.new Restart(tm));
		gc.run();
	}
}
