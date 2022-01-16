package yogeshNimbalkar;

public class A15_ArrayExample {

	//Return maximum number from given array
	int getMaxNumber(int[] input) {
		int maxNumber = input[0];
		for(int index=1; index<input.length; index++)
			if(maxNumber < input[index])
				maxNumber = input[index];
		return maxNumber;
	}
	
	//Return minimum number from given array
	int getMinNumber(int[] input) {
		int minNumber = input[0];
		for(int index=1; index<input.length; index++)
			if(minNumber > input[index])
				minNumber = input[index];
		return minNumber;
	}
	
	//Return count of positive numbers from given array  
	int getCountOfPositiveNum(int[] input) {
		int count = 0;
		for(int index=0; index<input.length; index++)
			if(input[index] > 0)
				count++;
		return count;
	}
	
	//Return sum of positive numbers
	int getSumOfPositiveNum(int[] input) {
		int sum = 0;
		for(int index=0; index<input.length; index++)
			if(input[index] > 0)
				sum += input[index];
		return sum;
	}
	//Return sum of all even positive numbers 
	int getSumOfEvenPositiveNum(int[] input) {
		int sum = 0;
		for(int index=0; index<input.length; index++)
			if(input[index] > 0 && input[index] % 2 == 0)
				sum += input[index];
		return sum;
	}
	
	//Return name having maximum length.
	String getNameOfMaxLength(String[] input) {
		int maxLength = input[0].length();
		String name = input[0];
		for(int index=1; index<input.length; index++)
			if(maxLength < input[index].length()) {
				maxLength = input[index].length();
				name = input[index];
			}
		return name;
	}
	
	public static void main(String[] args) {
		A15_ArrayExample arrayExample = new A15_ArrayExample();
		int[] arr1 = {14, 25, 92, -30, 45, -15};
		System.out.println("Maximum number from given array is : " + arrayExample.getMaxNumber(arr1));
		System.out.println("Minimum number from given array is : " + arrayExample.getMinNumber(arr1));
		System.out.println("Count of positive numbers from given array is : " + arrayExample.getCountOfPositiveNum(arr1));
		System.out.println("Sum of positive numbers from given array is : " + arrayExample.getSumOfPositiveNum(arr1));
		System.out.println("Sum of even positive numbers from given array is : " + arrayExample.getSumOfEvenPositiveNum(arr1));
		String[] arr2 = {"Priya", "Yogesh", "Ajit","Abhishek", "Pallavi"};
		System.out.println("Name with maximum length in given array is : " + arrayExample.getNameOfMaxLength(arr2));
	}
}
