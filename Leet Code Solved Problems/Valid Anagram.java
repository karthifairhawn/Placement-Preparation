// 242. Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise
// Input: s = "anagram", t = "nagaram"
// Output: true
// Input: s = "rat", t = "car"
// Output: false

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1 = new int[26];
        // int[] s2 = new int[26];
        // char[] st1 = s.toCharArray();
        // char[] st2 = t.toCharArray();
        int n=s.length();
        if(n!=t.length()) return false;
        
        int i;
        
        for(i=0;i<n;i++){
            s1[s.charAt(i)-97]++;
            s1[t.charAt(i)-97]--;
            // s1[st1[i]-97]++;
            // s2[st2[i]-97]++;
        }
        for(i=0;i<26;i++){
            if(s1[i]!=0) return false;
        }
        return true;
    }
}