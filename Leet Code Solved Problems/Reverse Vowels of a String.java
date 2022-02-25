// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

// Input: s = "hello"
// Output: "holle"

// Input: s = "leetcode"
// Output: "leotcede"


class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int left=0;
        int right=word.length-1;
        char z='a';
        
        while(left<=right){
            if(isVowel(word[left])!=-1 &&  isVowel(word[right])!=-1){
                z=word[left];
                word[left] = word[right];
                word[right] = z;                
                left++;right--;
            }else if(isVowel(word[right])==-1){
                right--;
            }else if(isVowel(word[left])==-1){
                left++;
            }else{
                left++;
                right--;
            }
            
        }
        StringBuilder res = new StringBuilder();
        for(char h:word) res.append(h);
        return res.toString();
        
        // String res = "";
        // for(char h:word) res+=h;
        // return res;
    }
    
    public int isVowel(char a){
     if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
     {
        return 1;
     }
      else
      {
        return -1;
      }
    }
}