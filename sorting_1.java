// Insertion and Bubble Sort

import java.util.*;
public class sorting_1{
    public static void main(String args[]) {
        int[] arr = {9,4,1,8,2,0,-1};
        
        int n = arr.length;
        
        
        // Insertion Sort
        // int key,j;
        // for(int i=1;i<n;i++){
        //     key=arr[i];
        //     j=i-1;
        //     while(j>=0 && arr[j]>key){
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        //     arr[j+1]=key;
        // }
        
        // Bubble Sort
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
          
        System.out.println(Arrays.toString(arr));
    }
}