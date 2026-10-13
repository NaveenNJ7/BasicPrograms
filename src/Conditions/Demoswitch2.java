package Conditions;

import java.util.Scanner;

public class Demoswitch2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select name\nNikhil\nLaxmikant\nDarshan\nDarshan\nRakesh\nDeepak\nExit");
		
		while(true)
		{
			String name= scan.next();
			
			if(name.equals("Exit"))
			{
				break;
			}
			switch(name)
			{
			case "Nikhil" : System.out.println("Name is : "+name);
							break;
							
			case "Laxmikant" : System.out.println("Name is : "+name);
							break;
							
			case "Darshan" : System.out.println("Name is : "+name);
							break;
							
			case "Bharat" : System.out.println("Name is : "+name);
							break;
							
			case "Rakesh" : System.out.println("Name is : "+name);
							break;
							
			case "Deepak" : System.out.println("Name is : "+name);
							break;
							
			default : System.out.println("Entered name is not present in list");
			}
		}
		
		System.out.println("Program Completed");
		
	}
	
	/*
	 if break inside switch executed than it will come out of the switch block
	 if break inside while loop (if condition) executed then it will come out of while loop
	 */
}
