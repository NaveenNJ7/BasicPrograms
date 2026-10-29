package LogicalPractice;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		
		String s = "Do more work and be confident dont loose hope";
		
		int totalLength= s.length();
		
		int lengthOfR=s.replaceAll("r", "").length();
		
		System.out.println("Total lenght of String : "+totalLength);
		
		System.out.println("Length of String without r : "+lengthOfR);
		
		System.out.println(totalLength-lengthOfR);
		
		
		
	}
}
