package canConstruct;

public class canConstruct{
    public static void main(String[] args){
        String[] words1 = new String[]{"ab","abc","cd","def","abcd"};
        String[] words2 = new String[]{"bo","rd","ate","t","ska","sk","boar"};
        String[] words3 = new String[]{"a","p","ent","enter","ot","o","t"};
        String[] words4 = new String[]{"e","ee","eee","eeee","eeeee","eeeeee"};
        
        System.out.println(canConstructString("abcdef",words1));
        System.out.println(canConstructString("skateboard",words2));
        System.out.println(canConstructString("enterapotentpot",words3));
        System.out.println(canConstructString("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",words4));
    }
    public static boolean canConstructString(String target, String[] words){
        if(target.equals("")) return true;

        for(String i:words){
            if(target.indexOf(i)==0){
                if(canConstructString(target.substring(i.length()),words)){
                    return true;
                }
            }
        }
        return false;
    }
} 