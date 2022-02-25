package howSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class howSumMemoized{

    static HashMap<Integer,List<Integer>> ht= new HashMap<>();
    public static void main(String[] args){
        int[] arr1 = {5,3,4,7};
        int[] arr2 = {5,4,7};
        int[] arr3 = {7,14};
        System.out.println(howSumCalc(7,arr1));
        System.out.println(howSumCalc(7,arr2));
        System.out.println(howSumCalc(300,arr3));

    }

    private static List<Integer> howSumCalc(int targetSum, int[] arr){
        
        if(targetSum == 0)  return new ArrayList<Integer>();
        
        if(targetSum < 0)   return null;

        if(ht.containsKey(targetSum)) return ht.get(targetSum);
        
        for(int i:arr){
            int remainder = targetSum - i;
            List<Integer> result = howSumCalc(remainder,arr);                        
            if(result!=null){                
                result.add(i);                                
                return result;
            }
        }

        ht.put(targetSum,null);
        return null;
    }
}