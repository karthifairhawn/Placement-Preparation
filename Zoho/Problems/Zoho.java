import java.util.Scanner;
public class Zoho{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		//
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				}
			}
		}
		//sort comp
		sc.close();

		if(n==1) return ;
		System.out.print(arr[1]+" ");
		
		System.out.print(arr[0]+" ");

		int left=2;
		int right=n-1;
		while(left<right){
			System.out.print(arr[right--]+" ");			
			System.out.print(arr[left++]+" ");			
		}
		if(n%2!=0){
			System.out.print(arr[right--]+" ");				
		}
		sc.close();

	}
}




