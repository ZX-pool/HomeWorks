package it;

import java.util.Scanner;

public class Threads extends Thread {
    @Override
    public void run() {
        int countNumbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("input count of numbers Fibonacci : ");
        countNumbers = sc.nextInt();
        //sc.close();
        System.out.print("Thread of " + countNumbers + " Fibonacci is: 0, 1, ");
        int numberPrevious = 0;
        int number = 1;
        int fibonacci;
        for (int i = 0; i < countNumbers; i++) {
            fibonacci = number + numberPrevious;
            System.out.print(fibonacci + ", ");
            numberPrevious = number;
            number = fibonacci;
        }


    }
}


