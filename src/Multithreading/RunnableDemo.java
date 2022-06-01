package Multithreading;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {

        System.out.println("Hello");

    }

    public static void main(String[] args) {
        RunnableDemo rd=new RunnableDemo();

        Thread th=new Thread(rd);

        th.start();
    }
}
