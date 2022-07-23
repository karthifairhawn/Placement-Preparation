package Zoho.Problems;

import java.util.Scanner;

class Program_1{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int freq[] = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){            
            if(arr[i] == 99999) continue;
            freq[i]++;
            for(int j = i+1; j<n;j++){
                if(arr[i]==arr[j]){
                    freq[i]++;
                    arr[j] = 99999;
                }     
            }
        }

        for(int i = 0; i < n; i++){
            for(int j=0;j<n-1-i;j++){
                if(freq[j]==freq[j+1] && arr[j]<arr[j+1]){
                    int temp = freq[j];
                    freq[j] = freq[j+1];
                    freq[j+1]=temp;
                    //
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp; 
                }
                if(freq[j]>freq[j+1]){
                    int temp = freq[j];
                    freq[j] = freq[j+1];
                    freq[j+1]=temp;
                    //
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i]!=99999){
                for(int j=0;j<freq[i];j++){
                    System.out.print(arr[i]+" ");

                }
            }
        }
		sc.close();

    }
}
