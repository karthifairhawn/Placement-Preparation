package countConstruct;


public class countConstruct {

    public static void main(String[] args) {
        System.out.println(canConstructSolve("purple",new String[]{"purp","p","ur","le","purpl"}));

        System.out.println(canConstructSolve("abcdef",new String[]{"ab","abc","cd","def","abcd"}));

        System.out.println(canConstructSolve("purple",new String[]{"bo","rd","ate","t","ska","sk","boar"}));

        System.out.println(canConstructSolve("enterapotentpot",
                new String[]{"a","p","ent","enter","ot","ot","t"}));

        System.out.println(canConstructSolve("eeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                new String[]{"e","ee","eee","eeee","eeeeee"}));
    }

    public static int canConstructSolve(String target,String words[]){
        
        if(target=="") return 1;
        int ways = 0;
        for(String i :words) {
            if(target.indexOf(i)==0){
                int value = canConstructSolve(target.substring(i.length()),words);                
                ways+=value;
            }
        }
        return ways;
    }
}
