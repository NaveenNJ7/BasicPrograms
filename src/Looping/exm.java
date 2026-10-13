package Looping;

public class exm {
	
	public static void main(String[] array)
	{
		/*for(int x=1; x<=3; x++)
		{
			for(int y=1; y<=1; y++)
			{
				
				for(int z=1; z<=3; z++)
				{
					System.out.print("* ");
				}
				
				System.out.println("\n * * ");
			}
			System.out.println("  *");
		        System.out.println("---------");
		}
		
		int a=2;
		do
		{
			System.out.println(a);
			a+=2;
		}
		while(a<=10); */
		
		int m=1;
		System.out.println("odd numbers using while loop and if condition");
		while(m<=10)
		{
			
			if(m%2!=0)
			{
				System.out.print(m+" ");
			}
			m++;
		}
	}

}
