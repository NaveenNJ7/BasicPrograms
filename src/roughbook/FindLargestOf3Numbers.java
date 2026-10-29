package roughbook;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=100;
		int b=55;
		int c=75;
		
		int largest=a>b?a:b;
		System.out.println("Largest number between a : "+a+" and b : "+b+" is : "+largest);
		
		largest=largest>c?largest:c;
		System.out.println("Largest number between a : "+a+" b : "+b+" and c : "+c+" is : "+largest);
		
		
		
	}
	
}
