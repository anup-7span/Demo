package Static;

public class StaticDemo {

    static int num;

    public static void main(String[] args) {
        System.out.println(StaticDemo.num);
        StaticDemo.method1();
        System.out.println("Demo");
    }
    static void method1()//static method
    {
        System.out.println("method1");
    }

        static{
            System.out.println("hello");  //static object
        }
        static {
            System.out.println("hello2");
        }
}
