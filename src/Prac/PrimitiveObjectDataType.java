package Prac;

import java.util.Arrays;

public class PrimitiveObjectDataType {
    public static void main(String[] args) {
        int x =10;
        int y =x;
        System.out.println( x + " " + y);
         y =23;
        System.out.println(y);
        System.out.println();
        int[] arr = {1,2,3,4};
        int[] arr1 = arr;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        arr1[1]=9;
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }
}
