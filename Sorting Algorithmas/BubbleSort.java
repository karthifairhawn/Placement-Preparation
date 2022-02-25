import java.util.*;
public class BubbleSort
{
	public static void main(String[] args) {
		
		int arr[] = {32,21,1,34,97,46,67,56};
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			boolean swapped = false;
		    for(int j=0;j<n-1-i;j++){				
		        if(arr[j]>arr[j+1]){
					swapped=true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;		            
		        }
				if(!swapped){
					break;
				}
		    }
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
