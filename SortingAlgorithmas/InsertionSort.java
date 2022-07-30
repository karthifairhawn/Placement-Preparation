package SortingAlgorithmas;


import java.util.*;
public class InsertionSort
{
	public static void main(String[] args) {
        int arr[] = {3,4,2,5,1};
        int n = arr.length;
        
        
        for(int i=1;i<n;i++){
            int b = i-1;
            int key = arr[i];
            while(b>=0 && arr[b] > key){
                arr[b+1] = arr[b];
                b--;
            }
            arr[b+1] = key;
        }
        
        
        System.out.println(Arrays.toString(arr));
	}
}
