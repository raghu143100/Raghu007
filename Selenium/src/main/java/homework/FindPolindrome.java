package homework;

public class FindPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputnumber = 14141;
		int number = inputnumber;
		int sumofdigits = 0;
		int quotient, reminder;

		while(inputnumber !=0)
		{
			quotient = inputnumber/10;
			reminder = inputnumber%10;
			sumofdigits = (sumofdigits*10)+reminder;
			inputnumber = quotient;
		}

		if(number==sumofdigits)
			System.out.println(" YES "  + number + "  is a " + "Polindrome number");
		else
			System.out.println(number + " is NOT a Polindrome number");
	}

}
