// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2x.


// Input: n = 1
// Output: true
// Explanation: 20 = 1

class Solution {
    //     public boolean isPowerOfTwo(int n) {
    //         if(n<=0) return false;
    //         if(n==2 || n==1) {
    //             return true;
    //         }
    //         if(n%2==0) {
    //             return isPowerOfTwo(n/2); 
    //         }
            
    //         return false;
    //     }
        public boolean isPowerOfTwo(int n) {
            
            if(n<=0) return false;
            
            while(true){
                if(n==1 || n==2) return true;
                
                if(n%2==0){
                    n=n/2;
                }else 
                    break;
            }
            return false;
        }
        
        
        
    }