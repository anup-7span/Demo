package accessmodifiers.p2;

import accessmodifiers.A;

public class C extends A {

    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.d);

        C c=new C();
        System.out.println(c.c);
        System.out.println(c.d);
    }
}
