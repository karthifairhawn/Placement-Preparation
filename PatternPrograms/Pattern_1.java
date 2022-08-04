
// Pattern 1
//       2
//      4  6
//     8 10 12
//   14 16 18 20
//  22 24 26 28 30






package PatternPrograms;

public class Pattern_1 {
    public static void main(String[] args) {

        int n =5;
        int counter = 2;        

        for(int i = n; i >=1; i--) {
            for(int j = 1; j <= n; j++) {
                if(i<=j){
                    System.out.printf("%3d",counter);
                    counter+=2;
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }

    }
}
