// 383. Ransom Note

// Given two stings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.

// Each letter in magazine can only be used once in ransomNote.

// Input: ransomNote = "a", magazine = "b"
// Output: false

// Input: ransomNote = "aa", magazine = "ab"
// Output: false

// Input: ransomNote = "aa", magazine = "aab"
// Output: true
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[] = new int[26];
        
        for(char a:magazine.toCharArray()){
            arr[a-'a']++;
        }               
        for(char a:ransomNote.toCharArray()){
            arr[a-'a']--;
            if(arr[a-'a']<0){
                return false;
            }
        }               
        return true;
        
    }
}