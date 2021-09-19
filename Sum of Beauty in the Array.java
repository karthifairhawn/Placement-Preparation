// 2012. Sum of Beauty in the Array

// You are given a 0-indexed integer array nums. For each index i (1 <= i <= nums.length - 2) the beauty of nums[i] equals:

// 2, if nums[j] < nums[i] < nums[k], for all 0 <= j < i and for all i < k <= nums.length - 1.
// 1, if nums[i - 1] < nums[i] < nums[i + 1], and the previous condition is not satisfied.
// 0, if none of the previous conditions holds.
// Return the sum of beauty of all nums[i] where 1 <= i <= nums.length - 2.

// Input: nums = [1,2,3]
// Output: 2
// Explanation: For each index i in the range 1 <= i <= 1:
// - The beauty of nums[1] equals 2.

class Solution {
        
    
    public int sumOfBeauties(int[] nums) {
        int res=0;
        
        boolean[] left = isLeftOrder(nums);
        boolean[] right = isRightOrder(nums);
        
        for(int i=1;i<nums.length-1;i++){
            if(left[i] && right[i]){
                res+=2;
            }else if(nums[i]>nums[i-1] && nums[i]<nums[i+1]){
                res+=1;
            }
        }
        return res;
    }
    public boolean[] isLeftOrder(int[] nums){
        boolean left[] = new boolean[nums.length];
        int greater=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>greater){
                left[i]=true;
                greater = nums[i];
            }
        }
        return left;
    }
    
    public boolean[] isRightOrder(int[] nums){
        boolean right[] = new boolean[nums.length];
        int minimum=nums[nums.length-1];        
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<minimum){
                right[i]=true;
                minimum = nums[i];
            }
        }
        return right;
    }
    
}