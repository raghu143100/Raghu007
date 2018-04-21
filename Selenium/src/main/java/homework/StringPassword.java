package homework;

import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print(
				"Instructions : \n"+
						"1. A password must have at least ten characters.\n" +
						"2. A password consists of only letters and digits.\n" +
						"3. A password must contain at least two digits and two letters \n" +
						"4. A password must contain at least one Capital letter \n" +
				"********Enter the Password********* \n :");
		String password = input.nextLine();

		input.close();

		if (checkPassword(password))
		{
			System.out.println("Your password: "+password+", sucessfully match the requirements");
		} else
			System.out.println("Your password: "+password+", did not match the requirements");
	}

	public static boolean checkPassword(String password){

		int charCount = 0;
		int numCount = 0;

		if (password.length() >= 10) {

			for (int i = 0; i < password.length(); i++) {

				if (!Character.isLetterOrDigit(password.charAt(i))) {
					return false;
				}

				if (!Character.isUpperCase(password.charAt(i))) {
					return false;
				}
				char ch = password.charAt(i);

				if (is_Numeric(ch)) numCount++;
				else if (is_Letter(ch)) charCount++;
				else return false;
			}
		}
		return (charCount >= 2 && numCount >= 2);
	}

	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}
	
	public static boolean is_Numeric(char ch) {
		return (ch >= '0' && ch <= '9');
	}
}