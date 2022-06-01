package StaticReference;
//Static reference in n static method
public class Demo1 {

    static  Demo1 obj=new Demo1();

    static {
        System.out.println(Demo1.obj);

        Demo1.obj=Demo1.init();
    }

    public static void main(String[] args) {
        System.out.println(Demo1.obj);
    }
   static  Demo1 init()
   {
     return new Demo1();
   }
}
