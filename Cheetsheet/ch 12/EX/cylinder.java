package com.codewithkeyur.shape;

class cyli{
	int redius, height;
	cyli(int r, int h){
		this.redius = r;
		this.height = h;
	}
	double volume(){
		return Math.PI * redius * redius * height;
	}	
}

public class cylinder{
	public static void main(String args[]){
		cyli c = new cyli(4, 8);
		double ca = c.volume();
		System.out.println("Cylinder volume "+ ca);
	}
}