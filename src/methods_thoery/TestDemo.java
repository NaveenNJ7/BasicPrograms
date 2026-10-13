package methods_thoery;

public class TestDemo {

	int a;
	
	TestDemo(int a)
	{
		this.a=a;
	}
	void display()
	{
		System.out.println(a);
		a=20; // re initialized
	  System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		TestDemo t=new TestDemo(10);
		t.display();
		
	}
}
