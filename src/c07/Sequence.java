package c07;

import Prt.Prt;

interface Selector{
	boolean end();
	Object getCurrent();
	void next();
}

public class Sequence {
	Object[] o;
	int next;
	public Sequence(int i) {
		o = new Object[i];
	}
	
	class SSelector implements Selector{
		int i = 0;
		@Override
		public boolean end() {
			return i == o.length;
		}

		@Override
		public Object getCurrent() {
			return o[i];
		}

		@Override
		public void next() {
			if(i<o.length) i++;
		}
		
	}

	private Selector getSelector() {
		return new SSelector();
	}

	private void add(String string) {
		o[next] = string;
		next++;
	}

	public static void main(String[] args){
		Sequence s = new Sequence(10);
		for(int i=0; i<10; i++)
			s.add(Integer.toString(i));
		
		Selector s1 = s.getSelector();
		while(!s1.end()){
			Prt.Prt(s1.getCurrent());
			s1.next();
		}
	}
}
