package Prac;

public class SumOfArray {
    static int sum(int[] arr, int n){
        int answer =0;
        for (int i=0;i<n;i++) {
            answer = answer + arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,100};
      int n = 6;
        System.out.println(sum(arr,n));
    }
}
