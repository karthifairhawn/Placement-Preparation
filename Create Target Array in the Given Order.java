1389. Create Target Array in the Given Order

Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.


Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]

// Brute Force

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int res[] = new int[nums.length];        
        Arrays.fill(res,-1);
        
        
        
        for(int i=0;i<nums.length;i++){
            if(res[index[i]]==-1) res[index[i]] = nums[i];
            else{
                res = move(res,index[i]);
                res[index[i]] = nums[i];                
            }
            System.out.println(Arrays.toString(res));
        }
        
        
        
        
        return res;

    }
    static int[] move(int[] res,int k){
        for(int i=res.length-1;i>k;i--){
            res[i]=res[i-1];
        }        
        return res;
    }
}

//Inbuild List

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {        
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int target[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            target[i] = a.get(i);
        }
        return target;
    }
}

