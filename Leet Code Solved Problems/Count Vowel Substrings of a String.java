A substring is a contiguous (non-empty) sequence of characters within a string.

A vowel substring is a substring that only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.

Given a string word, return the number of vowel substrings in word.

Input: word = "aeiouu"
Output: 2
Explanation: The vowel substrings of word are as follows (underlined):
- "aeiouu"
- "aeiouu"

Input: word = "unicornarihan"
Output: 0
Explanation: Not all 5 vowels are present, so there are no vowel substrings.

Input: word = "cuaieuouac"
Output: 7
Explanation: The vowel substrings of word are as follows (underlined):
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"
- "cuaieuouac"


1 <= word.length <= 100
word consists of lowercase English letters only.



class Solution {
    public int countVowelSubstrings(String word) {
        char[] arr = word.toCharArray();
        
        Arrays.sort(arr);
        int c=0;
        
        int i=0;
        int inc=5;
        while(i<arr.length-4){
            if(isVowel(word.substring(i,i+inc))){
                c++;
                inc++;
                if(i+inc > arr.length){
                    inc=5;
                    i++;
                }
                
            }else if(moveornot(word.substring(i,i+inc))){                
                i++;
                inc=5;
            }else{
                inc++;
                if(i+inc > arr.length){
                    inc=5;
                    i++;
                }
            }
        }
        return c;
    }
    
    public boolean isVowel(String a){
        
        // System.out.println(a);
        
        if(!(a.contains("a") && a.contains("e") && a.contains("i") && a.contains("o") && a.contains("u"))) return false;    
        
        for(char ii:a.toCharArray()){
            if(ii=='a' || ii=='e' || ii=='i' || ii=='o' || ii=='u')    ;
            else return false;
                
        }
        // System.out.println(a+"--");
        return true;
    }
    
    public boolean moveornot(String str){
        for(int i=0; i<str.length(); i++){
             if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u');
            else return true;
        }
        return false;
    }
}