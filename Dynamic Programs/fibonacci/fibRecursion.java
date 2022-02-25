
public class fibRecursion{
    public static void main(String[] args){

        System.out.println(findFib(10l));
        System.out.println(findFib(20l));
        System.out.println(findFib(30l));
        System.out.println(findFib(40l));
        System.out.println(findFib(50l));   // Takes a lot time 

    }

    public static Long findFib(Long n){
        if(n<=2) return 1l;
        return findFib(n-1) + findFib(n-2);
    }
}