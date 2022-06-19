package Prac;

public class Count {
    public static void main(String[] args) {
        //this is to count the number of reapeated numbers in the integer
        int number = 45634535;
        int count =0;
        while (number>0){
            int rem = number % 10;
            // Here we have the "if" condition for the repeated number
            if(rem == 5){
                count++;
            }
            number = number/10;
        }
        System.out.println(count);
    }
}
