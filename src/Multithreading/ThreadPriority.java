package Multithreading;

public class ThreadPriority extends  Thread{
    public static void main(String[] args) {

        ThreadPriority tp=new ThreadPriority();
        tp.setPriority(MAX_PRIORITY);
        tp.start();

        ThreadPriority tp1=new ThreadPriority();
        tp1.setPriority(MIN_PRIORITY);
        tp1.start();

    }

    public void run()
    {

        for (int i = 1; i <= 10; i++) {
            System.out.println("I:-" + i);
        }
    }
}
