package com.codewithkeyur.shape;

class cir{
    int redius;
    cir(int r){
        redius = r;
    } 

    double area(){
        return Math.PI *redius * redius;
    }
}
public class circle {
    public static void main(String[] args) {
        cir c =new cir(3);
        double ca = c.area();
        System.out.println("Circle Area "+ ca);
    }
}
