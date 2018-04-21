package homework;

import java.util.Scanner;

public class StringPassword2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Password");
		String input = scan.next(); 
		scan.close();
		System.out.println(isValid(input));
	}

	private static String isValid(String input) {
		int i,letterCounter=0, digitCounter=0, specialCharacter=0, upperCaseCounter=0;
		String specialCharacters=" ~`!@#$%^&*()-_=+[{]}|;',.<>/?";
		String issue = null;
		char[] pass=input.toCharArray();
	    for(i=0;i<pass.length;i++)
	    {
			if(Character.isLetter(pass[i]))
				letterCounter++;
			else if(Character.isDigit(pass[i]))
				digitCounter++;
			else if(Character.isUpperCase(pass[i]))
				upperCaseCounter++;
			else if(specialCharacters.contains(String.valueOf(pass[i])))
					specialCharacter++;		
	    }
	    if(pass.length<=10)
	    	issue="Your Password: "+input+" is invalid...! Length should not be less than 10";
	    else if(digitCounter<2)
	    	issue="Your Password: "+input+" contains less than two digits";
	    else if(letterCounter<2)
	    	issue="Your Password: "+input+" contains less than two letters";
	    else if(upperCaseCounter>0)
	    	issue="Your Password: "+input+" doesnt contain any upper case letters";	    
	    else if(specialCharacter>0)
	    	issue="Your Password: "+input+" contains Special Characters";
	    else
	    	issue="Your Password: "+input+" is Valid";
		return issue; 
	}

}