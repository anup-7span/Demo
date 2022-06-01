package Exception;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        int a,b,ans;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A:-");
        a=sc.nextInt();
        System.out.println("Enter B:-");
        b=sc.nextInt();

        try {
            ans=a/b;
            System.out.println("ANS:-"+ans);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Do not enter 0");
        }

        System.out.println("more code to come");
    }
}
