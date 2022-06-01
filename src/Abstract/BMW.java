package Abstract;

import SuperKeyWord.A;

public abstract class BMW {

    void comonfun()
    {
        System.out.println("INSIDE METHOD");
    }

    abstract  void accelerate();

    public static void main(String[] args) {
        System.out.println("Inside main method");
    }
}
