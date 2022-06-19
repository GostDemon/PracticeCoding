package Prac;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Operator : ");
        char op = input.next().charAt(0);
        System.out.print("Enter the num1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the num2 : ");
        int num2 = input.nextInt();
        int answer =0;
        if (op == '+' ){
             answer = num1 + num2;
        }else  if(op == '-'){
            answer = num1 - num2;
        }
        System.out.println(answer);
    }
}
