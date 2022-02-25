// 392. Is Subsequence
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// Input: s = "abc", t = "ahbgdc"
// Output: true

// Input: s = "axc", t = "ahbgdc"
// Output: false   

// 0 <= s.length <= 100
// 0 <= t.length <= 104
// s and t consist only of lowercase English letters.
 
// Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?

class Solution {
    public boolean isSubsequence(String s, String t) {
	int i = 0;
	int coins = s.length();
	for (char c: s.toCharArray())
		while (i < t.length())
			if (c == t.charAt(i++)) {
				coins--;
				break;
			}
	return coins == 0;
    }
}