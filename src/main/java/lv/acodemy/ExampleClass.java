package lv.acodemy;

public class ExampleClass {
    public static void main(String[] args) {


        // Access modifier (public, private, protected, package-private)
        // Can return specific data type
        // void - if we do not return anything
        // Method name: should be unique, camelCase;
        // Parameters
        // return keyword if we return something

        // To create method
        // [access modifier] [other modifiers] [return types] methodName {
        // method body
        // return [value]

        // Create method that will print out Hello, World!
        sayHello();

        greet("Nikita");
        greet("Bob");
        greet("Alex");

        System.out.println(add(60,50));
        int x = add(30, 40);
        System.out.println(x);

        System.out.println(add(12.2, 13.5));

        double a = 12.12;
        double b = 13.5;
        System.out.println(add(a, b));

        var firstStudent = calculatorGrade(90);
        System.out.println(firstStudent);
        var secondStudent = calculatorGrade(50);
        System.out.println(secondStudent);
    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String calculatorGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 75) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
