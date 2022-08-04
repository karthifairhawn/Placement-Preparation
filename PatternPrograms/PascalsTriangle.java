package PatternPrograms;

public class PascalsTriangle {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact(i-j)*fact(j))+"   ");
            }
            System.out.println();
        }

    }

    private static int fact(int i) {
        int res = 1;

        while(i>0){
            res*=i--;
        }
        return res;
    }
}
