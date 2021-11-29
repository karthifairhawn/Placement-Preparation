// 290. Word Pattern

// Given a pattern and a string s, find if s follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true


// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false


import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Hashtable<String,String> hash_1 = new Hashtable<>();
        Hashtable<String,String> hash_2 = new Hashtable<>();
        
        String[] comp = s.split(" ");
        if(pattern.length()!=comp.length) return false;
        
        for(int i=0;i<comp.length;i++){
            
            String w1 = String.valueOf(pattern.charAt(i));
            String w2 = comp[i];
            
            if(!hash_1.containsKey(w1))    hash_1.put(w1,w2);
            if(!hash_2.containsKey(w2))    hash_2.put(w2,w1);            
            
            if(!hash_1.get(w1).equals(w2) || !hash_2.get(w2).equals(w1)){
//                 System.out.println(!hash_1.get(w1).equals(w2));              
//                 System.out.println(hash_1.get(w1)+" "+w2);
                       
                return false;
            }
            
        }
        return true;
    }
}