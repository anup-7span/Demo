package Multithreading;

public class MultiThreadin extends Thread {
    public static void main(String[] args) {

        MultiThreadin mt = new MultiThreadin();


        mt.start();
        try {
            mt.join();
        }
        catch (Exception  e)
        {
            System.out.println(e);
        }


        for (int j = 1; j <= 10; j++) {
            System.out.println("J:-" + j);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }  public  void run()
    {
            for (int i = 1; i <= 10; i++) {
                System.out.println("I:-" + i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

}
