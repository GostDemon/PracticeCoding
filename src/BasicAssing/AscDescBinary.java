package BasicAssing;

public class AscDescBinary {
    public static void main(String[] args) {
        int target = 23;
      //  int[] arr = {1,2,3,4,5,6,7,8,9,10,11,13,14,15,16};
        int[] arr = {45,34,23,11};
        System.out.println(binary(arr,target));

    }
    static int binary(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc=true;
        }else
            isAsc = false;

        while (start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] <  target){
                    start = mid +1;
                }else
                    end = mid-1;
            }else {
                if(arr[mid] < target){
                    end = mid-1;
                }else
                    start = mid +1;
            }

        }
        return -1;
    }
}
