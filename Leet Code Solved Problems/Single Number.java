// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Input: nums = [2,2,1]
// Output: 1

// Input: nums = [4,1,2,1,2]
// Output: 4

class Solution {
    public int singleNumber(int[] nums) {
     int ans =0;
     
     int len = nums.length;
     for(int i=0;i<len;i++){
         ans = ans^nums[i];
        System.out.println(ans);
     }
     
     return ans;
     
 }
 }