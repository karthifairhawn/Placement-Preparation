package Zoho.Super_Fast_Preparation_For_Upcoming_Drive;
public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String x ="dsjhnsgjmalayalamsdgbdsg";

        String longValue="";
        int longCount=0;
        for(int i = 0; i <x.length(); i++) {
            for(int j=x.length()-1; j>i; j--) {
                if(isPalindrome(x.substring(i,j+1))) {
                    if(j-i+1>longCount) {
                        longCount=j-i+1;
                        longValue=x.substring(i,j+1);
                    }
                }
            }
        }
        System.out.println(longValue);
    }

    public static boolean isPalindrome(String x) {
        int i = 0;
        int j = x.length()-1;
        while(i<j) {
            if(x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
