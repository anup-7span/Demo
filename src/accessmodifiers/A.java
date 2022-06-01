package accessmodifiers;

public class A {

    private int a=10;
    int b=20;
    protected int c=40;
    public int d=50;


    public static void main(String[] args) {

          A a=new A();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);
        System.out.println(a.d);

    }
}
