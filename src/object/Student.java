package object;

public class Student {
	
	int age = 20;
	String name = "Don";
	
	public static void main(String[] array)
	{
		
		Student s = new Student();
		
		System.out.println(s.name+" is "+s.age+" years old");
	}

}
