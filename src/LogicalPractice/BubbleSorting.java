package LogicalPractice;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int a[] = {4,2,5,1,3};
		
		System.out.println("Beofre sorting : "+Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++) {  //i=0,1,2,3<4
			
			for(int j=0; j<a.length-1; j++) {  
								  //j=0, 1, 2 ,3  <4	
				if(a[j]>a[j+1]) { // 01,12,23,34
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("After sorting : "+Arrays.toString(a));
	}
}
