package bestSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class bestSumMemoized {
    
    static HashMap<Integer, List<Integer>> ht = new HashMap<>();
    public static void main(String[] args) {
        int[] arr1 = {5,3,4,7};
        int[] arr2 = {2,3,5};
        int[] arr3 = {4,4};
        int[] arr4 = {1,2,5,25};

        System.out.println(bestSumCalc(7,arr1));
        ht.clear();

        System.out.println(bestSumCalc(8,arr2));
        ht.clear();

        System.out.println(bestSumCalc(8,arr3));
        ht.clear();

        System.out.println(bestSumCalc(100,arr4));
        ht.clear();

    }

    private static List<Integer> bestSumCalc(int targetSum, int[] arr) {
       List<Integer> shortestCombinations = null;

       if(targetSum==0) return new ArrayList<Integer>();            
       
       if(targetSum<0)  return null;    

       if(ht.containsKey(targetSum)) return ht.get(targetSum);

       for(int i:arr){
           int remainder = targetSum-i;
           List<Integer> temp = bestSumCalc(remainder,arr);

           if(temp!=null){

                List<Integer> tempNew = new ArrayList<Integer>();
                tempNew.addAll(temp);
                tempNew.add(i);
                
                if(shortestCombinations==null || tempNew.size()<shortestCombinations.size()){
                    shortestCombinations=tempNew;
                }
           }
       }

        ht.put(targetSum,shortestCombinations);
        return shortestCombinations;
    }
}
