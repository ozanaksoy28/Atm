package com.company;

import java.util.Scanner;

public class MainMenu extends Process{
    float menu(float x, int y){
        float myBalance = x;
        int operation = y;
        Process process = new Process();
        switch (operation){
            case 1:
                myBalance=process.deposit(myBalance);
                break;
            case 2:
                myBalance=process.withdraw(myBalance);
                break;
            case 3:
                myBalance=process.mybalance(myBalance);
                break;
            case 4:
                myBalance=process.transfer(myBalance);
                break;
            case 5:
                process.quit();
                break;
        }
        return myBalance;
    }
}
