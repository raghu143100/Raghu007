package learningjava;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		int b=7;

		System.out.println("Addition  "  + add(a,b));
		System.out.println("Subtraction  "  + sub(a,b));
		System.out.println("Multiplication  "  + mul(a,b));
		System.out.println("Division  "  + div(a,b));
	}
	public static int add(int num1, int num2)//Addition of two numbers
	{
		return(num1+num2);
	}
	public static int sub(int num1, int num2)//Subtraction of two numbers
	{
		return(num1-num2);
	}

	public static int mul(int num1, int num2)//Multiplication of two numbers
	{
		return(num1*num2);
	}

	public static int div(int num1, int num2)//Division of two numbers
	{
		return(num1/num2);
	}
}