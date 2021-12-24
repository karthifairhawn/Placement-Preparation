// 70. Climbing Stairs

// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step


import java.util.*;
class Solution {
    Hashtable<Integer,Integer> ht = new Hashtable<>();
    public int climbStairs(int n) {
        if(n==0) return 1;     
        if(n<0) return 0;
        if(ht.containsKey(n)) return ht.get(n);
        int value = climbStairs(n-1) + climbStairs(n-2);
        ht.put(n,value);
        return value;
    }

}