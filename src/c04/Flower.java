//: Flower.java
//  Calling constructors with "this"

package c04;

import Prt.Prt;

public class Flower {
	private int petalCount = 0;
	private String s = new String("null");
	
	Flower(int petals){
		this.petalCount = petals;
		Prt.Prt(petalCount);
	}
	
	Flower(String ss){
		Prt.Prt(ss);
		this.s = ss;
	}
	
	Flower(String ss, int petals){
		this(petals);
		//! this(s);  //Can't call two;
		this.s = ss;
	}
	
	Flower(){
		this("hi", 47);
	}
	
	void print(){
		//! this(11);
		//�������������Ǵӳ���һ��������֮��������κη����ڲ�����һ����������
		Prt.Prt(s);
	}
	
	public static void main(String[] args){
		Flower x = new Flower();
		x.print();
	}
}
