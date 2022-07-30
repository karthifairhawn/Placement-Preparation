package SortingAlgorithmas;

import java.util.*;
public class QuickSort
{
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int a = low-1;
        for(int i=low;i<high;i++){
            if(arr[i]<pivot){
                a++;
                int temp = arr[a];
                arr[a] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[a+1];
        arr[a+1] = temp;
        return a+1;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }
	public static void main(String[] args) {
	    int arr[] = {3,1,2,5,4};
	    int n = arr.length;
	    quickSort(arr,0,n-1);
	    System.out.println(Arrays.toString(arr));

	}
}
