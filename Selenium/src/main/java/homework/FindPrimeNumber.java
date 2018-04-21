package homework;

import java.util.*;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime=true;
		int temp;
		Scanner get=new Scanner(System.in);
		System.out.println("Enter any Number to find whether the entered number is prime or not :");
		int inputNumber=get.nextInt();
		get.close();

		for(int i=2;i<=inputNumber/2;i++)
		{
			temp=inputNumber%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
			System.out.println(inputNumber + " is a Prime Number");
		else
			System.out.println(inputNumber + " is not a Prime Number");
	}

}


