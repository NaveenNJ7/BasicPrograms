package roughbook;

public class SwappingNumbers {

	
	public static void main(String[] args) {
		
		// using temporary variable
		
		int a=10;
		
		int b=20;
		
		System.out.println("Before swapping numbers a : "+a+" and b : "+b);
		
		int temp;
		
		temp=a;
		
		a=b;
		
		b=temp;
		
		System.out.println("After swapping numbers a : "+a+" and b : "+b);
		
		
		int c=10;
		int d=20;
		
		System.out.println("Before swapping numbers c : "+c+" and d : "+d);
		
		c=c+d;  //10+20=30
		d=c-d;  //30-20=10
		c=c-d;  //30-10=20
		
		System.out.println("After swapping numbers c : "+c+" and d : "+d);
		
		
		int e=10;
		int f=20;
		
		System.out.println("Before swapping numbers e : "+e+" and f : "+f);
		
		e=e*f; //10*20=200
		f=e/f;  //200/20=10
		e=e/f;  //200/10=20
		
		System.out.println("After swapping numbers e : "+e+" and f : "+f);
	}
}
