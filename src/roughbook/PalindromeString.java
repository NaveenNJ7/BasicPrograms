package roughbook;

public class PalindromeString {

	
	public static void main(String[] args) {
		
		String s="sasas";
		String originalS=s;
		
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		if(originalS.equals(rev)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is Not palindrome");
		}
	}
	
}
