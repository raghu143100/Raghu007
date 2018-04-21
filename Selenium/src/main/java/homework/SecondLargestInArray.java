package homework;

public class SecondLargestInArray {

	public static void main(String[] args) {

		int a[]= {20,340,21,879,92,21,474,83647,-200}; 
		int i=0,largest=a[0],secondLargest=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondLargest=largest;
				largest=a[i];
			}
			else if(a[i]>secondLargest)
			{
				secondLargest=a[i];
			}
		}
		System.out.println("The second largest number is "+secondLargest);
	}
}