package rohini;

/*Assignment - 15 : 30th Dec'2021*/

public class Rohini_Assignment15 {

	/* Program 1 : return maximum number from give array. */
	public int FindMaxNumber(int[] arr) {
		int maxNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNum)
				maxNum = arr[index];

		}
		return maxNum;
	}

	/* Program 2 : return minimum number from given array. */
	public int FindMinNumber(int[] arr) {
		int minNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < minNum)
				minNum = arr[index];

		}
		return minNum;
	}

	/*
	 * Program 3 : Return count of positive numbers from given array. sample input :
	 * int[] arr = {12,-11,99,11,23,-44} output : 4
	 */

	int FindcountOfPositiveNumber(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				count++;
		}
		return count;
	}

	/*
	 * Program 4 : return sum of positive numbers from given array. sample input :
	 * int[] arr = {10,20,-33,-55,2}; output : 32
	 */

	int FindsumOfPositiveNumbers(int[] arr) {
		int sum = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				sum = sum + arr[index];
		}
		return sum;
	}

	/*
	 * Program 6 : return name having maximum length from given array. input :
	 * String[] arr = {"Karan", "Shweta", "Pallavi", "Abhishek", "Sagar"}; output :
	 * Abhishek
	 */

	String maxLenString(String[] arr) {
		int maxlen = arr[0].length();
		String maxlenstr = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxlen) {
				maxlen = arr[index].length();
				maxlenstr = arr[index];
			}
		}
		return maxlenstr;
	}

	public static void main(String[] args) {
		Rohini_Assignment15 rohiniAss15 = new Rohini_Assignment15();
		int[] arr = { 12, 11, 99, 11, 23, 44, 9 };
		int MaximumNum = rohiniAss15.FindMaxNumber(arr);
		System.out.println("Maximum Number is : " + MaximumNum);
		int minimumNum = rohiniAss15.FindMinNumber(arr);
		System.out.println("Minimum Number is : " + minimumNum);
		int[] arr1 = { 10, 20, -33, -55, -2, -1, -99 };
		System.out.println("Count of positive number is : " + rohiniAss15.FindcountOfPositiveNumber(arr1));
		int[] arr2 = { 10, 20, -33, -55, 2 ,0,100};
		System.out.println("Sum of positive numbers are :" + rohiniAss15.FindsumOfPositiveNumbers(arr2));
		String[] arr3 = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		System.out.println("Maximum String length is :" + rohiniAss15.maxLenString(arr3));
	}

}
