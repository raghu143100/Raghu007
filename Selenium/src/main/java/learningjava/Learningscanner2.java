package learningjava;

import java.util.Scanner;

public class Learningscanner2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the A value : ");
		int a=input.nextInt();

		System.out.println("Enter the B value :");
		int b=input.nextInt();

		System.out.println("Sum of A and B : "+ (a+b));
		input.close();
	}
}