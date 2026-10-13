package LogicProgramms;

public class CountNumberInNumber {

	public static void main(String[] args) {
		
		//count numbers in number
		int num=45675;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
