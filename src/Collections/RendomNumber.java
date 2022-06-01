package Collections;

import java.util.Random;

public class RendomNumber {
    public static void main(String[] args) {

        Random obj=new Random();

        int x=obj.nextInt();

        System.out.println("X-"+x);
    }
}
