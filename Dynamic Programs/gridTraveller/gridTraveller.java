package gridTraveller;

public class gridTraveller {
    
    public static void main(String[] args) {
        System.out.println(findPath(3,3));
        System.out.println(findPath(6,6));
        System.out.println(findPath(8,7));
        System.out.println(findPath(18,18));
    }

    private static int findPath(int r, int c) {
        if(r==1 && c==1) return 1;
        if(r==0 || c==0) return 0;
        return findPath(r-1,c)+findPath(r,c-1);
    }
}
