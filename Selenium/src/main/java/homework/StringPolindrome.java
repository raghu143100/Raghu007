package homework;

import java.util.Scanner;

public class StringPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a string to find whether its poindrome or not :");
		 String str=input.nextLine();
		 input.close();
		 StringBuffer str1=new StringBuffer(str);
		 StringBuffer str2=new StringBuffer(str1);
		 
		  str1.reverse();
		 
		  System.out.println("Orginal String ="+str2);
		  System.out.println("After Reverse ="+str1);
		 
		 if(String.valueOf(str1).compareTo(String.valueOf(str2))==0)
		   System.out.println("The entered String is Polindrome");
		    else
		    System.out.println("The entered String is NOT a Polindrome please try again");
	}

}
