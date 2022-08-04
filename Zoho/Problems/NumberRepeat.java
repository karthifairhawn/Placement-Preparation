package Zoho.Problems;

public class NumberRepeat {
    public static void main(String[] args) {
        char[] s = "a1b3c6d12".toCharArray();

        int ptr = 0;
        char c= '\0';
        while(ptr<s.length) {

            if(!(s[ptr]>='0' && s[ptr]<='9')) {
                c = s[ptr];
                ptr++;                
            }

            int num = 0;
            while(ptr<s.length && s[ptr]>='0' && s[ptr]<='9') {
                num = num*10 + (s[ptr]-'0');
                ptr++;
            }
            
            for(int k=0;k<num;k++){
                System.out.print(c);
            }

        }
    }
}
