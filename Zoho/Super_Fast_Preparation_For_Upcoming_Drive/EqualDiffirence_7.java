public class EqualDiffirence_7 {
    public static void main(String[] args) {
        String x = "abcdefgh"; // adxz

        int left=1;
        int right = x.length()-2;

        while(left <= right) {
            int leftDiff = x.charAt(left)-x.charAt(left-1);
            int rightDiff = x.charAt(right)-x.charAt(right+1);
            System.out.println(leftDiff + " " + rightDiff);
            if(Math.abs(leftDiff) != Math.abs(rightDiff)){
                System.out.println("Failed");
                System.exit(0);
            }
            left++;
            right--;
        }
        System.out.println("Success");
    }
}
