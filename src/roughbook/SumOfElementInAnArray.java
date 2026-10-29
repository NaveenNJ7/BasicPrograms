package roughbook;

import java.util.Arrays;

public class SumOfElementInAnArray {

	public static void main(String[] args) {
		
		int a[]= {10,30,20,40,50};
		int sum=0;
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
		
			sum=sum+a[i];
		}
		System.out.println("Suma of elements in Array a : "+sum);
	}
}
