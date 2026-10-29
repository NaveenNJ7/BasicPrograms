package LogicalPractice;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		
		int[] a= {14,58,32,7,45,72,87,107};
		
		int max=a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max+" is Maximum number");
		
		
		int min=a[0];
		
		for(int x=1; x<a.length; x++) {
			
			if(a[x]<min) {
				
				min=a[x];
			}
		}
		System.out.println(min+" is Minimum number");
	}
}
