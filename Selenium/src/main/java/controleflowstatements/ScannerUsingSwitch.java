package controleflowstatements;

import java.util.Scanner;

public class ScannerUsingSwitch {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the values between 1 to 7");
		int number=input.nextInt();
		input.close();
		switch(number)
		{
		case 1:
			System.out.println("Monday");break;
		case 2:
			System.out.println("Tuesday");break;
		case 3:
			System.out.println("Wednsday");break;
		case 4:
			System.out.println("Thursday");break;
		case 5:
			System.out.println("Friday");break;
		case 6:
			System.out.println("Saturday");break;
		case 7:
			System.out.println("Sunday");break;
		default:
			System.out.println("Enter the valid number");
		}
	}
}