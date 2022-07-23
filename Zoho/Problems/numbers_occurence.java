package Zoho.Problems;

public class numbers_occurence {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,6,5,4,3,2,5,6,1,2,4};

        int res[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element==-1){
                continue;
            }
            res[i]++;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]==element){
                    res[i]++;
                    arr[j]=-1;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=-1){
                System.out.print(arr[i]+"("+res[i]+") ");
            }
        }
    }
}
