package LogicProgramms;

public class StringIsPalindrome {

	public static void main(String[] args) {
		
	String s="PAVAP";
	String org_s=s;
	String rev="";
	
	for(int i=s.length()-1; i>=0; i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(org_s);
	
		if(org_s.equals(rev)) {
			System.out.println("String is palindrome : "+org_s);
		}
		else {
			System.out.println("String is not palindrome : "+org_s);
		}
	}
}
