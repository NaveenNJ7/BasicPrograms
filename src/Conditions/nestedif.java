package Conditions;

public class nestedif {
	
	public static void main(String[] args)
	{
		int a=15, b=15;
		
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
			if(a==b)
			{
				System.out.println(a+" is equal to "+b);
			}
			else
			{
				System.out.println(a+" is not equal to "+b);
			}
		}
		
		else if(a<b)
		{
			System.out.println(a+" is lesser than "+b);
			if(a==b)
			{
				System.out.println(a+" is equal to "+b);
			}
			else
			{
				System.out.println(a+" is not equal to "+b);
			}
		}
		
		else if(a==b)
		{
			System.out.println("a :"+a+" is equal to b :"+b);
		}
	}

}
