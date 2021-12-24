509. Fibonacci Number
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.


// DP Solution
import java.util.*;
class Solution {
    Hashtable<Integer,Integer> ht = new Hashtable<>();
    
    public int fib(int n) {
        if(n==0) return 0;
        
        if(n<=2) return 1;
        
        if(ht.containsKey(n)) return ht.get(n);
        
        int value =  fib(n-1)+fib(n-2);
        ht.put(n,value);
        return value;
    }
}


// Classical Solution
class Solution {

    // public int fib(int n) {
    //     if(n<2) return n;
    //     int arr[] = new int[n+1];
    //     arr[0]=0;
    //     arr[1]=1;
    //     for(int i=2;i<=n;i++){
    //         arr[i]=arr[i-1]+arr[i-2];            
    //     }
    //     return arr[n];
    // }



    public int fib(int n) {
        if(n<2) return n;
        int a=0,b=1,res=0;
        for(int i=2;i<=n;i++){
            res=a+b;
            a=b;
            b=res;
        }
        return res;
    }
    
    
    
}