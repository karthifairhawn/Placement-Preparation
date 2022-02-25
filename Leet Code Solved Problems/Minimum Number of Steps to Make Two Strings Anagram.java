// 1347. Minimum Number of Steps to Make Two Strings Anagram

// Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.

// Return the minimum number of steps to make t an anagram of s.

// An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

// Input: s = "bab", t = "aba"
// Output: 1
// Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.

// Input: s = "leetcode", t = "practice"
// Output: 5
// Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.

class Solution {
    public int minSteps(String s, String t) {
                   
        int h[] = new int[26];
        
        for(char i:s.toCharArray()){
            h[i-'a']++;
        }
        
        int res=0;
        
        for(char i:t.toCharArray()){
            if(h[i-'a']==0){
                res++;
            }else if(h[i-'a']>0){
                h[i-'a']--;
            }
        }
        
        return res;
        
    }
}