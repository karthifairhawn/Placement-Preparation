import java.util.Arrays;

public class fibTabulation {
    public static void main(String[] args){
        int arr[] = new int[30000];
        arr[1] = 1;

        for(int i = 0; i < arr.length-2; i++){
            arr[i+1]+=arr[i];
            arr[i+2]+=arr[i];
        }

        System.out.println(Arrays.toString(arr));

    }
}
