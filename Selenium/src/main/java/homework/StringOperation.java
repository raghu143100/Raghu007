package homework;

import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the operation name using Add/Substract/Multiply/Division :");
		String operation=input.next();
		System.out.println("Enter the first number :");
		int num1=input.nextInt();
		System.out.println("Enter the second number :");
		int num2=input.nextInt();
		input.close();
		if(operation.equals("Add"))
		{
			total=num1+num2;
			System.out.println("The total of num1 and num2 using "+operation+" is "+total );
		}
		else
			if(operation.equals("Substract"))
			{
				total=num1-num2;
				System.out.println("The total of num1 and num2 using "+operation+" is "+total );
			}
			else
				if(operation=="Substract")
				{
					total=num1*num2;
					System.out.println("The total of num1 and num2 using "+operation+" is "+total );
				}
				else
					if(operation.contentEquals("Division"))
					{
						total=num1/num2;
						System.out.println("The total of num1 and num2 using "+operation+" is "+total );
					}
		System.out.println("Invalid values entered please try again ");
	}
}