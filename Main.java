package testpackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal;
        float annualInterest;
        byte years;

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = keyboard.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Number is out of range.");
        }

        while (true) {
            System.out.print("Annual Interest Rate (1-30): ");
            annualInterest = keyboard.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30)
                break;
            System.out.println("Number is out of range.");
        }

        float monthlyRate = annualInterest / PERCENT / MONTHS_IN_YEAR ;

        while (true) {
            System.out.print("Period in Years (1-30): ");
            years = keyboard.nextByte();
            if (years >= 1 && years <= 30) {
                break;
            }
            System.out.println("Number is out of range.");
        }

        int numberOfPayments = years * MONTHS_IN_YEAR;

        double money = principal
                * (monthlyRate*Math.pow((1 + monthlyRate), numberOfPayments)
                / (Math.pow((1+monthlyRate), numberOfPayments) - 1));

        String mortgage = NumberFormat.getCurrencyInstance().format(money);
        System.out.println(mortgage);
    }
}