package controleflowstatements;

 public class ArrayWithIfandIfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double scores[]= {10.1,20.2,30.4,40.5,50.6,75.66,89.67};
		int cutoff=35;
		for (int i=0; i<scores.length; i++)
		{
			//System.out.println(scores[i]);//Printing the scores using length

			if (scores[i]<cutoff)

				System.out.println(scores[i]+" Fail");//Printing the result with score
			else
				System.out.println(scores[i]+" PASS");//Printing the result with score
		}
		
		for (int j=0; j<scores.length; j++)
		{
			//System.out.println(scores[i]);//Printing the scores using length

			if (scores[j]>cutoff)

				System.out.println(scores[j]+" PASS");//Printing the result only if PASS
		}
	}

}
