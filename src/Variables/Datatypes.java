package Variables;

public class Datatypes {
	
	/* Primitive DT
	for long and float we need to add l and f literals respectively
	
	char - which stores single character in single quoatation 
	String - which stores multi characters in double quoatation
       
       */
	public static void main(String args[])
	{
	float a = 10.254f;
	long b = 1245367l;
	
	char c = 'f'; // valid
	// char d = 'abc'; invalid
	
	String name = "Navin"; // valid
	// String Name = 'Navin'; invalid
	
	System.out.println("char "+c+" and String "+name);
	
	System.out.println(a);
	System.out.println(b);
	
	// Java is a statically typed programming language
	
	/* 
	   int n = 5;
	String n = "Don";
	Here both variables declare with same so it will show error we cant give same variable for different DT
	  */
	 
	//  Python is dynamically typed programming language
	 /* 
	  n = 5;
	  n = "don";
	  we can write like this
	  */
	
	int m = 10;
	int o = 15;
	
	System.out.println("Sum of m and o is "+m+o); 
	//if we use + with String it works as concatenation
	System.out.println("Sum of m and o is "+(m+o));
	
	}
	
	
}
