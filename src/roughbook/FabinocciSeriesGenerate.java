package roughbook;

public class FabinocciSeriesGenerate {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.print(n1+","+n2+",");
		
		for(int i=0; i<=10; i++) {
			
			sum=n1+n2; //sum=0+1=1,1+1=2,1+2=3
			System.out.print(sum+",");
			n1=n2;	  //n1=1,1,	
			n2=sum;   //n2=1,2,
		}
	}
	
}
