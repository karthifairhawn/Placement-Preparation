package Zoho.Super_Fast_Preparation_For_Upcoming_Drive;
public class LargestPossible_3 {
    public static void main(String[] args) {
        char arr[] = "helloworld".toCharArray();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        System.out.println(arr);


    }
}
