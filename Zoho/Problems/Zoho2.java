import java.util.Scanner;
public class Zoho2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char s[] = sc.nextLine().toCharArray();
		
		int times = 0;
		int i=0;

		while(i<s.length){
			if(times==0 && s[i]>='a' && s[i]<='z'){
				String value="";
				while(i<s.length && (s[i]>='a' && s[i]<='z')){
					value+=s[i];
					i++;
				}	
				System.out.print(value);
			}
			if(i==s.length)break;
			if(s[i]>='0' && s[i]<='9'){
				times=(times*10)+(s[i]-'0');
			}else{
				String value="",addon="";
				int times2=0;
				i++;
				while(s[i]!=']'){
					if(s[i]>='0' && s[i]<='9'){
						
						addon="";
						times2=0;
						String newVal = "";
						while(s[i]!='['){
							times2=(times2*10)+(s[i]-'0');
							i++;
						}
						i++;
						while(s[i]!=']'){
							//System.out.print("inf");
							newVal+=s[i];		
							i++;
						}
						addon = "";
						for(int jk=0;jk<times2;jk++){
							addon+=newVal;
						}
					}
					if(s[i]!=']') value+=s[i];
					i++;
				}
				for(int jk=0;jk<times;jk++){
					System.out.print(value);
					if(addon!="") System.out.print(addon);
				}
				times=0;
			}
			i++;
		}
		
	}
}