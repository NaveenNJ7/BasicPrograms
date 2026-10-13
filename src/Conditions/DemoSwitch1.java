package Conditions;

import java.util.Scanner;

public class DemoSwitch1 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select name\nNikhil\nLaxmikant\nDarshan\nDarshan\nRakesh\nDeepak");
		
		String name= scan.next();
		
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
}
