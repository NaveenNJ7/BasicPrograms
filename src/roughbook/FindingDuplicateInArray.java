package roughbook;

import java.util.HashSet;

public class FindingDuplicateInArray {

	public static void main(String[] args) {
		
		/*	String[] s= {"java","selenium","testng","java","testng","restassured"};
		
		for(int i=0; i<s.length; i++) {
				
			for(int j=i+1; j<s.length;j++) {
				
				if(s[i].equals(s[j])) {
					System.out.println(s[i]+" is duplicated");
					break;
				}
			}
		   
		}    */
		
		
/*		String s[]= {"java","selenium","testng","restassured","postman","java"};
		
		boolean status=false;
		
		for(int i=0; i<s.length; i++) {
			
			for(int j=i+1; j<s.length; j++) {
				
				if(s[i].equals(s[j])) {
					System.out.println("Duplicate found : "+s[i]);
					status=true;
				}
			}
		}
		
		if(status==false) {
			System.out.println("Duplicate not found");
		}
		   */
		
		String s[]= {"java","selenium","testng","restassured","postman","java"};
		
		HashSet<String> hs=new HashSet<>();
		
		boolean status=false;
		
		for(String l:s) {
			
			if(hs.add(l)==false) {
				System.out.println("Duplicate found : "+l);
				status=true;
			}
		}
		if(status==false) {
			System.out.println("Duplicate not found");
			
		}
		
	}
}
