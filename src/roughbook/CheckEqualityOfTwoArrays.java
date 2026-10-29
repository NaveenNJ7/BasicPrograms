package roughbook;

import java.util.Arrays;

public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
		
		// while check equality of array both should have same length
		//index of each array will compare with index of corresponding array
		
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		
		boolean status=Arrays.equals(a, b);	// return boolean
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		System.out.println("-------------------------------");
		
		//approach 2
		
		boolean sts=true;
		
		int c[]= {10,20,30};
		int d[]= {10,20,30};
		
		if(c.length==d.length) {
			
			for(int i=0; i<c.length; i++) {   //we can use also i<b.length
				
				if(c[i]!=d[i]) {
					sts=false;
				}
			}
		}
		else {
			sts=false;
		}
		
		if(sts==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
	}
	
}
