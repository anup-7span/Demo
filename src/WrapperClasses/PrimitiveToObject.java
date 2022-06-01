package WrapperClasses;

public class PrimitiveToObject {
    public static void main(String[] args) {
     /*   int x=100;

        Integer y=Integer.valueOf(x);   //Primitive to Object
        System.out.println(y);*/

       /* byte b=10;
        String s=Byte.toString(b);
                                    //Primitive to String
        System.out.println(s);
        byte v= Byte.parseByte(s);

        System.out.println(v);*/

        long x=1000;
        Long y=Long.valueOf(x);

        String s= y.toString();         //String to object

        System.out.println(s);
    }
}
