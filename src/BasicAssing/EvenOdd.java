package BasicAssing;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to : ");
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println(number + "  is a even number");
        }else {
            System.out.println(number + "  is a odd number");
        }
    }
}
