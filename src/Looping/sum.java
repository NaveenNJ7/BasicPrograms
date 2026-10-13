package Looping;

public class sum {

	
	public static void main(String[] array)
	{
	/*	int a;
		int sum = 0;
		
		for(a=1; a<=10; a++)
		{
			sum=sum+a;
		}
		
		System.out.println("Total sum of 1 to 10 is "+sum); */
		
		int b;
		System.out.print("Even numbers between 1 to 10\n");
		for(b=1; b<=10; b++)
		{
			if(b%2==0)
			{
				System.out.print(b+" ");
			}	
		}
		
		int c;
		System.out.println("\nOdd numbers between 1 to 10"); // backward slash n, controller will jump into next line
		for(c=1; c<=10; c++)
		{
			if(c%2!=0)
			{
				System.out.print(c+" ");
			}
		}
		
	}
}
