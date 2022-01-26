class String_A_To_B{
    public static void main(String[] args) {
        String A = "EACBD";
        String B = "EABCD";

        int occurence[] = new int[256];

        if(A.length()!=B.length()){
            System.out.println("Not Possible!");
            return;
        }

        for(int i=0;i<A.length();i++){            
            occurence[A.charAt(i)]++;
            occurence[B.charAt(i)]--;
        }

        int a_end = A.length()-1;
        int b_end = B.length()-1;

        int operations = 0;
        while(a_end>=0){
            if(A.charAt(a_end)!=B.charAt(b_end)){
                operations++;
            }else{
                b_end--;
            }
            a_end--;
        }
        System.out.println("Minimum operations :"+operations);
   }
}