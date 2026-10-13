package Looping;

public class Loopingstatements {
	
	/* using for to repeat the set of instructions or statements / used to perform task for specific times
	   purpose - repeating and traverse (if there is a group data fetching one by one data)
	   
	   1) for loop
	   2) while loop
	   3) do while loop
	   4) nested loop
	   
	   syntax for loop - for(initialization; condition; updation)
	                        {
	                        
	                        }
	 */
	
	public static void main(String[] args)
	{
		int i;
		for(i=1; i<=5; i++)
		{
			System.out.println("Hi");
		}
		
		System.out.println("-----------");
		
		for(i=1; i<=5; i+=1)
		{
			System.out.println("Hello");
		}
		
		System.out.println("---------");
		
		for(i=1; i<=5; i=i+1)
		{
			System.out.println("Bye");
		}
	}

}
