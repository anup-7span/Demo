package Codes;

import java.util.Scanner;

public class Day4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N%2==0)
        {
            if(N>=2 && N<=5)
                System.out.print("Not Weird");
            else if(N>=6 && N<=20)
                System.out.print("Weird");
            else
                System.out.print("Not Weird");
        }
        else
            System.out.print("Weird");

    }
}
