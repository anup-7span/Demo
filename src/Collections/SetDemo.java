package Collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Random rd=new Random();

        List<Integer>list =new ArrayList<>();
        for (int i=0;i<=10;i++)
        {
            int number= rd.nextInt(5);
            list.add(number);

        }
        System.out.println("List:-"+list);

        Set<Integer> set=new HashSet<>();
        System.out.println("Set:-"+set);


    }
}
