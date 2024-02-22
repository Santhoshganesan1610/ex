package com.ex;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is Stopping");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is Stopping");
    }
}

class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is Starting");
        System.out.println();
    }

    @Override
    public void stop() {
        System.out.println("Truck is Stopping");
    }
}
public class MainInterface {
    public static void main(String[] args) {
        Vehicle[] ob = new Vehicle[3];
        ob[0] = new Car();
        ob[1] = new Motorcycle();
        ob[2] = new Truck();
        
        for (Vehicle veh:ob) {
            veh.start();
        }

        for (Vehicle veh:ob) {
            veh.stop();
        }
    }
}

