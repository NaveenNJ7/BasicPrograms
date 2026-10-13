package LogicProgramms;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=20,b=13,c=17;
		
		if(a>b && a>c) {
			System.out.println(a+" is largest number");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is largest number");
		}
		else if(c>a && c>b){
			System.out.println(c+" is largest number");
		}
		
		int largest=a>b?a:b;
		largest=c>largest?c:largest;
		
		System.out.println("Largest number is : "+largest);
		
		int x=105, y=65, z=75;
		int highest=z>(x>y?x:y)?z:(x>y?x:y);
		System.out.println("Bigger number : "+highest);
		
	}
}
