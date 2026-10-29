package LogicalPractice;

import java.util.Arrays;
import java.util.Collections;

public class BuiltInSorting {

	public static void main(String[] args) {
		
		int a[]= {15,10,5,20,4};
		
		System.out.println("Before sorting : "+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("After sorting : "+Arrays.toString(a));
		
		
		int b[]= {4,2,5,1,3};
		
		System.out.println("Before sorting : "+Arrays.toString(b));
		
		Arrays.sort(b);
		
		System.out.println("After sorting : "+Arrays.toString(b));
		
		
		// descending order
	//	int c[]= {70,60,80,50,90};
		
		Integer c[]= {70,60,80,50,90};
		
		System.out.println("Before sorting : "+Arrays.toString(c));
		
		/* for descending we use reverseOrder() which is present in Collections, but collections 
		   does not support primitive type int c[], so we should use Integer c[] */
		
		Arrays.sort(c, Collections.reverseOrder());
		
		System.out.println("After sorting : "+Arrays.toString(c));
	}
}
