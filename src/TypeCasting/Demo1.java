package TypeCasting;

public class Demo1 {

    public static void main(String[] args) {
       /* byte b=100;
        int i=b;
        System.out.println(i);
                                                //implicit type casting
        char ch='A';
        int m=ch;

        System.out.println(m);*/


        int i=100;

        byte b=(byte)i;

        System.out.println(b);

        int x=97;

        char ch=(char)x;

        System.out.println(ch);
    }
}
