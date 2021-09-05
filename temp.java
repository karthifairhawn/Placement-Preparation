import java.util.*;
public class temp {
    public static void main(String[] args){
        kp soln = new kp();
        int[] ques = {1,3,-1,-3,5,3,6,7};
        int[] l = soln.maxSlidingWindow(ques,3);
        System.out.println(Arrays.toString(l));
    }
}


class kp {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int deque[] = new int[nums.length];
        
        int enq=-1,deq=0;
        

        int res[] = new int[nums.length];
        int tr = 0;
            
        for(int i=0;i<nums.length;i++){
            
            System.out.println(Arrays.toString(deque));
            
            if(enq==-1){
                deque[++enq]=nums[i];
            }else if(nums[enq]>nums[i]){
                deque[++enq]=nums[i];
            }else{
                while(deque[enq]<nums[i]){
                    enq--;
                    if(enq==-1){
                        deque[++enq]=nums[i];
                        break;
                    }
                }                
            }
            
            if(i>=k-1){
                res[tr++] = deque[deq];
                deq++;
            }                                                        
        }
        return res;
        
        
    }
}