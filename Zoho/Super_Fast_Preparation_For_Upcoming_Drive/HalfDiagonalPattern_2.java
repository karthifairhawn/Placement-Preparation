public class HalfDiagonalPattern_2 {
    public static void main(String[] args) {
        
		int n = 5;
		
		int mat[][] = new int[n][n];
		int count=1;
		int row=0;
		int col=0;
		
		for(int i=0;i<n/2;i++){		                
		    
		    for(;row<n && mat[row][col]==0;row++,col++) mat[row][col]=count++;
		    
		    col = col-1;
            row=row-2;
		    for(;row>=0 &&  mat[row][col]==0;row--) mat[row][col]=count++;
		    
		    row = row+1;
            col=col-1;
		    for(;col>=0 && mat[row][col]==0;col--) mat[row][col] = count++;
		    		  
		    row+=1;
            col+=2;            
		}
		
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){

		        if(mat[i][j]!=0) System.out.print(mat[i][j]+" ");
		        else System.out.print("  ");
		    }
		    System.out.println();
		}
    }
}
