package StaticReference;

public class StaticReference {

    static  StaticReference st;
    static {
        System.out.println(st);
        StaticReference st=new StaticReference();
        System.out.println(st);
    }

    public static void main(String[] args) {
        System.out.println(StaticReference.st);

    }
}
