package yogiraj;

class Assignment25
{
	int [] arr = {1,2,3,4,5,6,7,8,9,10};
	
	int num[] = { 1, 2, 8, 10, 9, 5, 7, 6, 4 };
	
	int sum = 0 , sum1=0;
	
	
	public int findMissingNumber()
	{
		for(int i=0; i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		for(int i=0; i<num.length;i++)
		{
			sum1 = sum1 + num[i];
		}
		
		return sum - sum1;
		
	}
	
	public static void main(String[] args) 
	{
		Assignment25 a = new Assignment25();
		
		int missingNumber = a.findMissingNumber();
		
		System.out.println("Missing number is   "+missingNumber);
	}
}