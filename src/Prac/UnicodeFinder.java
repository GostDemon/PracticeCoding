package Prac;

import java.util.Scanner;

public class UnicodeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter only one alphabet to know its unicode : ");
        String inputUnser = input.nextLine();
      char in =  inputUnser.charAt(0);
      int he =  findUnicode(in);
        System.out.println( he + " is the  unicode ");

    }

   public static int findUnicode(int just){
        return just;
   }
}
