package homework;

import java.util.HashSet;

public class FinaARepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {13,15,67,88,65,67,13,13,99,67,65,13,87,13};

		HashSet<Integer> list1 = new HashSet<Integer>();

		for(int i=0; i < a.length; i++){
			boolean unique = list1.add(a[i]);
			if(unique != true)
			{
				System.out.println("duplicate number " + a[i]);
			}
		}
	}   
}