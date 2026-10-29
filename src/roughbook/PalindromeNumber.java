package roughbook;

public class PalindromeNumber {

	
	public static void main(String[] args) {
		
		int num=421124;
		int originalNum=num;
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			
			num=num/10;
		}
		
		System.out.println(rev);
		
		if(originalNum==rev) {
		System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is NOT palindrome");
		}
	}
}
