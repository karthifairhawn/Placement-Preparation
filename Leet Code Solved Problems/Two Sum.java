// 1. Two Sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.


// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Output: Because nums[0] + nums[1] == 9, we return [0, 1].


// Input: nums = [3,2,4], target = 6
// Output: [1,2]



class Solution {
    public int[] twoSum(int[] nums, int target) {
            
        
       // Hash Map Approach

        Map<Integer,Integer> hash = new HashMap<>();        
        for(int i=0;i<nums.length;i++){            
            int comp = target-nums[i];        
            if(hash.containsKey(comp)){
                return new int[] {hash.get(comp),i};
            }
            hash.put(nums[i],i);                                    
        }
        return new int[] {0,0};
        
        
 
        // Brute Force Approach

        // int arr[] = new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // throw new IllegalArgumentException("not found");
    }
}