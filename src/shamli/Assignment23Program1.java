package shamli;

public class Assignment23Program1 {
	
	void findSecondMaxFromArray(int arr[])
	{
		int max=0;
		int secondMax=0;
		if(arr[0]>arr[1])
		{
			max=arr[0];
			secondMax=arr[1];
		}
		else
		{
			max=arr[1];
			secondMax=arr[0];
		}
		for(int index=2;index<arr.length;index++)
		{
			if(max<arr[index])
			{
				secondMax=max;
				max=arr[index];
			}
			else if(max>arr[index] && secondMax<arr[index])
			{
				secondMax=arr[index];
			}
		}
		System.out.println("Second maximum number from given array is : "+secondMax);
	}
	
	void findNthMax(int arr[],int nthNum)
	{
		int nthMax=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			nthMax=arr[i];
			for(int j=1;j<arr.length;j++)
			{
				
				if(arr[j]>arr[i])
				{
					count++;
				}
			}
			if(count==(nthNum-1))
			{
				nthMax=arr[i];
				System.out.println(nthNum +" nd/rd/th maximum number from the array is : "+nthMax);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment23Program1 assignment23 = new Assignment23Program1();
		int arr[]= {10,7,11,99,56,46,3};
		assignment23.findSecondMaxFromArray(arr);
		assignment23.findNthMax(arr, 3);
	}
}
