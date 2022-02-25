// 890. Find and Replace Pattern

// Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the answer in any order.

// A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.

// Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.

// Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
// Output: ["mee","aqq"]
// Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}. 
// "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.

// Input: words = ["a","b","c"], pattern = "a"
// Output: ["a","b","c"]

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList();
        for (String word: words)
            if (match(word, pattern))
                ans.add(word);
        return ans;
    }

    public boolean match(String word, String pattern) {
        Map<Character, Character> m1 = new HashMap();
        Map<Character, Character> m2 = new HashMap();

        for (int i = 0; i < word.length(); ++i) {
            
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            
            if (!m1.containsKey(w)) m1.put(w, p);
            if (!m2.containsKey(p)) m2.put(p, w);
            
            if (m1.get(w) != p || m2.get(p) != w)
                return false;
        }

        return true;
    }
}