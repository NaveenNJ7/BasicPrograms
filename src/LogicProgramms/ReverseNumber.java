package LogicProgramms;
import java.lang.StringBuffer;
public class ReverseNumber {

	public static void main(String[] args) {
		
		int number=3456;
		int rev=0;
		
		while(number!=0) {
			
			rev=rev*10+number%10;  // gets the last digit
			number=number/10;    // eliminates last digit
		}
		
		System.out.println(rev); //6543
		
		
		int num=1234;
		StringBuffer s=new StringBuffer(String.valueOf(num));
		StringBuffer reverse= s.reverse();
		System.out.println(reverse); //4321
		
		int i=1357;
		StringBuffer s1=new StringBuffer();
		s1.append(i);
		StringBuffer sb= s1.reverse();
		System.out.println(sb);
		
		
		//created empty object and append, it also work same as StringBuffer, 
		//we can also create empty Object for StringBuffer and append
		int n=5678;
		StringBuilder b=new StringBuilder();
		b.append(n);
		StringBuilder revrs= b.reverse();
		System.out.println(revrs); //8765
		
		
		
		
		
		
		
	}
	
	
}
