package testpackage;

import java.util.Scanner;

public class FizzBuzz {
    /* rules:
        if divisible by 5 fizz
        if divisible by 3 buzz
        if both then fizzbuzz
        if none then return number
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int test = keyboard.nextInt();

        if (test % 15 == 0)
            System.out.println("fizzbuzz");
        else if (test % 5 == 0)
            System.out.println("fizz");
        else if (test % 3 == 0)
            System.out.println("buzz");
        else
            System.out.println(test);
    }
}
