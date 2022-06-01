package SuperKeyWord;

public class SuperClass {
    int x;

    SuperClass()
    {
        System.out.println("no Arg Constructor Superclass");
    }
    SuperClass(int x)
    {
        this();
        this.x=x;
        System.out.println("One Arg Constructor superClass");
    }
}
