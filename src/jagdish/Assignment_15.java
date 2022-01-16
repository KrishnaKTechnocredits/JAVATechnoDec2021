package jagdish;

public class Assignment_15 {

	// 1. return maximum number from give array.
	int retrunMaxNoArray(int[] returnmax) {
		int max = returnmax[0];
		for (int index = 1; index < returnmax.length; index++) {

			if (max < returnmax[index])
				max = returnmax[index];

		}

		return max;

	}

	// 2. return minimum number from given array.
	int retrunMinNoArray(int[] arr) {
		int min = arr[0];
		for (int index = 1; index < arr.length; index++) {

			if (min > arr[index])
				min = arr[index];
		}

		return min;
	}

	// 3. return name having maximum length from given array.
	String findLenght(String[] name) {
		String tempvalue = "";
		int store = name[0].length();
		for (int index = 1; index < name.length; index++) {
			if (store < name[index].length())
				tempvalue = name[index];
		}
		return tempvalue;

	}

	// 4. return count of positive numbers from given array.
	int countOfPositiveNo(int[] number) {
		int holdPositiveNo = 0;
		for (int index = 0; index < number.length; index++) {
			if (number[index] >= 0)
				holdPositiveNo++;

		}

		return holdPositiveNo;
	}

	// 5. return sum of positive numbers from given array.
	int sumOfPositiveNo(int[] number) {

		int sum = number[0];
		for (int index = 1; index < number.length; index++) {
			if (number[index] >= 0)
				sum = sum + number[index];
		}

		return sum;
	}

	// 6. print sum of all even positive numbers from given array.
	int sumOfEvenPositiveNo(int[] evenNo) {

		int sum = evenNo[0];
		for (int index = 1; index < evenNo.length; index++) {
			if (evenNo[index] % 2 == 0 && evenNo[index] >= 0)
				sum = sum + evenNo[index];

		}

		return sum;
	}

	public static void main(String[] args) {
		Assignment_15 assignment_15 = new Assignment_15();
		int arr[] = { 10, 20, 30, 190 };
		int maxvalue = assignment_15.retrunMaxNoArray(arr);
		System.out.println("Max number from given range is " + maxvalue);

		int arr1[] = { 5, 8, 9, 50, 2 };
		int min = assignment_15.retrunMinNoArray(arr1);
		System.out.println("Min number from given range is " + min);

		String[] namelnt = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		String value = assignment_15.findLenght(namelnt);
		System.out.println("The lenghtof the name is " + value);

		int mixnumber[] = { 12, -11, 99, 11, 23, -44 };
		int temp = assignment_15.countOfPositiveNo(mixnumber);
		System.out.println("The Positive number are " + temp);

		int sum[] = { 10, 20, -33, -55, 2 };
		int sumvalue = assignment_15.sumOfPositiveNo(sum);
		System.out.println("The sum of positive numbers " + sumvalue);

		int even[] = { 10, 13, -14, -20, 22, 3 };
		int evenvalue = assignment_15.sumOfEvenPositiveNo(even);
		System.out.println("The sum of Even positive numbers " + evenvalue);

	}
}
