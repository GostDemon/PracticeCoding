package Prac;

public class FibanicSeries {
    public static void main(String[] args) {
        // trying to print the fibonic series

        int a =0; int b =1;
        for (int i = 0; i < 100; i++) {
           int  fib = a+b;
            a =b;
            b=fib;
            System.out.print(fib + " ");
        }

    }
}
