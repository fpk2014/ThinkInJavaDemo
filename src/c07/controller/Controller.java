//: Controller.java
//  Along with Event, the generic
//  framework for all control systems;

package c07.controller;

import Prt.Prt;

class EventSet{
	private Event[] events = new Event[100];
	private int index = 0;
	private int next  = 0;
	
	public void add(Event c) {
		if(index >= events.length)
			return;
		events[index++] = c;
	}

	public Event getNext() {
		boolean looped = false;
		int start = next;
		do{
			next = (next+1)%events.length;
			//See if it has looped to the begining
			if(start == next)
				looped = true;
			
			// If it loops past start,
			// the list is empty;
			if((next == (start+1)%events.length) && looped)
				return null;
		}while(events[next] == null);
		return events[next];
	}

	public void removeCureent() {
		events[next] = null;
	}
	
}

public class Controller {
	private EventSet es = new EventSet();
	public void addEvent(Event c){
		es.add(c);
	}
	public void run(){
		Event e;
		while((e = es.getNext())!=null){
			if(e.ready()){
				e.action();
				Prt.Prt(e.description());
				es.removeCureent();
			}
		}
	}
}
