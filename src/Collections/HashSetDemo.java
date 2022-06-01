package Collections;

import java.util.HashSet;
import java.util.Random;

public class HashSetDemo {
    public static void main(String[] args) {

        Random rd=new Random();

        HashSet<Integer> hs=new HashSet<>();

        for (int i=0;i<=5;i++)
        {
            int number=rd.nextInt(100);
            hs.add(number);
            System.out.println(number);
        }
        System.out.println("HashSet element"+hs);
    }
}
