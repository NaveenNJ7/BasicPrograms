package LogicalPractice;

public class ReverseNumber {

	// Using / and %
	
	public static void main(String[] args) {
		
		int num=145328;
		
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			
			num=num/10;
		}
		
		System.out.println(rev);
		
		int num1=54679;
		StringBuffer s=new StringBuffer(String.valueOf(num1));
		StringBuffer reverse=s.reverse();
		System.out.println(reverse);
		
		
		int num2=4321;
		StringBuilder b=new StringBuilder();
		b.append(num2);
		StringBuilder rvrs= b.reverse();
		System.out.println(rvrs);
	}
	
	
	
}
