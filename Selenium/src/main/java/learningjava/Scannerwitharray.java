package learningjava;

import java.util.*;

public class Scannerwitharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Scanner input=new Scanner(System.in);
		System.out.print("Enter how many friends: ");
		int totalfriends=Integer.parseInt(input.nextLine());
		String name[]=new String[totalfriends];
		for (int i = 0; i <name.length; i++) {
			System.out.print("Enter the name of friend " + (i+1) + " : ");
			name[i] = input.nextLine();
		}
		for (int i = 0; i < name.length; i++) {
			System.out.print("My friend " + (i+1) + " : ");
			System.out.print(name[i] + "\n");
		}
		input.close();

		 */













		Scanner get=new Scanner(System.in);
		System.out.print("Enter how many subject: ");
		int total1=Integer.parseInt(get.nextLine());
		System.out.print("Enter how many teachers: ");
		int total=Integer.parseInt(get.nextLine());
		String names[][]=new String[total][total1];

		for (int j = 0; j <names.length; j++) {
			int k=+1;
			for(k=0;k<names.length; k++)
			{
				System.out.print("Enter the name of Subject " + (j+1) + " : ");
				names[j][k] = get.nextLine();
				System.out.print("Enter the name of Teacher " + (k+1) + " : ");
				names[j][k] = get.nextLine();
				k++;
			}
		}
		for (int j = 0; j < names.length; j++) {
			int k=+1;
			for(k=0;k<names.length; k++)
			{
				System.out.print("Name of Subject " + names[j][k]);

				System.out.println("Name of Teacher " + names[j][k]);
				k++;
			}
		}System.out.println();
		get.close();
	}
}