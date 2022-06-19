package Prac;

import java.util.Scanner;

public class PositiveNegitive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any number : ");
        int number = input.nextInt();
        if(number > 0)
            System.out.println("The number you entered is a Positive number ");
        else if (number < 0)
            System.out.println("the number you entered is a Negative Number ");
        else
            System.out.println("The number you entered is Zero");
    }
}
