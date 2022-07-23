package Zoho.Super_Fast_Preparation_For_Upcoming_Drive;
public class Distinct_Words_5 {
    public static void main(String[] args) {
        String x = "This is zoho and zoho is good";

        String result[] = new String[x.length()];
        int b = 0;

        String temp = "";

        for(int i=0; i<x.length(); i++){            
            if(x.charAt(i) == ' ' || i==x.length()-1){
                // System.err.println(temp);
                if(x.charAt(i)!=' ') temp+= x.charAt(i);
                if(!temp.equals("")){
                    boolean found = false;
                    for(int kk=0;kk<b;kk++){
                        if(result[kk].equals(temp)){
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        result[b] = temp;
                        b++;                        
                    }                    
                }
                temp = "";
            }
            else{
                temp += x.charAt(i);                            
            }
        }

        for(int i=0; i<b; i++){
            System.out.print(result[i]+" ");
        }
    }
}
