package cwk.gym;

class base {
    public int a = 5;
    protected int b = 10;
     int c = 15;
    private int d = 20;

    public void meth(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class KeyurGym {
    public static void main(String[] args) {
        System.out.println("I am in main  KeyurGym method!");
        base acc  = new base();

        // acc.meth();
        System.out.println(acc.a);
        System.out.println(acc.b);
        System.out.println(acc.c);
        // System.out.println(acc.d);
    }
}
