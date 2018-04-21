package learningjava;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String graDe[]= {"A","B","C"};
		for(String reSults:graDe)
		{
			System.out.println(reSults);//printing the array char values using for loop
		}
		
		int score[]= {10,20,30,40,50};

		for(int i=0; i<=4; i++)
		{
			System.out.println("Score "+ score[i]);//printing the array integer values using for loop
		}

		String name[]= {"Raghu", "Sandeep", "Shetty"};
		for(int i=0; i<=2; i++)
		{
			System.out.println("Names "+name[i]);
		}
		System.out.print("Name "+name[0]+name[1]+name[2]);//printing the array string values using for loop
		System.out.println();
		int j=0;
		while(j<=2)
		{
			System.out.println("Names "+name[j]);//printing the array string values using while loop
			j++;
		}
		char graDes[]= {'A','B','C'};
		for(char reSults:graDes)
		{
			System.out.println(reSults);//printing the array char values using for loop
		}
		
		System.out.println("String    :");
		for(String group:graDe)
		{
			System.out.println("Name & Blood Group :" +group);
		}
		
		int y=0;
		do
		{
			System.out.println("Names "+name[y]);//printing the array string values using for do while
			y++;
		}while(y<=2);
	}
}
