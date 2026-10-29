package roughbook;

public class CountSumOfDigitsInNumber {

	
	public static void main(String[] args) {
		
		int number=7824596;
		int count=0;
		int fetch;
		
		
		while(number>0) {
		
		   fetch=number%10;
		   count=count+fetch;
		   
		   number=number/10;
		}
		
		System.out.println("Sum of digits : "+count);
	}
	
}
