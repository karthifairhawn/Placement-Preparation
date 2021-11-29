// 409. Longest Palindrome

// Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

// Input: s = "abccccdd"
// Output: 7
// Explanation:
// One longest palindrome that can be built is "dccaccd", whose length is 7.

// Input: s = "a"
// Output: 1


// Input: s = "bb"
// Output: 2

class Solution {
    public int longestPalindrome(String s) {
        int arr[] = new int[128];
        int res=0;
        
        for(char i : s.toCharArray()) arr[i]++;
        
        for(int i: arr){
            res+=(i/2) *2;
            if(res%2==0 && i%2==1){
                res++;
            }
        }
        
        return res;
    }
}