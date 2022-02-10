package com.workshop1;

public class SavingsAccount {

    public static float annualInterestRate;
    private float savingsBalance;

    public static float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public float getSavingsBalance() {
        return savingsBalance;
    }

    public static void setAnnualInterestRate(float annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void setSavingsBalance(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest(){

        float savingsBalance = getSavingsBalance();
        float annualInterestRate = getAnnualInterestRate();

        float monthlyInterest = savingsBalance * ((annualInterestRate/100)/12);

        savingsBalance = savingsBalance + monthlyInterest;

        setSavingsBalance(savingsBalance);

    }

    public static void modifyInterestRate(float newInterestRate){
        setAnnualInterestRate(newInterestRate);
    }

    SavingsAccount(float savingsBalance){
        setSavingsBalance(savingsBalance);
        setAnnualInterestRate(savingsBalance);
    }

}