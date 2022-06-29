public class Spiral_Pattern {
    public static void main(String[] args) {
        int x = 5;
        int inc = 1;
        int arr[][] = new int[x][x];
        int row=0,col=-1;
        while (inc<=(x*x)) {

            col++;
            while(col<x && arr[row][col]==0) arr[row][col++]=inc++;
            col--;
                        
            row++;
            while(row<x && arr[row][col]==0) arr[row++][col]=inc++;
            row--;

            col--;
            while(col>=0 && arr[row][col]==0) arr[row][col--]=inc++;
            col++;

            row--;
            while(row>=0 && arr[row][col]==0) arr[row--][col]=inc++;
            row++;


        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
