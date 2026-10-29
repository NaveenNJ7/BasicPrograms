package LogicalPractice;

public class RemovingJunksInString {

	public static void main(String[] args) {
		
		String s= "KLDFJL0809sfcx&^$%^324545*-/9340I JK";
		
		System.out.println(s);
		
	    s=s.replaceAll("[^A-Za-z0-9]", ""); 
	    //whatever we write inside [^] except that everything will remove
	    //[^A-Z], except a to z lower case letters remaining characters will remove. ==> sfcx
	    //[^A-Z] except A to Z Upper case letters remaining characters will remove. ==> KLDFJLIJK
	    //"[^0-9]" except 0 to 9 numbers remaining characters will remove. ==> 08093245459340
	    // "[^A-Za-z0-9]"  ==> KLDFJL0809sfcx3245459340IJK
		
	    System.out.println(s);
	}
}
