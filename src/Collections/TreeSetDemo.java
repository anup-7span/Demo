package Collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<String> ts=new TreeSet<>(new MyComparable());

        ts.add("Anup");
        ts.add("keyur");
        ts.add("jay");

        ts.add("Manthan");

        for (String t:ts) {
            System.out.println(t);
        }
    }
}
