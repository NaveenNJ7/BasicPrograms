package LogicalPractice;

public class OddEvenInNumber {

	public static void main(String[] args) {
		
		int number=56741235;
		int Evencount=0;
		int Oddcount=0;
		
		while(number>0) {
			
			int num=number%10;
			
			if(num%2==0) {
				 Evencount++;
			}
			else {
				Oddcount++;
			}
			
			number=number/10;
		}
		System.out.println(Evencount+" Even count");
		System.out.println(Oddcount+" Odd count");
	}
}
