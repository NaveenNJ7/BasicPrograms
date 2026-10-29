package roughbook;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int n=653214;
		
		while(n!=0) {
			
			int r=n%10;
			
			System.out.print(r);
			
			n=n/10;
		}
	
		System.out.println();
		
		//--------------------------------------------
		
		int num=702564;
		int rev=0;
		
		System.out.println("Before reverse : "+num);
		
		while(num!=0) {
			
			rev=rev*10+num%10;
			
			num=num/10;
		}
		
		System.out.println("After reverse : "+rev);
		
		
		//--------------------------------------------
		
		//using StringBuffer and String builder
		
		int a=95317025;
		
		System.out.println("Before reverse : "+a);
		
		StringBuffer s=new StringBuffer(String.valueOf(a));
		StringBuffer reverse=s.reverse();
		
		System.out.println("After reverse : "+reverse);
		
		
		//just simply for practice converting string to int
		String s1="12564";
		int i=Integer.parseInt(s1);
		
		System.out.println("Before reverse : "+i);
		
		StringBuilder b=new StringBuilder();
		b.append(i);
		b.reverse();
		System.out.println("After reverse : "+b);
		
	}
}
