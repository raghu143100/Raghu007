package homework;

import java.util.Scanner;

public class AtoBValuesPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//1.Initialize two variables to store input Number.
				int a,b;
				//2.Initialize a scanner object to get the input from user.
				Scanner inputNumber=new Scanner(System.in);
				//3.Store the user input.
				System.out.println("Enter the First Number");
				a=inputNumber.nextInt();
				System.out.println("Enter the second Number");
				b=inputNumber.nextInt();
				//4.Close the scanner object
				inputNumber.close();
				//5.Check if the numbers between a and b are divisible by 3 and 5
				if(a>=b)
				{
					System.out.println("Second number should be greater than first number please try again");
				}
				else
				for(int i=a;i<=b;i++)
				{
					if((i%3)==0&&(i%5)!=0)
						System.out.print("FIZZ"+"\t");
					else if((i%5)==0&&(i%3)!=0)
						System.out.print("BUZZ"+"\t");
					else if((i%3)==0&&(i%5)==0)
						System.out.print("FIZZBUZZ"+"\t");
					else
						System.out.print(i+"\t");
				}
			}
		}