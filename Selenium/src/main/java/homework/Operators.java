package homework;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=20;
		//Arithmetic operators
		System.out.println("Additon of a=10 and b=20 is " + (a+b));
		System.out.println("Substraction of a=10 and b=20 is " + (a-b));
		System.out.println("Multiplication of a=10 and b=20 is " + (a*b));
		System.out.println("Division of a=10 and b=20 is " + (a/b));
		System.out.println("Reminder of a=10 and b=20 is " + (a%b));
		//Relational Operators
		if(a>b)
			System.out.println("True");
		else
			System.out.println("False");
		//Logical operators
		System.out.println(a<b&&a<c);
		System.out.println(a>b||a<c);
		//Assignment Operators
		System.out.println(a+=7);
		System.out.println(b-=7);
		System.out.println(a*=7);
		System.out.println(a/=2);
	}
}
