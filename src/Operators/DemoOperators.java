package Operators;

public class DemoOperators {

	public static void main(String[] args) {
		
		int a;
		a=10;
		String s ="Concatenation";
		
		System.out.println("Plus with any String will be :"+s+" "+a);
		
		//assignment operators
		a+=10;  //a=a+10;
		System.out.println(a); //20
		
		a/=2; // 10 quotient will answer
		System.out.println(a);
		
		a%=2; // 10/2=0 reminder will be answer
		System.out.println(a);
		
		//relational operators or conditional
		int b=10;
		int c=20;
		int d=5;
		
		System.out.println(b==c); //false b equal to c
		System.out.println(b!=c); // true b not equal to c
		
		System.out.println("------------");
		
		//logical operators
		System.out.println(b<c && b>d); // true --> both conditions are true (and)
		
		System.out.println(b>c && b<d); // false --> one condition is false 
		
		System.out.println(b>c || b>d);  // true
		// true --> b not greater than c and b is greater than d so one condition true
		
		System.out.println("---------");
		System.out.println(!true); // false
		System.out.println(!false); // true
		
		System.out.println("------------");
		
		//unary operators
		int x=10;
		int y=x++; 
		//post increment first assign next increment
		System.out.println("x :"+x+"    y :"+y); // x=11, y=10
		
		int z=++x; // here x value is 11, above example its value increased so
		//pre increment first increment and next assign
		System.out.println("x :"+x+"    z :"+z); // z=12, x=12
		
		System.out.println("------------");
		
		// ternary operators
		
		int m=10;
		int n=20;
		int result = m>n?m:n;
		// result will be based on condition if m is larger it will be print
		// if n is larger n will print
		System.out.println(result); //n=20
		
		int result1=m<n?m:n;
		System.out.println(result1); //m=10
		
		
		
	}
}
