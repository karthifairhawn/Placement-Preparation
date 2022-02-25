import java.util.Arrays;

public class sort_based_on_sum {
    public static void main(String[] args){

        int arr[] = {12,21,43,34};
        
        int sum[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            sum[i] = sum(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(sum[j]==sum[j+1] && arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;                    
                    
                    temp=sum[j+1];
                    sum[j] =sum[j+1];
                    sum[j+1] =temp;
                }else 
                if(sum[j]>sum[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;                    
                    
                    temp=sum[j];
                    sum[j] =sum[j+1];
                    sum[j+1] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

         

    }
    public static int sum(int x) {
        int sum=0;
        while(x!=0){
            int r = x%10;
            sum+=r;
            x=x/10;
        }
        return sum;
    }
}
