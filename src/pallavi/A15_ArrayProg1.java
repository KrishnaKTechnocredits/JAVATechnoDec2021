//Assignment - 15 : 30th Dec'2021

/*Write a program to satisfy below requirement. Make sure method should take Array as parameter. 

Program 1 : return maximum number from give array.

Program 2 : return minimum number from given array.

Program 3: return count of positive numbers from given array.
sample input : int[] arr = {12,-11,99,11,23,-44}
output : 4

Program 4 : return sum of positive numbers from given array.
sample input : int[] arr = {10,20,-33,-55,2};
output : 32

Program 5 : print sum of all even positive numbers from given array.
sample input : int[] arr = {10,13, -14, -20, 22, 3};
output : 32
hint : 10 + 22 = 32

Program 6 : return name having maximum length from given array.
input : String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"};
output : Abhishek*/

package pallavi;

public class A15_ArrayProg1 {

	void printArray(int[] num) {
		System.out.println("Given array: ");
		for (int index = 0; index <= num.length-1; index++)
			System.out.print(num[index] + " ");
	}

	int getMaxArray(int[] num) {
		int maxNum = num[0];

		for (int index = 1; index <= num.length-1; index++) {
			if (num[index] >= maxNum)
				maxNum = num[index];
		}
		return maxNum;
	}

	int getMinFromArray(int[] num) {
		int minNum = num[0];

		for (int index = 1; index <= num.length-1; index++) {
			if (num[index] <= minNum)
				minNum = num[index];
		}
		return minNum;
	}

	int getPositiveCountFromArray(int[] num) {
		int count = 0;

		for (int index = 0; index <= num.length - 1; index++) {
			if (num[index] >= 0)
				count++;
		}
		return count;
	}

	int getPositiveSumFromArray(int[] num) {
		int sum = 0;

		for (int index = 0; index <= num.length - 1; index++) {
			if (num[index] >= 0)
				sum = sum + num[index];
		}
		return sum;
	}

	int getEvenPositiveCountFromArray(int[] num) {
		int sum = 0;

		for (int index = 0; index <= num.length - 1; index++) {
			if (num[index] >= 0 && num[index] % 2 == 0)
				sum = sum + num[index];
		}
		return sum;
	}

	String getMaxLengthString(String[] name) {
		int maxLength = name[0].length();
		String longName = name[0];

		for (int index = 1; index <= name.length - 1; index++) {
			if (name[index].length() >= maxLength) {
				maxLength = name[index].length();
				longName = name[index];
			}
		}
		return longName;
	}

	public static void main(String[] arr) {
		A15_ArrayProg1 a15_ArrayProg1 = new A15_ArrayProg1();

		int[] arr1 = { 112, 56, 9, 032, 302 };
		a15_ArrayProg1.printArray(arr1);
		System.out.println();
		System.out.println("Minimum Number from array: " + a15_ArrayProg1.getMinFromArray(arr1));
		System.out.println("Maximum Number from array: " + a15_ArrayProg1.getMaxArray(arr1));

		System.out.println();
		int[] arr2 = { 12, -11, 99, 11, 23, -44 };
		a15_ArrayProg1.printArray(arr2);
		System.out.println("Count of positive numbers in array: " + a15_ArrayProg1.getPositiveCountFromArray(arr2));

		System.out.println();
		int[] arr3 = { 10, 20, -33, -55, 2 };
		a15_ArrayProg1.printArray(arr3);
		System.out.println("Sum of positive numbers in array: " + a15_ArrayProg1.getPositiveCountFromArray(arr3));

		System.out.println();
		int[] arr4 = { 10, 13, -14, -20, 22, 3 };
		a15_ArrayProg1.printArray(arr4);
		System.out.println(
				"Sum of even positive numbers in array: " + a15_ArrayProg1.getEvenPositiveCountFromArray(arr4));

		System.out.println();
		String[] arr5 = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		System.out.println("Name with max length is: " + a15_ArrayProg1.getMaxLengthString(arr5));
	}
}
