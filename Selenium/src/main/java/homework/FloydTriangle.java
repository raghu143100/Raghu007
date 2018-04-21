package homework;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp = 1;
	      Scanner input = new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows rquired:");
	      n = input.nextInt();
	      input.close();	 
	      System.out.println("Floyd's triangle is :");
	 
	      for ( int i = 1 ; i <= n ; i++ )
	      {
	         for ( int j = 1 ; j <= i ; j++ )
	         {
	            System.out.print(temp+" ");
	            temp++;
	         }
	 	         System.out.println();
	      }
	}
}