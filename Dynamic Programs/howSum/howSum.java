package howSum;

import java.util.ArrayList;
import java.util.List;

public class howSum{
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
        
        for(int i:arr){
            List<Integer> result = howSumCalc(targetSum-i,arr);
            if(result!=null){
                result.add(i);
                return result;
            }
        }

        return null;
    }
}