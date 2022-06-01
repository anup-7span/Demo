package Multithreading;

public class YieldDemo extends  Thread {

    public void run()
    {
        for (int i=1;i<=500;i++)
        {
            System.out.println("Inside Child"+i);

           // Thread.yield();
        }
    }

    public static void main(String[] args) {

        YieldDemo yd=new YieldDemo();
        yd.start();

        for (int j=1;j<=500;j++)
        {
            System.out.println("Inside Main:-"+j);
            Thread.yield();
        }
    }

}
