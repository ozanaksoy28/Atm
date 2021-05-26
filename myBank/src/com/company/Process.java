package com.company;
import java.util.Scanner;

public class Process implements BankProcesses {

    Scanner scanner = new Scanner(System.in);
    public float deposit(float x) {
        System.out.println("Deposite amount:");
        float amount = scanner.nextFloat();
        return x + amount;
    }
    @Override
    public float withdraw(float x) {
        System.out.println("Withdraw amount:");
        float amount = scanner.nextFloat();
        if(amount>x){
            System.out.println("insufficient balance");
            return x;
        }else {
            return x-amount;
        }
    }

    @Override
    public float mybalance(float x) {
        return x;
    }

    @Override
    public float transfer(float x) {
        System.out.println("Transfer amount:");
        float amount = scanner.nextFloat();
        if(amount>x){
            System.out.println("insufficient balance.");
            return x;
        }else {
            return x-amount;
        }
    }

    @Override
    public void quit() {
        System.out.println("Quited...");
    }
}
