import java.util.*;
class Zoho3{
 public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int mat[][] = new int[n][n];
	int celeb[] = new int[n];	
	
	for(int i=0;i<n;i++){
	  for(int j=0;j<n;j++){
		mat[i][j] = sc.nextInt();
		if(mat[i][j]==1) celeb[i]=1;
	  }
	}
	boolean found=false;

	for(int i=0;i<n;i++){
		if(celeb[i]==0){
			boolean celebe=true;

			for(int a=0;a<n;a++){
				if(a==i) continue;
				if(mat[a][i]==0){
					celebe=false;
					break;
				}
				
			}
			if(celebe){
				System.out.println("id="+i);
				found=true;
			}

		}
		
	}
	if(!found){
		System.out.println("No celeb");
	}

	
 }
}