package LogicProgramms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		/*
		 prime number should be greater than 1 
		 which is divisible by 1 and itself
		 so it will have only 2 factors
		 
		 Prime = greater than 1 + exactly 2 factors
		 */
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		
		if(number>1) {
			
	//number should divisible by 1 so starts with 1 and till its own number thats y, <=number
			for(int i=1; i<=number; i++) {
				
				if(number%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(number+" Prime number");
			}
			else {
				System.out.println(number+" Not Prime number");
			}
				
		}
		else
		{
			System.out.println(number+"Not prime number");
		}
		
	}
}
