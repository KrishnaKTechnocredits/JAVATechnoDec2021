package shamli;

public class Assignment15 {
	
	int returnMaximumNumberFromArray(int[] arr) {
		int max=arr[0];
		for(int index=1;index<arr.length;index++)
		{
			if(max<arr[index])
			{
				max=arr[index];
			}
		}
		return max;
	}
	
	int returnMinimumNumberFromArray(int[] arr) {
		int min=arr[0];
		for(int index=1;index<arr.length;index++)
		{
			if(min>arr[index])
			{
				min=arr[index];
			}
		}
		return min;
	}

	int returnSumOfPositiveNumbersOfArray(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]>0)
			{
				sum=sum+arr[index];
			}
		}
		return sum;
	}
	
	int returnSumOfAllEvenPositiveNumbersOfArray(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]>0 && arr[index]%2==0)
			{
				sum=sum+arr[index];
			}
		}
		return sum;
	}
	
	int totalPositiveNumbers(int[] arr) {
		int count=0;
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]>0)
			{
				count++;
			}
		}
		return count;
	}
	
	String getMaxLengthString(String[] name) {
		int maxlength=0;
		String maxstring=name[0];
		for(int index=0;index<name.length;index++)
		{
			if(maxlength<name[index].length())
			{
				maxlength=name[index].length();
				maxstring=name[index];
			}
		}
		return maxstring;
	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		int[] arr= {10,25,99,-40,51,119,-78,5,6};
		int maxNum=assignment15.returnMaximumNumberFromArray(arr);
		System.out.println("Maximum number from array is :"+ maxNum);
		int minNum=assignment15.returnMinimumNumberFromArray(arr);
		System.out.println("Minimum number from array is :"+ minNum);
		int sumOfPositiveNum=assignment15.returnSumOfPositiveNumbersOfArray(arr);
		System.out.println("Sum of positive Numbers from array is :"+ sumOfPositiveNum);
		int totalPosNum=assignment15.totalPositiveNumbers(arr);
		System.out.println("Total positive numbers from array are :"+ totalPosNum);
		int sumOfEvenPosNum=assignment15.returnSumOfAllEvenPositiveNumbersOfArray(arr);
		System.out.println("Sum Of All Even positive numbers from array is :"+ sumOfEvenPosNum);
		String[] name= {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		String maxlengthString=assignment15.getMaxLengthString(name);
		System.out.println("String with max length is :"+ maxlengthString);
	}

}