package NonStatic;

public class NonStaticDemo {
    int num;

    NonStaticDemo()
    {
        System.out.println("inside constructoe");
    }
    {
        System.out.println("inside nonStatic block");
    }
    public static void main(String[] args) {

        System.out.println("inside main method");

        new NonStaticDemo();
       NonStaticDemo nd=new NonStaticDemo();

       nd.doSomething();
    }
    static {
        System.out.println("inside static block");
    }

    void doSomething()
    {
        System.out.println("Do Something");
    }
}
