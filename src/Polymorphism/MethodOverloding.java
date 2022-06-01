package Polymorphism;

import sun.awt.IconInfo;

public class MethodOverloding {

    void add(int a,int b)
    {
       int result=a+b;

        System.out.println("Result:-"+result);
    }
    void add(float a,float b)
    {
        float result=a+b;
        System.out.println("Result:-"+result);
    }

    void add(int a,int b,int c)
    {
        int result=a+b+c;
        System.out.println("Result:-"+result);
    }

    public static void main(String[] args) {

        MethodOverloding m=new MethodOverloding();

        m.add(12,4);
        m.add(3.5f,4.3f);
        m.add(32,34,56);
    }

}
