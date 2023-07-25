package com.codewithkeyur.shape;

class squ{
	int side;
	squ(int s){
		this.side = s;
	}
	float area(){
		return side * side;
	}	
}

public class square{

	public static void main(String args[]){
		squ s = new squ(5);
		float sa = s.area();
		System.out.println("Square area "+ sa);
	}
}