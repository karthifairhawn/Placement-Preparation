/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void merge(int [] left,int[] right,int[] arr,int l_len,int r_len){
        int l=0,r=0,i=0;
        
        while(l<l_len && r<r_len){
            if(left[l]<right[r])    arr[i++] = left[l++];
            else                    arr[i++] = right[r++];
        }
        while(l<l_len)  arr[i++] = left[l++];
        while(r<r_len)  arr[i++] = right[r++];
    }
    public static void mergeSort(int[] arr,int n){
        if(n<2) return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        
        
        for(int i=0;i<n;i++){
            if(i<mid) left[i] = arr[i];
            else right[i-mid] = arr[i];
        }
        
        mergeSort(left,mid);
        mergeSort(right,n-mid);
        
        merge(left,right,arr,mid,n-mid);
        
    }
    
	public static void main(String[] args) {
		int arr[] = {12,13,42,16,1,2,5,4,89,82};
		int n = arr.length;
		mergeSort(arr,n);
		System.out.println(Arrays.toString(arr));
	}
}
