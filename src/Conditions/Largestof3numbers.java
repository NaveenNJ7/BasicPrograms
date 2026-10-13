package Conditions;

public class Largestof3numbers {
	
	public static void main(String[] args)
	{
		int a=10, b=16, c=20;
		
		if(a>b && a>c)
		{
			System.out.println("a :"+a+" is greater than b :"+b+" and c :"+c);
			
		}
		
		else if(b>a && b>c)
		{
			System.out.println("b :"+b+" is greater than a :"+a+" and c :"+c);
		}
		else
		{
			System.out.println("c :"+c+" is greater than a :"+a+" and b :"+b);
		}
		
		
	}
}

	


