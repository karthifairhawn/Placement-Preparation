// 2032. Two Out of Three


// Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.

// Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
// Output: [3,2]
// Explanation: The values that are present in at least two arrays are:
// - 3, in all three arrays.
// - 2, in nums1 and nums2.

// Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
// Output: [2,3,1]
// Explanation: The values that are present in at least two arrays are:
// - 2, in nums2 and nums3.
// - 3, in nums1 and nums2.
// - 1, in nums1 and nums3.

import java.util.*;
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Hashtable<Integer,Integer> hash_1 = new Hashtable<>();
        Hashtable<Integer,Integer> hash_2 = new Hashtable<>();
        Hashtable<Integer,Integer> hash_3 = new Hashtable<>();
        
        List<Integer> li = new LinkedList<>();
        
        for(int i:nums1){
            hash_1.put(i,0);
        }
        for(int i:nums2){
            hash_2.put(i,0);
        }
        for(int i:nums3){
            hash_3.put(i,0);
        }
        
        for(int i:nums1){
            if(hash_2.containsKey(i) || hash_3.containsKey(i)){
                if(!li.contains(i)){
                    li.add(i);
                }
            }
        }
        for(int i:nums2){
            if(hash_1.containsKey(i) || hash_3.containsKey(i)){
                if(!li.contains(i)){
                    li.add(i);
                }
            }
        }
        for(int i:nums3){
            if(hash_1.containsKey(i) || hash_2.containsKey(i)){
                if(!li.contains(i)){
                    li.add(i);
                }
            }
        }
        return li;
        
    }
}