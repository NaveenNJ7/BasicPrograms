package LogicProgramms;

public class NumberIsPalindrome {

	public static void main(String[] args) {
		
		int num=16461;
		int org_num=num;
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println(org_num);
		
		if(org_num==rev) {
			System.out.println("Number is palindrome : "+rev);
		}
		else {
			System.out.println("Number is not palindrome : "+rev);
		}
		
		
	}
}
