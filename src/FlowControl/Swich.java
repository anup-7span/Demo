package FlowControl;

import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {
         int x;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");
        x=sc.nextInt();

         switch (x)
         {
             case 1:
                 System.out.println("case1");
                 break;
             case 2:
                 System.out.println("case2");
                 break;
             case 3:
                 System.out.println("case3");
                 break;
             default:
                 System.out.println("out of number");
         }
    }
}
