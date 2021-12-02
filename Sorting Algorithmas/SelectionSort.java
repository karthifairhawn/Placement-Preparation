import java.util.*;
public class SelectionSort
{
	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		int n = arr.length;
		
        for (int i = 0; i < n-1; i++){
            int small = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[small]){
                    small = j;
                    int temp = arr[i];
                    arr[i] = arr[small];
                    arr[small] = temp; 
                }
  	        
        }
		System.out.println(Arrays.toString(arr));
		
	}
}
