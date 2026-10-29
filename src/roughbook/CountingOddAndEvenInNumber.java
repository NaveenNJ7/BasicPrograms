package roughbook;

public class CountingOddAndEvenInNumber {

	
	public static void main(String[] args) {
		
		int number=1567240983;
		
		int countOdd=0;
		int countEven=0;
		int fetch=0;
		
		while(number>0) {
			
			   fetch=number%10;
			
			if(fetch%2==0) {
				 
				countEven++;
				System.out.println("Number is EVEN : "+fetch);
			}
			else {
				countOdd++;
				System.out.println("Number is Odd : "+fetch);
			}
			
			number=number/10;
		}
		
		System.out.println("Number of Even numbers "+countEven);
		System.out.println("Number of Odd numbers "+countOdd);
	
		//if 0/2 and 0%2 will give 0 
		//but 2/0 and 2%0 will give Arithmetic exception
		
	}
	
}
