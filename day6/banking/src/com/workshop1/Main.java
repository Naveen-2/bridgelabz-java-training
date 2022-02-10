package com.workshop1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Workshop Problem 1: Banking - Saving Account Annual and Monthly Interest rate Calculation");

        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        System.out.println("Savings Balance of saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Savings Balance of saver 2: $" + saver2.getSavingsBalance());

        SavingsAccount.setAnnualInterestRate(4);
        System.out.println("First Month Interest rate set to " + SavingsAccount.getAnnualInterestRate() + "%.");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Savings balance of saver 1 after 1st month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver1.getSavingsBalance());
        System.out.println("Savings balance of saver 2 after 1st month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(5);
        System.out.println("Second Month Interest rate set to " + SavingsAccount.getAnnualInterestRate() + "%.");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Savings balance of saver 1 after 2nd month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver1.getSavingsBalance());
        System.out.println("Savings balance of saver 2 after 2nd month at " + SavingsAccount.getAnnualInterestRate() + "% interest: $" + saver2.getSavingsBalance());

    }
}
