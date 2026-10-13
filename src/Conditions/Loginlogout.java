package Conditions;

public class Loginlogout {
	
	public static void main(String[] args)
	{
		String id = "Naveen";
		int password = 849;
		
		if(id=="Naveen")
		{
			System.out.println("Valid user id");
			if(password==849)
			{
				System.out.println("Login successful");
			}
			else
			{
				System.out.println("incorrect password");
			}
		}
		
		else
		{
			System.out.println("Invalid user id");
		}
	}

}
