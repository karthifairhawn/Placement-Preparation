package allConstruct;

import java.util.ArrayList;
import java.util.List;

public class allConstruct {
    public static void main(String[] args) {
        System.out.println(countConstructSolve("purple",new String[]{"purp","p","ur","le","purpl"}));
        

        System.out.println(countConstructSolve("abcdef",new String[]{"ab","abc","cd","def","abcd"}));

        System.out.println(countConstructSolve("purple",new String[]{"bo","rd","ate","t","ska","sk","boar"}));

        System.out.println(countConstructSolve("enterapotentpot",
                new String[]{"a","p","ent","enter","ot","ot","t"}));

        System.out.println(countConstructSolve("eeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                new String[]{"e","ee","eee","eeee","eeeeee"}));
    }
    
    public static List<List<String>> countConstructSolve(String target,String[] words){
        
        List<List<String>> comb = new ArrayList<List<String>>();
        if(target.equals("")) {
            comb.add(new ArrayList<String>());
            return comb;
        }

        for(String i: words){
            if(target.indexOf(i)==0){
                List<List<String>> s = countConstructSolve(target.substring(i.length()),words);                                                             
                for(int ptr =0;ptr < s.size();ptr++){  s.get(ptr).add(0, i); }
                comb.addAll(s);
            }
        }    

        return comb;
    };

}
