// 1137. N-th Tribonacci Number

// The Tribonacci sequence Tn is defined as follows: 

// T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

// Given n, return the value of Tn.

// Input: n = 4
// Output: 4
// Explanation:
// T_3 = 0 + 1 + 1 = 2
// T_4 = 1 + 1 + 2 = 4

// Input: n = 25
// Output: 1389537

// 0 <= n <= 37
// The answer is guaranteed to fit within a 32-bit integer, ie. answer <= 2^31 - 1.


import java.util.*;
class Solution {
    Hashtable<Integer,Integer> ht = new Hashtable<>();
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        if(n==3) return 2;
        if(ht.containsKey(n)) return ht.get(n);
        
        int value =  tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        ht.put(n,value);
        return value;
    }
}
