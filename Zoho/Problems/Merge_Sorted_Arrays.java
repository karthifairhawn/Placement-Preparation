import java.util.Arrays;

public class Merge_Sorted_Arrays {
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {-10,-6,-1,0,3,5,8,10};

        int res[]= new int[arr1.length+arr2.length];
        int i=0,j=0;
        int ins = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                res[ins] = arr1[i];
                i++;ins++;
            }else{
                res[ins] = arr2[j];
                j++;ins++;
            }
        }
        while(i<arr1.length){
            res[ins] = arr1[i];
            ins++;
            i++;
        }
        while(j<arr2.length){
            res[ins] = arr2[j];
            j++;
            ins++;
        }
        System.err.println(Arrays.toString(res));


    }
}
