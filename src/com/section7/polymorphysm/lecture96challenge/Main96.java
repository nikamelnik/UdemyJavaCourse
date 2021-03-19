package com.section7.polymorphysm.lecture96challenge;

public class Main96 {
    public static void main(String[] args) {


        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


    public String startEngine (){
        return  "Car -> startEngine()";
    }
    public String  accelerate (){
        return  "Car -> accelerate()";
    }

    public String brake (){
        return "Car -> brake()";
    }



}
class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return  "Mitsubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return  "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}
class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return  "Holden  -> startEngine()";
    }

    @Override
    public String accelerate() {
        return  "Holden  -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden  -> brake()";
    }
}
class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return  "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return  "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}
//For this exercise you will create four classes of vehicles.
// The first class should be named Car. This will be the base class for three other classes, Mitsubishi, Holden, and Ford.
//
//        The first class contains four member variables, or fields, with these names and conditions:
//        engine of type boolean
//        cylinders of type int
//        name of type String
//        wheels of type int
//
//        All four member variables should have private access.
//
//        The constructor should accept two parameters, cylinders and name.
//        Also, all of these cars have an engine and four wheels. So the other two fields should be set to default values.
//
//        In addition, there are five other methods These methods should be defined as described below:
//

//
//        Two getter methods should also be defined here for the member variables cylinders and name.
//        All methods have public access.
//
//        The other three classes mentioned above are sub-classes of Car.
//        These classes have no member variables and the constructor for each will call the parent constructor for object instantiation.
//        Each of these classes will override the three parent methods startEngine, accelerate, and brake.
//        The return messages for these methods should somewhere contain the name of the class to which the methods belong.