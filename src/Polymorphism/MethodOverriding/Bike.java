package Polymorphism.MethodOverriding;

public class Bike extends Vehicle {

    void  start()
    {
        super.start();
        System.out.println("Bike Start");
    }

    void stop()
    {
        super.stop();
        System.out.println("Bike Stop");
    }

    void speed()
    {
        System.out.println("Bike in Speed");
    }
}
