package roughbook;

public class ReverseAString {

	public static void main(String[] args) {
		
		// using char
		
		String a="Postman";
		
		for(int i=a.length()-1; i>=0;i--) {
			
			System.out.print(a.charAt(i));
		}
		
		System.out.println();
		
		//using char with variable
		String rev="";
		
		for(int i=a.length()-1; i>=0; i--) {
			rev=rev+a.charAt(i);
		}
		
		System.out.println(rev);
		
		
		// String to char array
		char[] c=a.toCharArray();
		String rvs="";
		for(int i=c.length-1; i>=0; i--) {
			
			rvs=rvs+c[i];
		}
		System.out.println(rvs);
	
		
		//using String Builder and StringBuffer
		StringBuffer s=new StringBuffer("RestAssured");
		s.reverse();
		
		System.out.println(s);
	
	}
}
