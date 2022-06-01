package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();

        list.add(23);
        list.add(43);
        list.add(89);
        list.add(33);

      /*  Iterator<Integer> itr=list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(list);*/

        for (Integer i :list) {
            System.out.println(i);


        }


    }
}
