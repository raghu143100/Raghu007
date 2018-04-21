package homework;

import java.util.Scanner;

public class FindingLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Program to find Leap Year "+"\n"+"Enter any year :");
		int year = input.nextInt();
		input.close();
		/*The rule states: “Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100,
		but these centurial years are leap years if they are exactly divisible by 400.” 
		Logic behind this rule: Earth complete orbit occurs every 365.242375 days around the sun.?*/
		
		if(year % 4 == 0)
		{
			System.out.println("Year "+year+" is a Leap Year");
		}
		else if (year % 100 == 0)
		{
			System.out.println("Year "+year+" is not a Leap Year");
		}
		else if(year % 400 == 0)
		{
			System.out.println("Year "+year+" is a Leap Year");
		}
	}
}