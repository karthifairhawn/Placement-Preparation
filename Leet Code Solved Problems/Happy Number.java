202. Happy Number

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Input: n = 2
Output: false


class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hash = new HashSet<>();
        while(true){
            int value = findAdd(n);
            if(value==1) break;
            if(hash.contains(value)) return false;
            else{
                hash.add(value);
                n=value;
            }
        }
        return true;
    }
    static int findAdd(int x){
        char a[] = String.valueOf(x).toCharArray();
        int res=0;
        for(int i:a){
            res+=((i-'0')*(i-'0'));
        }
        return res;
    }
}