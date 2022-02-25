package canSum;

import java.util.Hashtable;

public class canSumMemozation {

    static Hashtable<Integer, Boolean> ht = new Hashtable<Integer, Boolean>();
    
    public static void main(String[] args){
        int arr1[] = {1,2,5};
        int arr2[] = {3,5};
        int arr3[] = {7,14};
        System.out.println(canSum(7,arr1));
        System.out.println(canSum(7,arr2));
        System.out.println(canSum(300,arr3));
    }

    public static boolean canSum(int target, int[] arr){
        if(target==0) return true;
        if(target<0) return false;
        if(ht.containsKey(target))  return false;


        for(int i:arr){
            if(canSum(target-i,arr)){                
                return true;
            }
        }
        ht.put(target,false);
        return false;
    }
}
