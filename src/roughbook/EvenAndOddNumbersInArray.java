package roughbook;

public class EvenAndOddNumbersInArray {

	public static void main(String[] args) {
		
		int n[] = {1,7,2,8,3,9,4,6,5,0};
		int countEven=0;
		int countOdd=0;
		
		for(int i=0; i<n.length; i++) {
			
			if(n[i]%2==0) {
				System.out.println(n[i]+" is Even number");
				countEven++;
			}
			else
			{
				System.out.println(n[i]+" is Odd number");
				countOdd++;
			}
		}
		
		System.out.println("Total numbers of Even : "+countEven+" and Odd numbers : "+countOdd);
	}
}
