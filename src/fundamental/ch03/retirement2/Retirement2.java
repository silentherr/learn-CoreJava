package fundamental.ch03.retirement2;

import java.util.Scanner;

/**
 * This program demonstrates a <code>do/while</code> loop.
 */
public class Retirement2 {
    public static void main(String[] args) {
        // read inputs
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        String input;

        // update account balance while user isn't ready to retire
        do {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            years++;

            // print current balance
            System.out.printf("After year %d, your balance is %,.2f%n", years, balance);

            // ask if ready to retire and get input
            System.out.print("Ready to retire? (Y/N) ");
            input = in.next();
        } while (input.equals("N"));
    }
}
