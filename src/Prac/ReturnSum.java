package Prac;

import java.util.Scanner;

public class ReturnSum {

    public static void main(String[] args) {
        String an = name();
        System.out.println(an);

    }
    static String name(){
        Scanner input = new Scanner(System.in);
        String nam1 = input.nextLine();
        return nam1;
    }
}
