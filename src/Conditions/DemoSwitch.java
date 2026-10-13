package Conditions;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number between 1 to 5 you want to switch");
		int number = scan.nextInt();
	
		//int number=4;  we can use this one
		
		switch(number)
		{
		case 1: System.out.println("Yes its number : "+number);
						break;
						
		case 2: System.out.println("Yes its number : "+number);	
						break;
						
		case 3: System.out.println("Yes its number : "+number);
						break;
						
		case 4: System.out.println("Yes its number : "+number);
						break;
						
		case 5: System.out.println("Yes its number : "+number);
						break;
						
		default : System.out.println("Invalid number");
		}
		
		
		
	}
}
