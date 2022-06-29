public class x_crossed_word {
    public static void main(String[] args){
        String word = "HelloWorl";

        for(int i=0;i<word.length();i++){
            for(int j=0;j<word.length();j++){
                if(i==j || j==word.length()-i-1){
                    System.out.print(word.charAt(j));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
