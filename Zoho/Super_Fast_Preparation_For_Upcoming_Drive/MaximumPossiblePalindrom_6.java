public class MaximumPossiblePalindrom_6 {
    public static void main(String[] args) {
        String x = "madameaga";

        int key[] = new int[255];        

        for (int i = 0; i < x.length(); i++) {
            key[x.charAt(i)]++;
        }

        String result = "";
        char c='-';

        for (int i = 0; i < 255; i++) {
            if (key[i] % 2 == 0) {
                for (int j = 0; j < key[i] / 2; j++) {
                    result += (char) i;
                }                
            }else{
                c= (char)i;
            }
        }

        String result_rev ="";
        for(int i=result.length()-1;i>=0; i--) {
            result_rev+=result.charAt(i);
        }
        
        System.out.print(result);
        if(c!='-') System.out.print(c);
        System.out.print(result_rev);
    }
}
