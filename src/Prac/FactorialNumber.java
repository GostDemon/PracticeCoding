package Prac;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number to find the fatorial of it : ");
        int num = input.nextInt();
        int factorial =1;
        for (int i =1;i<=num;i++){
            factorial = factorial*i;
        }
        System.out.println(factorial);

    }
}
