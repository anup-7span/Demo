package Multithreading;

public class Interrupted extends Thread{

    public void run()
    {
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Hello"+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Got Interrupted");
        }
    }

    public static void main(String[] args) {

        Interrupted it=new Interrupted();

        it.start();
        it.interrupt();

        System.out.println("inside main");
    }
}
