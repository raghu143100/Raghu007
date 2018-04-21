package homework;

import java.util.Scanner;

public class CharacterPercentage {

	public static void main(String[] args) {
	
		float upperCase=0;
		float lowerCase=0;
		float digits=0;
		float others=0;

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String :");
		String string = input.nextLine();
		input.close();
		int length = string.length();

		for (int i=0; i<length; i++) {
			char ch=string.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperCase++;
			}
			if(Character.isLowerCase(ch)) {
				lowerCase++;
			}
			if(Character.isDigit(ch)) {
				digits++;
			}
			if(!Character.isLetterOrDigit(ch)){
				others++;
			}
		}
		float uppercasepercentage=(upperCase*100)/length;
		float lowercasepercentage=(lowerCase*100)/length;
		float digitspercentage=(digits*100)/length;
		float otherspercentage=(others*100)/length;
		float totalpercentage=(uppercasepercentage+lowercasepercentage+digitspercentage+otherspercentage);
		
		System.out.println("The Entered String is : "+string+" And length of String is :"+length);
		System.out.println("Number of uppercase letters is "+upperCase+"  So Percentage is "+uppercasepercentage+" %");
		System.out.println("Number of lowerCase letters is "+lowerCase+"  So Percentage is "+lowercasepercentage+" %");
		System.out.println("Number of digits is "+digits+"  So Percentage is "+digitspercentage+" %");
		System.out.println("Number of  other charecter is "+others+"  So Percentage is "+otherspercentage+" %");
		System.out.println("Total percentage of String is :"+totalpercentage+" %");
		
	}
}