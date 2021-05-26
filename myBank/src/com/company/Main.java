package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu();
        float balance = 0;
        int operator=0;
        while(operator!=5){
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show my balance");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            operator=op.nextInt();
            balance=mainMenu.menu(balance,operator);
            System.out.println("Balance:" +balance);
        }
    }
}
