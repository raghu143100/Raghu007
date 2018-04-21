package learningjava;

public class SomeOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputnumber = 786;
		int number = inputnumber;
		int sumofdigits = 0;
		int quotient, reminder;
		/*for(int i=0; i<=2; i++)
{
	quotient = inputnumber/10;
	reminder = inputnumber%10;
	sumofdigits = sumofdigits+reminder;
	inputnumber = quotient;
}*/
		while(inputnumber !=0)
		{
			quotient = inputnumber/10;
			reminder = inputnumber%10;
			sumofdigits = sumofdigits+reminder;
			inputnumber = quotient;
		}
		System.out.println("Sum of Digit "   + number + "  is  " + sumofdigits);
	}
}