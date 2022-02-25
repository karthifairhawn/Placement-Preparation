
public class Look_and_Say {
    public static void main(String[] args) {
      
        int n = 5;
        String s = "1";
        System.out.println(1);
        
        int i=1;
        while(i<n){
            String newString = "";
            int count = 1;
            char current = s.charAt(0);

            for(int j=1; j<s.length(); j++) {
                if(s.charAt(j)==current){
                    count++;
                }else{
                    newString = newString+count+""+current;
                    System.out.print(count+""+current+"");
                    count = 1;
                    current = s.charAt(j);
                }
            }            
            System.out.println(count+""+current);
            newString =  newString+count+current;
            s=newString;
            i++;
        }
        
    }
}
