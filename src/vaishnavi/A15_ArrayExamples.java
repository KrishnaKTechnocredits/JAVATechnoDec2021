package vaishnavi;

public class A15_ArrayExamples {

	int printMaximumNumFromArray(int[] num) {
		int maximumNumber =num[0];
		for(int index = 0; index < num.length; index++) {
			if(maximumNumber < num[index]) {
				maximumNumber = num[index];
			}
		}
		return maximumNumber;
	}
	
	int getMinimumNumFromArray(int[] num) {
		int minimumNumber = num[0];
		for(int index = 1; index < num.length; index++) {
			if(minimumNumber > num[index]) {
				minimumNumber = num[index];
			}
		}
		return minimumNumber;
	}
	
	int countOfPositiveNumber(int[] num) {
		int count = 0;
		for (int index = 0; index < num.length; index++) {
			if(num[index]>0) {
				count++;
			}
		}
		return count;
	}
	
	int sumOfPositiveNumber(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if(num[index]>0) {
				sum = sum + num[index];
			}
		}
		return sum;
	}
	
	int printSumOfAllEvenPositiveNum(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if(num[index]>0) {
				if(num[index] % 2 == 0)
				sum = sum + num[index];
			}
		}
		return sum;
	}
	
	String maximumLengthName(String[] str) {
		int maxLengthOfName = 0;
		String nameWithMaxLength = null;
		for (int index = 0; index < str.length; index++) {
			if(maxLengthOfName < str[index].length()) {
				maxLengthOfName = str[index].length();
				nameWithMaxLength = str[index];
			}
		}
		return nameWithMaxLength;
	}
	public static void main(String[] args) {
		A15_ArrayExamples a15_ArrayExamples = new A15_ArrayExamples();
		
		int[] maximumNumber = {10,30,40,5,6,20};
		System.out.println("Maximum numbers from given array is  : " + a15_ArrayExamples.printMaximumNumFromArray(maximumNumber));
		System.out.println();
		int[] minimumNumber = {10,30,40,5,6,20};
		System.out.println("Minimum numbers from given array is  : " + a15_ArrayExamples.getMinimumNumFromArray(minimumNumber));
		System.out.println();
		int[] countOfPositiveNum = {12,-11,99,11,23,-44};
		System.out.println("Count of positive numbers from given array is  : " + a15_ArrayExamples.countOfPositiveNumber(countOfPositiveNum));
		System.out.println();
		int[] sumOfPositiveNum = {12,-11,99,11,23,-44};
		System.out.println("Sum of all positive numbers from given array is  : " + a15_ArrayExamples.sumOfPositiveNumber(sumOfPositiveNum));
		System.out.println();
		int[] sumPositiveEvenNum = {10, 13, -14, -20, 22, 3};
		System.out.println("Sum of all positive even numbers from given array is : " + a15_ArrayExamples.printSumOfAllEvenPositiveNum(sumPositiveEvenNum));
		System.out.println();
		String[] str = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
		System.out.println("Name with maximum length from given array is : " + a15_ArrayExamples.maximumLengthName(str));		
	}

}
