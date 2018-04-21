package homework;

import java.util.Scanner;

public class SwapTwoVariablesWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int x,y;   
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the value of x");
				x=scan.nextInt();
				System.out.println("Enter the value of y");
				y=scan.nextInt();
				scan.close();
				System.out.println("");
				System.out.println("Before Swapping");
				System.out.println("Value of x is :" + x);
				System.out.println("Value of y is :" + y);

				//add both the numbers and assign it to first
				x = x + y;
				y = x - y;
				x = x - y;
		        System.out.println("");
				System.out.println("After Swapping");
				System.out.println("Value of x is :" + x);
				System.out.println("Value of y is :" + y);
			}
		}