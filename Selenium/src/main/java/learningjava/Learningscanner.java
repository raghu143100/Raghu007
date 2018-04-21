package learningjava;

import java.util.Scanner;

public class Learningscanner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Full Name:");
		String name=input.nextLine();
		System.out.println("Enter the Age:");
		int age=input.nextInt();
		System.out.println("Enter the Gender F/M:");
		char gender=input.next().charAt(0);
		System.out.println("Enter the Mobile Number");
		long mobilenumber=input.nextLong();

		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Mobile Number: "+mobilenumber);
		
		input.close();

	}

}
