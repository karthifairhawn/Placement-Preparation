// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

// Return any array that satisfies this condition

// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

// Input: nums = [0]
// Output: [0]


class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]%2==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;
    }
}