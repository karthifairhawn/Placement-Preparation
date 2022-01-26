import java.util.*;
public class Pattern_Printing_1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=5;
	    
        for (int i=0; i<n;i++){
            int c = n-i;
            int current = i+1;

            for (int j=0; j<c;j++){
                System.out.print(current+" ");
                current = current+n-j;
            }
            System.out.println();
        }
	}
}