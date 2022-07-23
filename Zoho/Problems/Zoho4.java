package Zoho.Problems;


import java.util.*;
class Zoho4{
 public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	int max=0;
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
		if(arr[i]>max){
			max=arr[i];
		}
	}
	
	if(n<=3){
		System.out.print(max);
		sc.close();
		return;
	}
	//
	int evn_sum=0,odd_sum=0;
	if(n%2==0){
		
		for(int i=0;i<n;i++){
			if(i%2==0) evn_sum+=arr[i];
			else odd_sum+=arr[i];
		}
	}
	//
	int i=1;
	int res=0;
	boolean took_first=false;
	while(i<n){
		if(i==n-1){	
			if(took_first){res+=arr[n-2];}		
			else if(arr[n-2]>arr[i]) res+=arr[n-2];
			else res+=arr[i];
			break;
		}
		int t_sum = arr[i-1]+arr[i+1];
		if(t_sum>arr[i]){
			res+=t_sum;
			i+=4;
			took_first=true;
		}else{
			res+=arr[i];
			i+=3;
		}
	}
	if(evn_sum>res){
		if(evn_sum>odd_sum) System.out.println("OP="+evn_sum);
		else System.out.println("OP="+odd_sum);
	}else if(odd_sum>res){
		System.out.println("OP="+odd_sum);
	}else{
		System.out.println("OP="+res);
	}
		
	sc.close();
	
 }
}