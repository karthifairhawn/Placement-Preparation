// 15. 3Sum

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]


// Input: nums = [0]
// Output: []


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>  res = new ArrayList();
        int n=nums.length;
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int left=i+1;
                int right=n-1;

                while(left<right){
                    if(nums[i]+nums[left]+nums[right]==0){
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(nums[i]+nums[left]+nums[right]>0){
                        right--;
                    }else{
                        left++;
                    }
                }


            }  
        }
        return res;
    }
}
