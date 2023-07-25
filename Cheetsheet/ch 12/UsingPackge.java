// package cwk.game;

import cwk.gym.KeyurGym;

class Using extends base
{
    public void meth2(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // System.out.println(d);
    }
}
public class UsingPackge {
    public static void main(String[] args) {

        System.out.println("Using packges");
        System.out.println("This is file which import cwk.game");

        Using u = new Using();
        u.meth2();
   
        
    }
}

//compile