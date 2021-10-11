package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        System.out.println("Ваш балланс : " + amount);
        return amount;
    }

    void deposit(double sum){
        amount = amount + sum;
    }

    void withDraw(int sum)throws LimitException{
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма больше баланса", amount);
        }else {
            amount = amount - sum;
            System.out.println("Было снято : " + sum + " " + "Осталось : " + amount);

        }
    }
}
