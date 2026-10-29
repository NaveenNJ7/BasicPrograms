package roughbook;

public class FindingMissingNumberInArray {

	/*
	 Array should have elements in specific range
	 Should not have duplicates
	 Elements No need to be in Order wise
	 */
	
	public static void main(String[] args) {
		
		int a[]= {2,6,3,4,1};    // 5 i missing
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			
			sum=sum+a[i];
		}
		System.out.println("Sum of elements in Array : "+sum);
		
		//here max number is 6 and minimum is 1
		int sum1=0;
		for(int i=1; i<=6; i++) {
			
			sum1=sum1+i;
		}
		System.out.println("Sum of elements of specific range : "+sum1);
		System.out.println("Missing number is : "+(sum1-sum));
	}
}
