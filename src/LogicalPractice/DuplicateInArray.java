package LogicalPractice;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int a[]= {10,35,20,47,50,10};
		
		boolean status=false;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[j]+" is duplicate value");
					status=true;
				}
			}
		}
		
		if(status==false) {
			System.out.println("Duplicate not found ");
		}
		
		
		String[] s= {"java","selenium","postman","rest assured","java"};
		
		boolean value=false;
		
		for(int x=0; x<s.length; x++) {
			
			for(int y=x+1; y<s.length; y++) {
				
				if(s[x]==s[y]) {
					
					System.out.println(s[x]+" is Duplicate");
					value=true;
				}
			}
		}
		
		if(value==false) {
			System.out.println("Duplicat not found");
		}
		
	}
}
