package Codes;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {


        int i = 4;

        double d = 4.0;
        String s = "HackerRank ";


        Scanner scan = new Scanner(System.in);
        int j,sum;
        double b,ans;

        j= Integer.parseInt(scan.nextLine());

        sum=i+j;

        b= Double.parseDouble(scan.nextLine());

        ans= (d+b);

        String s1=null;

        s1= scan.nextLine();

        String s3=s.concat(s1);

        System.out.println(sum);
        System.out.println(ans);
        System.out.println(s3);


    }
}
