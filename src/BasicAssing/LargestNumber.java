package BasicAssing;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 1, b=2, c=3;
        if(a > b && a > c){
            System.out.println(a + " is the larger aboung three");
        }else if(b > c && b>a){
            System.out.println(b + " is the larger aboung three");
        }else
            System.out.println(c + " is the larger number");
    }
}
