package homework;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="TestLeaf java";
		String str2="TestLeaf Java";
		String str3=new String("TestLeaf Java");
		String str4=new String("testleaf java");
		String str5=new String("Java");

		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str4)&str3.contains(str5));
	}

}