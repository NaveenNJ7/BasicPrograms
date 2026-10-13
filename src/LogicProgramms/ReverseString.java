package LogicProgramms;

public class ReverseString {

	
	public static void main(String[] args) {
		
		//using concatenation 
		String s="Master";
		
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		System.out.println("------------");
		
		//using toCharArry()
		
		String t="Superb";
		String n="";
		char[] c=t.toCharArray();
		
		for(int i=t.length()-1; i>=0; i--) {
			
			n=n+c[i];
			// both are correct, we can write either n=n+c[i] or c[i]
			System.out.print(c[i]);
		}
		System.out.println("");
		System.out.println(n);
		
		System.out.println("-------------");
		
		StringBuffer b=new StringBuffer("Good");
		System.out.println(b.reverse());
		
	}
	
}
