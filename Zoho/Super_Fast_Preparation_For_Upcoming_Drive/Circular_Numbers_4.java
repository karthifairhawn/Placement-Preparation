public class Circular_Numbers_4 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n+n-1][n+n-1];
        int row=0;int col=0;

        for(int i=n;i>0;i--){            
            
            
            while(col<(n+n-1) && arr[row][col]==0) arr[row][col++] = i;
            col--;

            row++;
            while(row<(n+n-1) && arr[row][col]==0) arr[row++][col] = i;
            row--;

            col--;
            while(col>=0 && arr[row][col]==0) arr[row][col--] = i;
            col++;

            row--;
            while(row>=0 && arr[row][col]==0) arr[row--][col] = i;

            row++;
            col++;


        }

        // print mat
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
