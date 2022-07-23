package Zoho.Super_Fast_Preparation_For_Upcoming_Drive;

public class Reverse_Numver {
    public static void main(String[] args) {
        reverseNumber(1034);
    }
    public static void reverseNumber(int x){
        int res = 0;
        while(x!=0){
            res=(res*10)+(x%10);
            x=x/10;
        }
        System.out.println(res);
    }
}
