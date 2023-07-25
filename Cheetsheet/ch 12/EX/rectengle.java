package com.codewithkeyur.shape;

class rec{
	int l,b;
	rec(int l, int b){
		this.l = l;
		this.b = b;
	}
	float area(){
		return l * b;
	}	
}

public class rectengle{
	public static void main(String args[]){
		rec r = new rec(5, 3);
		float ra = r.area();
		System.out.println("Reacetngle area "+ ra);
	}
}