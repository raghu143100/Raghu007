package homework;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number = input.nextInt();
		System.out.println("Enter the Digit :");
		int digit = input.nextInt();
		input.close();
		System.out.println("The entered number is :"+number);
		System.out.println("The entered digit is :"+digit);
		
		int lLessThanN = getLLessThanN(number, digit);
		
		System.out.println("The largest Number less than "+number+" is :"+lLessThanN);
	}

    static int getLLessThanN(int number, int digit)
    {
        //Converting digit to char
 
        char c = Integer.toString(digit).charAt(0);
 
        //Decrementing number & checking whether it contains digit
 
        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {
                //If 'i' doesn't contain 'c'
 
                return i;
            }
        }
 
        return -1;
    }
}
