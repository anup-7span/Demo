package Polymorphism.MethodOverriding;

public class Car extends  Vehicle{

    @Override
    void start() {
        System.out.println("Car start");
    }

    @Override
    void stop() {
        System.out.println("Car Stop");
    }
}
