package LogicProgramms;

public class CountEvenOddInNumber {

	public static void main(String[] args) {
		
		int number=487965621;
		int odd=0;
		int even=0;
		int num;
		
		while(number>0) {
			
			num=number%10;
			
			if(num%2==0) {
				even++;
				System.out.println(num+" is even ");
			}
			else {
				odd++;
				System.out.println(num+" is odd ");
			}
			number=number/10;
		}
		
		System.out.println("Number of digits even : "+even);
		System.out.println("Number of digits odd : "+odd);
		
	}
}
