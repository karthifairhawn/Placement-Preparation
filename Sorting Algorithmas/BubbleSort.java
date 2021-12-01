import java.util.*;
public class BubbleSort
{
	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		int n = arr.length;
		
		for(int i=0;i<5;i++){
		    for(int j=0;j<n-1-i;j++){
		        if(arr[j]>arr[j+1]){
		            arr[j]+=arr[j+1];
		            arr[j+1] = arr[j]-arr[j+1];
		            arr[j]-=arr[j+1];
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
