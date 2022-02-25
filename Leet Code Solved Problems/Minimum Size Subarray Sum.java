// 209. Minimum Size Subarray Sum

// Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.

// Input: target = 4, nums = [1,4,4]
// Output: 1   

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0

// 1 <= target <= 109
// 1 <= nums.length <= 105
// 1 <= nums[i] <= 105

// Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).



class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int WindowStart = 0;
        int WindowEnd = 0;
        int MinLen = Integer.MAX_VALUE;
        int Sum =0;
        
        for(WindowEnd = 0;WindowEnd<nums.length;WindowEnd++){
            
            Sum+=nums[WindowEnd];
            
            while(Sum>=target){
                MinLen = Math.min(MinLen , WindowEnd - WindowStart +1);
                Sum-=nums[WindowStart];
                WindowStart++;
            }
            
        }
        if(MinLen ==Integer.MAX_VALUE ) return 0;
        return MinLen;
        
        
    }
}