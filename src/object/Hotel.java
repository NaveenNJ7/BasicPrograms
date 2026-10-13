package object;

public class Hotel {

	
	String Hname = "RPD";
	int price = 100;
	String item = "Masala rice";
	
	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		System.out.println("Hotel name "+h.Hname);
		System.out.println("Dish "+h.item);
		System.out.println("Price "+h.price);
	}
}
