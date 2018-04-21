package homework;

public class TwoDBloodGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String bGroup[][]= {{"Raghu","O+"},{"Sandeep","A+"},{"Shetty","B+"}};

		//foreach loop 
		for(String[] group7:bGroup)
		{
			System.out.println("Name & Blood Group :" +group7[0] +" and "+group7[1]);
		}

		//Nested foreach loop
		for(String[] group:bGroup)
		{
			for (String groups:group)
			{
				System.out.println("Name & Blood Group : "+groups);
			}
		}

		
		//Single For Loop
		for(int i=0; i<=2; i++)
		{
			System.out.print("Name : "+bGroup[i][0]);
			System.out.println("  Blood Group : "+bGroup[i][1]);
		}

		//Nested For Loop
		for(int j=0; j<=2; j++)
		{
			for(int k=0; k<1; k++)
			{
				System.out.println("Name : "+bGroup[j][0]+" & Blood Group : "+bGroup[j][1]);
			}
		}

		//While Loop
		int l=0;
		while(l<=2)
		{
			System.out.print("Name : "+bGroup[l][0]);
			System.out.println("  Blood Group : "+bGroup[l][1]);
			l++;
		}

		 
	}

}
