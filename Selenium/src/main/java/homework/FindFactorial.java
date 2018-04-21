package homework;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fact=1; int i=1; 
		System.out.println("Enter the Number to find Factorial :");
		Scanner inputNumber=new Scanner(System.in);
		int number=inputNumber.nextInt();
		inputNumber.close();
		if(number<=0)
		{
			System.out.println("The entered number is invalid try aobve zero number");
		}
		else
		{
		 while(i<=number)
	        {
	            fact = fact * i;
	            i++;
	        }
		System.out.println("Factorial of "+number+" is: "+fact);
		}

	}	
}