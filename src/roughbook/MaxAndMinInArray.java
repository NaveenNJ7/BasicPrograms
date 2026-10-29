package roughbook;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		
		int n[]= {1,21,32,95,100,75,54,25};
		
		int max=0;
		int min=n[0];
		
		for(int i=0; i<n.length; i++) {
			
			if(n[i]>max) {
				max=n[i];
			}
		}
		System.out.println("Maximum number is : "+max);
		
		for(int i=1; i<n.length; i++) {
			
			if(n[i]<min) {
				min=n[i];
			}
		}
		System.out.println("Minimum number is : "+min);
	}
}
