package learningjava;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[][]= {{10,20},{30,40},{50,60}};

		for(int i=0; i<=2; i++)
		{
			for(int x=0; x<=1; x++)
			{
				System.out.println("Score "+ score[i][x]);//Printing two dimensional array with integer values using nested for loop
			}
			System.out.println(score[i][0]);//printing single char value of first index using single for loop
			System.out.println(score[i][1]);//printing single char value of first index using single for loop
		}

		String name[][]= {{"Raghu", "Sandeep"},{"Shetty", "K"},{"Ravindra","Kumar"}};
		for(int k=0; k<=2; k++)
		{
			for(int l=0; l<=1; l++)
				System.out.println(name[k][l]);//printing two dimensional array with string values using nested for loop
		}


		char graDes[][]= {{'A','B'},{'C','D'},{'E','F'}};
		int j=0;
		while(j<=2)
		{
			System.out.println(graDes[j][0]);//printing single char value of first index using single while loop
			System.out.println(graDes[j][1]);//printing single char value of second index using single while loop
			j++;
		}

		String fullName[][]= {{"Raghu", "Sandeep"},{"Shetty", "K"},{"Ravindra","Kumar"}};
		for(int p=0; p<=2; p++)
		{
			System.out.println(fullName[p][0]+fullName[p][1]);//Single line print of two dimensional array of strings using single for loop
		}
	}
}