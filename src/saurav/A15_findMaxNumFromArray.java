package saurav;

public class A15_findMaxNumFromArray {

	int findMaxNum(int[] numbers) {
		int maxNum = numbers[0];
		for (int index = 1; index < numbers.length; index++) {
			if (maxNum < numbers[index]) {
				maxNum = numbers[index];
			}
		}
		System.out.println(maxNum);
		return maxNum;
	}

	int findMinNum(int[] numbers) {
		int minNum = numbers[0];
		for (int index = 1; index < numbers.length; index++) {
			if (minNum > numbers[index]) {
				minNum = numbers[index];
			}
		}
		System.out.println(minNum);
		return minNum;
	}

	int getPositiveNumCount(int[] numbers) {
		boolean flag = true;
		int positiveNumCount = 0;
		int sumOfPositiveNum = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > 0) {
				positiveNumCount++;
				sumOfPositiveNum = sumOfPositiveNum + numbers[index];
				flag = false;
			}
			if (flag == true)
				System.out.println("there is no negative number in an array");
		}

		System.out.println("Count of positive numbers is :  " + positiveNumCount);
		System.out.println("sum of positive numbers :  " + sumOfPositiveNum);
		return positiveNumCount;
	}

	void sumOfEvenPositiveNum(int numbers[]) {
		int sumOfEvenPositiveNum = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > 0 && numbers[index] % 2 == 0) {
				sumOfEvenPositiveNum = sumOfEvenPositiveNum + numbers[index];
			}
		}
		System.out.println(sumOfEvenPositiveNum);
	}

	String stringHavingMaxLength(String[] input) {
		int maxLength = 0;
		String maxLengthString = null;
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > maxLength) {
				maxLength = input[index].length();
				maxLengthString = input[index];
			}
		}
		System.out.println(maxLengthString);
		return maxLengthString;
	}

	public static void main(String[] a) {
		A15_findMaxNumFromArray maxnum = new A15_findMaxNumFromArray();
		int[] numbers = { 10, 13, -14, -20, 22, 3 };
		System.out.print("Max num from given array is : ");
		maxnum.findMaxNum(numbers);
		System.out.print("Min num from given array is : ");
		maxnum.findMinNum(numbers);
		System.out.print("Sum of even positive num from array is : ");
		maxnum.sumOfEvenPositiveNum(numbers);
		maxnum.getPositiveNumCount(numbers);
		String[] input = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		System.out.print("String having max length from given array :");
		maxnum.stringHavingMaxLength(input);

	}
}
