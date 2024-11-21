package lv.acodemy;

import lv.acodemy.objects.Car;
import lv.acodemy.objects.Dog;

public class ObjectExample {
    public static void main(String[] args) {

        // Encapsulation (Getters, Setters)
        // Inheritance
        // Polymorphism
        // Abstraction

        Car audi = new Car("Black", "RS6 Avant");
        audi.start();
        System.out.println(audi);

//        audi.color = "Black";
//        audi.model = "RS6 Avant";
        audi.setColor("Black");
        audi.setModel("RS6 Avant");
        System.out.println(audi);

        // Create bmw object
        // Start your bmw
        // Set color and model

        Car checkengine = new Car();
        checkengine.start();
        checkengine.setColor("Blue");
        checkengine.setModel("M3 Competition");
        System.out.println(checkengine);

        // Getters
        // Setters

        //Print text: My car model is %s, and color is %s

        System.out.println(String.format("My car color is %s, and model is %s", checkengine.getColor(), checkengine.getModel()));


        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();


    }
}
