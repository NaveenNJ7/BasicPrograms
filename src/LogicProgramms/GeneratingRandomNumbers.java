package LogicProgramms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GeneratingRandomNumbers {

	public static void main(String[] args) {
		//nextInt() is non static
		Random random=new Random();
		int a=random.nextInt(10);   //number between 0 to 9
		System.out.println(a);
		int b=random.nextInt(11);  //number between 0 to 10
		System.out.println(b);
		
		double c=random.nextDouble(); //number between 0.0 to 1.0
		System.out.println(c);
		
		
		//random() is static method and return double value
		double e=Math.random();
		System.out.println(e);
		
		String number=RandomStringUtils.randomNumeric(9);
		System.out.println(number); //starts with any number between 0 to 9
		System.out.println("9"+number); //added 9
		
		String s=RandomStringUtils.randomAlphabetic(5);
		System.out.println(s); // > A to Z, upper and lower case both mix it will generate
	}
}
