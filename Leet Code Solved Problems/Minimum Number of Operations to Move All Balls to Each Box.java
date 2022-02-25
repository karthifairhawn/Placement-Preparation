// You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.

// In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.

// Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.

// Each answer[i] is calculated considering the initial state of the boxes.

// Input: boxes = "110"
// Output: [1,1,3]
// Explanation: The answer for each box is as follows:
// 1) First box: you will have to move one ball from the second box to the first box in one operation.
// 2) Second box: you will have to move one ball from the first box to the second box in one operation.
// 3) Third box: you will have to move one ball from the first box to the third box in two operations, and move one ball from the second box to the third box in one operation.


// n == boxes.length
// 1 <= n <= 2000
// boxes[i] is either '0' or '1'.


class Solution {  // Brute force
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        int[] res = new int[boxes.length()];
        int i=0,sum=0;
        
        for(char c:boxes.toCharArray()){
            arr[i++]=c-'0';
            sum+=c-'0';
        }
        
        for(i=0;i<arr.length;i++){
            int j=0;
            int steps=0;
            while(j<arr.length){                              
                if(arr[j]==1)
                    steps = steps + Math.abs(i-j);
                j++;
                }
            res[i] = steps;
        }

        
        return res;
    }
}