package canSum;

public class canSum {
    public static void main(String[] args){
        int arr1[] = {1,2,5};
        int arr2[] = {3,5};
        int arr3[] = {7,14};
        System.out.println(canSumTarget(7,arr1));
        System.out.println(canSumTarget(7,arr2));
        System.out.println(canSumTarget(300,arr3));
    }

    public static boolean canSumTarget(int target, int[] arr){
        if(target==0) return true;
        if(target<0) return false;


        for(int i:arr){
            if(canSumTarget(target-i,arr)) return true;
        }

        return false;
    }
}
