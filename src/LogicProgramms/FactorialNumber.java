package LogicProgramms;

public class FactorialNumber {

	/*
	 Factorial is a function, that means multiplying positive number by all positive
	 integers below it.
	 ex -> 5!=1*2*3*4*5 = 120 ascending order
	 	   5*4*3*2*1
	 	   
	 usually factorial stores large number so store it in long	   
	 */
	public static void main(String[] args) {
		
		int number=5;
		int factorial=1;
		//ascending 
		for(int i=1; i<=number; i++) {
			
			factorial=factorial*i;
		}
		System.out.println(factorial);
		
		int num=10;
		long fact=1;
	//	usually factorial stores large number so store it in long
		//descending
		for(int i=num; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
