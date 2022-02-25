// 1614. Maximum Nesting Depth of the Parentheses

// A string is a valid parentheses string (denoted VPS) if it meets one of the following:

// It is an empty string "", or a single character not equal to "(" or ")",
// It can be written as AB (A concatenated with B), where A and B are VPS's, or
// It can be written as (A), where A is a VPS.
// We can similarly define the nesting depth depth(S) of any VPS S as follows:

// depth("") = 0
// depth(C) = 0, where C is a string with a single character not equal to "(" or ")".
// depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.
// depth("(" + A + ")") = 1 + depth(A), where A is a VPS.
// For example, "", "()()", and "()(()())" are VPS's (with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.

// Given a VPS represented as string s, return the nesting depth of s.

// Input: s = "(1+(2*3)+((8)/4))+1"
// Output: 3
// Explanation: Digit 8 is inside of 3 nested parentheses in the string.

// Input: s = "(1)+((2))+(((3)))"
// Output: 3

// Input: s = "1+(2*3)/(2-1)"
// Output: 1

class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max_depth=0;
        int curr_depth=0;
        
        
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(')');
                curr_depth = Math.max(curr_depth, st.size());
            }else if(c==')'){
                st.pop();
            }
            max_depth = Math.max(max_depth, curr_depth);
        }
        return max_depth;
    }
}

// Using Just Integer
// int depth=0;            
// int mdepth=0;

// for(char c:s.toCharArray()){
//     if(c=='('){
//         depth++;
//         mdepth=Math.max(depth,mdepth);
//     }else if(c==')'){
//         depth--;
//     }
// }
// return mdepth;