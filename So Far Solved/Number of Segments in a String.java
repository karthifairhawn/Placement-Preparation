// 434. Number of Segments in a String


// Input: s = "Hello, my name is John"
// Output: 5
// Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]


// Input: s = "Hello"
// Output: 1

// Input: s = "love live! mu'sic forever"
// Output: 4

// Input: s = ""
// Output: 0

// 0 <= s.length <= 300
// s consists of lower-case and upper-case English letters, digits or one of the following characters "!@#$%^&*()_+-=',.:".
// The only space character in s is ' '.

class Solution {
    public int countSegments(String s) {
        int count=0;
        boolean space=true;
        for(char i:s.toCharArray()){
            if(i!=' ' && space){
                count++;
                // System.out.println(i);
                space=false;
            }else if(i==' '){
                space=true;
            }
        }
        return count;
    }    
}