import java.util.Arrays;

public class Even_Odd_Alternate {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};

        int even_pos[] = new int[10];
        int odd_pos[] = new int[10];
        int e=0,o=0;

    

        for(int i=0; i<arr.length;i++){
            if(i%2==0){
                even_pos[e++] =arr[i];
            }else{
                odd_pos[o++] =arr[i];
            }
        }
        


        for(int i=0;i<e;i++){
            for(int j=0;j<e-1-i;j++){
                if(even_pos[j]>even_pos[j+1]){
                    int temp=even_pos[j];
                    even_pos[j] =even_pos[j+1];
                    even_pos[j+1]= temp;
                }
            }
        }
        for(int i=0;i<o;i++){
            for(int j=0;j<o-1-i;j++){
                if(odd_pos[j]<odd_pos[j+1]){
                    int temp=odd_pos[j];
                    odd_pos[j] =odd_pos[j+1];
                    odd_pos[j+1]= temp;
                }
            }
        }
        
        int ev_i=0;
        int odd_i=0;

        while(ev_i<e && odd_i<o){
            System.out.print(even_pos[ev_i++]+" ");
            System.out.print(odd_pos[odd_i++]+" ");
        }
        while(ev_i<e){
            System.out.print(even_pos[ev_i++]+" ");
        }
        while(odd_i<o){
            System.out.print(odd_pos[odd_i++]+" ");
        }
    }
    
}
