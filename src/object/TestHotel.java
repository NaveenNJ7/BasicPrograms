package object;

public class TestHotel {
	
	public static void main(String[] args) {
		
		Hotel H = new Hotel();
		
		

		
		System.out.println("Hotel name "+H.Hname+"\nOder is "+H.item+" and price is "+H.price);
		
		H.Hname = "RRR";
		H.item = "Eggrice";
		H.price = 80;
		
		System.out.println("Hotel name "+H.Hname+"\nOrder is "+H.item+" and price is "+H.price);
	}

}
