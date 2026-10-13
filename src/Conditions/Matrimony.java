package Conditions;

public class Matrimony {
	
	public static void main(String[] args)
	{
		String gender = "female";
		int age = 17;
		
		if(gender=="male")
		{
			System.out.println("Gender is "+gender);
			if(age>=21)
			{
				System.out.println("Age is more than 21");
				System.out.println("Eligible for marriage");
			}
			else
			{
				System.out.println("Age is not more than 21");
				System.out.println("Not eligible for marriage");
			}
		}
		else if(gender=="female")
		{
			System.out.println("Gender is "+gender);
			if(age>=18)
			{
				System.out.println("Age is more than 18");
				System.out.println("Eligible for marriage");
			}
			else
			{
				System.out.println("Age is not more than 18");
				System.out.println("Not eligible for marriage");
			}
		}
	}

}
