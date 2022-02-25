// 1876. Substrings of Size Three with Distinct Characters

// A string is good if there are no repeated characters.

// Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

// Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

// A substring is a contiguous sequence of characters in a string.

// Input: s = "xyzzaz"
// Output: 1
// Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
// The only good substring of length 3 is "xyz".

// Input: s = "aababcabc"
// Output: 4
// Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
// The good substrings are "abc", "bca", "cab", and "abc"


// 3ms using Sliding Window + List
class Solution {
    public int countGoodSubstrings(String s) {
     Set<Character> set = new HashSet();
     int count = 0;
      
        
     for (int i = 0; i < s.length() - 2; i++) {
         String subStr = s.substring(i, i + 3);
         for (char ch : subStr.toCharArray()) {
             set.add(ch);
         }            
         if (set.size() == 3) {
             count++;
         }
         set.clear();
     }
     return count;
 }
}

// Constant key sliding window so hard coding
class Solution {
    public int countGoodSubstrings(String s) {
        char arr[] = s.toCharArray();
        int si = 0; // starting index
        int ei = 0; // ending index
        int n = s.length();
        
        int count = 0;
        while(ei < n){
            ei++;
            
            if(ei - si == 3){
                char first = arr[si];
                char second = arr[si + 1];
                char third = arr[ei - 1];
                if(first != second && second != third && first != third) count++;
                si++;
            }
        }
        
        return count;
    }
}