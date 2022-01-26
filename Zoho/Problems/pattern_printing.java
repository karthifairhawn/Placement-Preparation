public class pattern_printing {
    public static void main(String[] args){
        String a ="sdfgsdgsdg";

        int start=0;
        int end=a.length()-1;

        for(int i=0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                if(j==start || j==end){
                    System.out.print(a.charAt(j));
                }else{
                    System.out.print(" ");
                }            
            }
            System.out.println();
            start++;
            end--;
        }
    }
}
