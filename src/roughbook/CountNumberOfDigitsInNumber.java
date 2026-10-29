package roughbook;

public class CountNumberOfDigitsInNumber {

	
	public static void main(String[] args) {
		
		int number=102345678;
		
		int count=0;
		
		while(number>0) {
			
			int fetch=number%10;
			System.out.println(fetch);
			number=number/10;
			count++;
		}
		
		System.out.println("Number of digits : "+count);
	}
}
