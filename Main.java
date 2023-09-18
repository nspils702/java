package testpackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = keyboard.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = keyboard.nextFloat();
        float monthlyRate = annualInterest / PERCENT / MONTHS_IN_YEAR ;

        System.out.print("Period (Years): ");
        byte years = keyboard.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double money = principal
                * (monthlyRate*Math.pow((1 + monthlyRate), numberOfPayments)
                / (Math.pow((1+monthlyRate), numberOfPayments) - 1));

        String mortgage = NumberFormat.getCurrencyInstance().format(money);
        System.out.println(mortgage);
    }
}