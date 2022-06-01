package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();
        for (int i=10;i<=200;i=i+10)
        {
           list.add(i);
        }
        list.add(5,30);

        list.set(2,2000);

        System.out.println(list);

        if(list.contains(1104))
        {
            System.out.println("List have a value");
        }
        else
        {
            System.out.println("list not have a value");
        }

        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        list.remove(4);

        System.out.println("List after remove"+list);

    }
}
