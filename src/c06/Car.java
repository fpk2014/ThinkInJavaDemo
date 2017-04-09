package c06;

class Window{
	void rollup(){}
	void rolldown(){}
}

class Door{
	Window window = new Window();
	void open(){}
	void close(){}
}

class Wheel{
	void inflate(int psi){}
}

public class Car {
	Door left = new Door(), 
		 right = new Door();
	Wheel[] wheel = new Wheel[4];
	Car(){
		for(int i=0; i<4; i++)
			wheel[i] = new Wheel();
	}
	public static void main(String[] args){
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
	}
}
