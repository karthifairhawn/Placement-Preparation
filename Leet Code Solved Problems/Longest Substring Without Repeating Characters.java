// 3. Longest Substring Without Repeating Characters

// Given a string s, find the length of the longest substring without repeating characters.

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> substring = new LinkedHashMap<Character,Integer>();
        int max_len=0;
        
        char[] s_arr = s.toCharArray();
        
        for(int i=0;i<s.length();i++){
            if(!substring.containsKey(s_arr[i])){
                substring.put(s_arr[i],i);
            }else{
                i=substring.get(s_arr[i]);
                substring.clear();
            }
            
            
            if(max_len<substring.size()){
                max_len=substring.size();
            }
            
        }
        return max_len;
        
    }
}