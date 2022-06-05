import java.util.*;
public class Bit{


public static void main(String[] args){
Scanner obj=new Scanner(System.in);

int t;
t=obj.nextInt();
int x=0;
obj.nextLine();
for(int i=0;i<t;i++){
	
	String a;
	a=obj.nextLine();
	
	char ch[]=a.toCharArray();
	
	for(int j=0;j<ch.length-1;j++){
		if(ch[j]=='+' && ch[j+1]=='+'){
			x=x+1;
			}
			else{
				if(ch[j]=='-' && ch[j+1]=='-'){
					x=x-1;
					}
				}
		
		}
	
	}
	System.out.println(" "+x);


}

}
