package Zoho.Super_Fast_Preparation_For_Upcoming_Drive;
public class DiamondPattern_1 {
    
    public static void main(String[] args) {
        String s = "helloworl";
        boolean bounce = true;
        int left = s.length()/2;
        int right = left;

        for(int i=0;i<s.length();i++){  
            for(int j=0;j<s.length();j++){
                if(j==left || j==right){
                    System.out.print(s.charAt(j)+" ");
                }else{
                    System.out.print("  ");
                }
            }
            if(left==0) bounce=false;
            if(bounce){ left--; right++; }
            else{ left++; right--;}
            System.out.println();
        }
        
    }
}
