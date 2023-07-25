
package com.codewithkeyur.shape;

class sphe{
    int redius;
    sphe(int r){
        redius = r;
    }
    double area(){
        return 4 * Math.PI * redius * redius;
    }
}
public class sphere {
    public static void main(String[] args) {
        sphe s = new sphe(4);
        System.out.println("Sphere surface area " + s.area());
    }
}
