package it;

import java.util.Scanner;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        int countNumbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("\ninput count of numbers Fibonacci : ");
        countNumbers = sc.nextInt();
       // sc.close();
        System.out.print("\nRunnable of " + countNumbers + " Fibonacci is: ");
        int numberPrevious = 0;
        int number = 1;
        int[] fibonacci = new int[countNumbers];
        for (int i = 0; i < countNumbers; i++) {
            fibonacci[i] = number + numberPrevious;
            numberPrevious = number;
            number = fibonacci[i];

        }
        for (int i = countNumbers-1 ; i > 0; i--) {
            System.out.print(fibonacci[i] + ", ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("1, 0");

    }

}
