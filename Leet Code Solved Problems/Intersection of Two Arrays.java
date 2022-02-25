// public class temp {
//     public static void main(String[] args){

//         int age=10;

//         if(age>18){
//             System.out.println("You can vote");
//         }else{
//             System.out.println("You cannot vote");
//         }


//     }
// }
// 349. Intersection of Two Arrays

// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      int arr[]=new int[1001];
      List<Integer> res=new ArrayList<Integer>();
      int m=0;
      for(int i:nums1)
          arr[i]=1;
      for(int i:nums2)
      {
          if(arr[i]==1)
          {
              res.add(i);
              arr[i]=0;
              m++;
          }
      }
      int result[]=new int[m];
      int j=0;
      for(int i:res)
      {
          result[j]=i;
          j+=1;
      }
      return result;
        }
    }