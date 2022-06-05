import java.util.*;
public class Borze{


public static void main(String[] args){

Scanner obj=new Scanner(System.in);
String a;
a=obj.nextLine();
char ch[]=a.toCharArray();

String result="";
for(int i=0;i<=ch.length-1;i++){
	
	if(ch[i]=='.'){
		
		result="0";
		System.out.print(""+result);
		}
		else{
			if(ch[i]=='-' && ch[i+1]=='.'){
				result="1";
				i=i+1;
				System.out.print(""+result);
				}
				else{
					if(ch[i]=='-' && ch[i+1]=='-'){
						result="2";
						i=i+1;
						System.out.print(""+result);
						}
					}
			}
	
	}
	

}

}
