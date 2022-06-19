package Prac;

public class ReverseNumber {
    public static void main(String[] args) {
        //reverse the input number
        int number = 123456;
        int reverseNumber =0;
        while (number>0){
            int reminder = number % 10;
            number = number/10;
            reverseNumber = (reverseNumber * 10) + reminder;
        }
        System.out.println(reverseNumber);
    }
}
