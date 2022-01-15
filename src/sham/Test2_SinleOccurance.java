package sham;

public class Test2_SinleOccurance {
		
	void returnSingleOccurance(int arr[])
	{
	System.out.println("Single occurance Numbers from Array is: ");
		for(int i =0;i<arr.length;i++)
		{
			int count=0;
			for(int j =0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count<=1)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	}

	public static void main(String[] args) {
		Test2_SinleOccurance single = new Test2_SinleOccurance();
		int[] arr1 = { 5, 8, 1, 2, 4, 3, 2, 1 };
		single.returnSingleOccurance(arr1);

	}

}
