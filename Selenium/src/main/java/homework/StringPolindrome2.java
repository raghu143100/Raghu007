package homework;

import java.util.Scanner;

public class StringPolindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to find whether its poindrome or not :");
		String inputString = in.nextLine();
		in.close();
		int length  = inputString.length();
		int i, start, end, middle;

		start  = 0;
		end    = length - 1;
		middle = (start + end)/2;

		for (i = start; i <= middle; i++) {
			if (inputString.charAt(start) == inputString.charAt(end)) {
				start++;
				end--;
			}
			else {
				break;
			}
		}
		if (i == middle + 1) {
			System.out.println("The entered String is Polindrome");
		}
		else {
			System.out.println("The entered String is NOT a Polindrome please try again");
		} 	
	}

}
