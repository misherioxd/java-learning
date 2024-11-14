package lv.acodemy;

import java.sql.SQLOutput;

public class Variables {
    public static void main(String[] args) {

        //This is my comment

        /*
        This is first line
        This is second line
        This is third line
         */

        // currentYear = camel case (lower camel case) - good practice
        // current_year = snake case - never do like this!
        // current-year = kebab case - never do like this!

        //int (integer) - whole number / natural number

        int age = 23;
        int currentYear = 2024;
        int inventoryItemCount = 64;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        //double (fractional number)

        double temperature = 36.6;
        double price = 19.99;
        double distance = 4560.2;

        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);

        //char (symbols)

        char grade = 'A';
        char myInitial = 'N';
        char currencySymbol = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        //boolean (logical type, can keep only two values: true or false)
        //How to name? has or is
        //Example: isSummer/ if (isSummer) {}; / isLoggedIn
        //Example; hasAccess / if(hasAccess) {};

        boolean hasAccess = true;
        System.out.println(hasAccess);
        boolean isSummer = false;
        System.out.println(isSummer);

        // long

        long phoneNumber = 32123344;
        System.out.println(phoneNumber);

        //float

        float interestRate = 4.5f;
        System.out.println(interestRate);

        //Arithmetic operators

        int a = 10;
        int b = 5;
        int sum = a+b;
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c-d;
        System.out.println(difference);

        int m = 7;
        int n = 3;
        int result = m*n;
        System.out.println(result);

        //Divide

        int num1 = 10;
        int num2 = 3;
        int division = num1/num2;
        System.out.println(division);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3/num4;
        System.out.println(divResult);

        //% (remainder of a division)

        int f = 12;
        int g = 5;
        int remainder = f%g; //10 = 3*3+1
        System.out.println(remainder);

        int number = 9;
        boolean isEvan = (number % 2 == 0);
        System.out.println(isEvan);

        //Increment++
        //++preIncrement
        //Decrement --
        //--Decrement

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++; //postIncrement = 11; counter =12;
        int preIncrement = ++counter; //preIncrement = 13; counter = 13;
        System.out.println(postIncrement);
        System.out.println(preIncrement);

        String name = "Nikita";
        String lastName = "Muzikants";
        System.out.println(name);
        System.out.println(lastName);

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        // %s - for String
        // %a - for numbers
        // %b - boolean

        System.out.println(String.format("My name is: %s, My surname is: %s", name, lastName));
        System.out.printf("My name is: %s, My surname is: %s\n", name, lastName);
        System.out.printf("My name is: %s, My surname is: %s%n", name, lastName);

        var myCurrentAge = 23;
        var text = "Hello World";

        String myVar;
        myVar = "Hello World";


   }
}


