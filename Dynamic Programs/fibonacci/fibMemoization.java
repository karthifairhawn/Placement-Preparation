

import java.util.Hashtable;

public class fibMemoization{
    static Hashtable<Long, Long> ht = new Hashtable<Long, Long>();
    public static void main(String[] args){

        System.out.println(findFib(10l));
        System.out.println(findFib(20l));
        System.out.println(findFib(30l));
        System.out.println(findFib(40l));
        System.out.println(findFib(50l));   // Takes a lot time 

    }

    public static long findFib(Long n){
        if(n<=2) return 1;
        if(ht.containsKey(n)) return ht.get(n);
        long value = findFib(n-1) + findFib(n-2);
        ht.put(n,value);
        return value;
    }
}