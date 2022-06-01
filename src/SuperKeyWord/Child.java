package SuperKeyWord;

import accessmodifiers.p2.C;

public class Child extends  SuperClass{
    Child()
    {
        this(10);
        System.out.println("No arg Child class");
    }

    Child(int x)
    {
        super(x);
        System.out.println("One arg Constructor Chail Class");
    }

    public static void main(String[] args) {
         Child c=new Child();
    }
}
