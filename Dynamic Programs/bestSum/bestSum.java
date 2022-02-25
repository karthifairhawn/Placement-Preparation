package bestSum;

import java.util.ArrayList;
import java.util.List;

public class bestSum {
    

    public static void main(String[] args) {
        int[] arr1 = {5,3,4,7};
        int[] arr2 = {2,3,5};
        int[] arr3 = {1,4,5};
        int[] arr4 = {1,2,5,25};

        System.out.println(bestSumCalc(7,arr1));
        System.out.println(bestSumCalc(8,arr2));
        System.out.println(bestSumCalc(8,arr3));
        System.out.println(bestSumCalc(100,arr4));
    }

    private static List<Integer> bestSumCalc(int targetSum, int[] arr) {
        List<Integer> shortestList = null;

        if(targetSum==0) return new ArrayList<Integer>();
        
        if(targetSum<0) return null;        

        for(int i:arr) {  

            List<Integer> temp = bestSumCalc(targetSum-i,arr);
            
            if(temp!=null) {
                temp.add(i);
                if(shortestList==null || temp.size()<shortestList.size()) {
                    shortestList = temp;
                }
            }        
        }

        return shortestList;
    }
}
