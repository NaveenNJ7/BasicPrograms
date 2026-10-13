package Operators;

public class optexm {
	
	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;
		a+=15; // a = a+15
		System.out.println(a);
		System.out.println(b*=5);
		
		System.out.println(a/2); // 10
		System.out.println(a%2); // 0
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println("---------");
		System.out.println(b>=a);
		System.out.println(a==b); // false
		System.out.println(a!=b);//true
		System.out.println("---------");
		System.out.println(a>b && a<b);// false
		System.out.println(a>b || a<b);// true
		System.out.println("--------");
		System.out.println(!true);// false
		System.out.println(!false);// true
		
		
		int x,y;
		    x=10;
		    y=x++; // y=10, x=11
		    
	     System.out.println(x+" and "+y);
	     
	     int m,n;
	     m = 20;
	     n = ++m; // m=21, n=21
	     System.out.println(m+" and "+n);
	     
	     int result = x>y?x:y;
	     System.out.println("max of "+x+" and "+y+" is "+result);
	}

}
