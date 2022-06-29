import java.util.Arrays;

public class Prime_Alternative_Print {
    public static void main(String[] args) {
        int n = 40;

        int arr[] = new int[n];
        int insert = 0;
        int total_insert = 0;

        for(int i=1;i<10000;i++){
            if(total_insert == n){
                break;
            }
            if(isPrime(i)){
                arr[insert++] = i;
                insert++;
                total_insert++;
            }
            if(insert>=n) insert = 1;
        }
        System.out.println(Arrays.toString(arr));        
    }
    public static boolean isPrime(int num){

        for(int j=2;j<=num/2;j++){
            if(num%j==0){
                return false;
            }
        }
        return true;
    }
}
