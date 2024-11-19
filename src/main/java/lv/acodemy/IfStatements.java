package lv.acodemy;

public class IfStatements {
    public static void main(String[] args) {

        // Even or Odd

        int number = 7;
        if(number % 2 ==0) {
            System.out.println("The number is even");
        }

        // Check if a number is positive or negative (Assume 0 is positive)

        number = -10;
        if (number >= 0){
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

        // Grade checker (if-else-if)
        // 90 = A
        // 75 -> 89 = B
        // 50 -> 74 = C
        // < 50 = F

        // 1. Create score variables;
        // 2. Create logic if(score >= 90) -> A
        // else-if(score >= 75) -> B
        // else-if(score >=50) -> c
        // else -> F

        int score = 68;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Task No 1: Check if a person is eligible to buy an alcohol

        int age = 52;
        if (age >= 18) {
            System.out.println("This person can legal buy an alcohol");
        } else {
            System.out.println("A person is under legal age");
        }

        // Task No 2: Check if a number can be divided by 5

        int number1 = 25;
        if (number1 % 5 == 0) {
            System.out.println("Number is divided by 5");
        }

        // Task No 3: Check pass or fail
        // If score >= 50 (passed)
        // all other cases (failed)

        score = 40;
        if (score >= 50) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        // Task No 4: Temperature message (if-else-if)
        // Above 30 (It's hot)
        // Temperature between 15 and 30 (nice weather)
        // Below 15 (it's cold)

        int temperature = 10;
        if (temperature >= 30) {
            System.out.println("It's hot");
        } else if (temperature >= 15) {
            System.out.println("The weather is nice");
        } else {
            System.out.println("It's cold");
        }

        // Task No 5: Traffic light system
        // Green -> Go
        // Yellow -> Slow down
        // Red -> Stop
        // String color
        // if(color.equals("Green")) { }

        String color = "Green";

        if(color.equals("Green")) {
            System.out.println("Go");
        } else if (color.equals("Yellow")) {
            System.out.println("Slow down");
        } else if (color.equals("Red")) {
            System.out.println("Stop");
        } else {
            System.out.println("Wrong color");
        }


    }
}
