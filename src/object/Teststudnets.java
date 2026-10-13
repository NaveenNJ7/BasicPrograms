package object;

public class Teststudnets {
	
	public static void main(String[] args) {
		
		Students s = new Students();
		
		s.name = "John";
		s.marks = 78;
		
		System.out.println("Student name : "+s.name+"\nmarks : "+s.marks);
		
		System.out.println("================");
		
		Students s1 = new Students();
		
		Students s2 = new Students();
		                                           
		s1.name = "Cena";
		s2.name = "Brock";
		
		System.out.println("Student name : "+s2.name+"\nmarks : "+s2.marks);
		
		
	}

}
