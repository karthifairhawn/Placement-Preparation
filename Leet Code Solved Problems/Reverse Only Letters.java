// Given a string s, reverse the string according to the following rules:

// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.

// Input: s = "ab-cd"
// Output: "dc-ba"

// Input: s = "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"

// Input: s = "Test1ng-Leet=code-Q!"
// Output: "Qedo1ct-eeLg=ntse-T!"

// 1 <= s.length <= 100
// s consists of characters with ASCII values in the range [33, 122].
// s does not contain '\"' or '\\'

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] res = s.toCharArray();
        
        int right=res.length-1;
        int i=0;
        
        while(i<right){
            if(!Character.isAlphabetic(res[i])){
                i++;
                continue;
            }
            if(!Character.isAlphabetic(res[right])){
                right--;
                continue;
            }
            if(Character.isAlphabetic(res[i]) && Character.isAlphabetic(res[right])){
                char temp = res[i]; 
                res[i] = res[right];
                res[right] = temp;            
                i++;
                right--;
            }
        }
        
        StringBuilder sb =new StringBuilder();
        
        for(char c:res) sb.append(c);
        
        return sb.toString();
        
    }
}