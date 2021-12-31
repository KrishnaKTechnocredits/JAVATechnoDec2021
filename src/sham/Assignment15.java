package sham;

public class Assignment15 {

	int findMaximumNumber()
			{
			int arr[]= {2,5,6,11,7,5};
			int max = arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
					//System.out.println("Maimum number is "+arr[i]);
				}
			}
				return max;
		
			}
	int findMinimumNumber()
	{
	int arr[]= {2,5,6,11,7,5};
	int max = arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(max>arr[i])
		{
			max=arr[i];
			
		}
	}
		return max;

	}
	int findPositiveNumbers()
	{
	int arr[]= {12,-11,99,11,23,-44};
	int positiveCount = 0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
		{
			positiveCount+=1;
			
		}
	}
		return positiveCount;

	}
	
	int findSumOfAllPositiveNumbers()
	{
	int arr[]= {10,20,-33,-55,2};
	int positiveSum = 0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>0)
		{
			positiveSum=positiveSum+arr[i];
			
		}
	}
		return positiveSum;

	}
	void stringLengthFromArray() {
	String	maxlenName="";
	int maxLength=0;
		String nameArray[]= {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		for(int i=0;i<nameArray.length;i++)
		{
			if(maxLength<nameArray[i].length()) {
				maxLength=nameArray[i].length();
				maxlenName=nameArray[i];
			}
			
			
		}
		System.out.println("Maximum lenth of String from given Array is: "+maxlenName);
	}
	public static void main(String[] args) {
		Assignment15 assignment= new Assignment15();
		int max=assignment.findMaximumNumber();
		assignment.findMinimumNumber();
		System.out.println("Maximum number from giver Array is: "+max);
		int min=assignment.findMinimumNumber();
		System.out.println("Minimum number from giver Array is: "+min);
		
		int positivenum=assignment.findPositiveNumbers();
		System.out.println("Total Positive number Count is: "+positivenum);
		
		int positiveSum=assignment.findSumOfAllPositiveNumbers();
		System.out.println("Total Positive number Sum is: "+positiveSum);
		
		assignment.stringLengthFromArray();
	}

}
