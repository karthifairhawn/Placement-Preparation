// 151. Reverse Words in a String

// Given an input string s, reverse the order of the words.

// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

// Input: s = "the sky is blue"
// Output: "blue is sky the"

// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.

// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

class Solution {  // Worst time and space complexity
    public String reverseWords(String s) {
        String[] sx = s.trim().split("\\s");
        StringBuilder res = new StringBuilder();
        
        
        for(int i=sx.length-1;i>-1;i--){
            if(!sx[i].equals("")){
                res.append(sx[i]);
                if(i!=0) res.append(" ");
            }
        }
        return res.toString();
    }
}