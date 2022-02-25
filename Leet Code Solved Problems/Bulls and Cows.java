// 299. Bulls and Cows

// You are playing the Bulls and Cows game with your friend.

// You write down a secret number and ask your friend to guess what the number is. When your friend makes a guess, you provide a hint with the following info:

// The number of "bulls", which are digits in the guess that are in the correct position.
// The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position. Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
// Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.

// The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.


// Input: secret = "1807", guess = "7810"
// Output: "1A3B"
// Explanation: Bulls are connected with a '|' and cows are underlined:
// "1807"
//   |
// "7810"

// Input: secret = "1123", guess = "0111"
// Output: "1A1B"
// Explanation: Bulls are connected with a '|' and cows are underlined:
// "1123"        "1123"
//   |      or     |
// "0111"        "0111"
// Note that only one of the two unmatched 1s is counted as a cow since the non-bull digits can only be rearranged to allow one 1 to be a bull.


import java.util.*;
class Solution {
    public String getHint(String secret, String guess) {
        
        Hashtable<Character,Integer>  h = new Hashtable<>();
        
        for(char i:secret.toCharArray()){            
            if(h.containsKey(i))   h.put(i,h.get(i)+1);
            else                h.put(i,1);
        }
        // System.out.println(h);
        String k="";
        int bull=0,cow=0;
        for(int i=0;i<secret.length();i++){            
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
                h.put(guess.charAt(i),h.get(guess.charAt(i))-1);  
            }else k+=guess.charAt(i);
        }
        // System.out.println(h);
        // System.out.println(k);

        for(int i=0;i<k.length();i++){            
            if( h.containsKey(k.charAt(i)) && h.get(k.charAt(i))>0 ){
                cow++; 
                h.put(k.charAt(i),h.get(k.charAt(i))-1);  
            }            
        }
        
        String res = String.valueOf(bull)+"A"+String.valueOf(cow)+"B";
        return res;
        
    }
}