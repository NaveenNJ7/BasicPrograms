package object;

public class Testgeneral {

	
	public static void main(String[] args) {
		
		General g = new General();
		
		System.out.println("Item : "+g.item+"\nPrice : "+g.price);
		
		System.out.println("==============");
		
		g.item = "Eraser";
		g.price = 5;
		
		System.out.println("Item : "+g.item+"\nPrice : "+g.price);
		
		System.out.println("==============");
		
		g.item = "Sharpner";
		g.price = 10;
		
		System.out.println("Item : "+g.item+"\nPrice : "+g.price);
		
	}
}
