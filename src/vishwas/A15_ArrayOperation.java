package vishwas;

public class A15_ArrayOperation {
	int getMaxnum(int[] arr) {
		int maxnum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (maxnum < arr[index])
				maxnum = arr[index];
		}
		return maxnum;
	}

	int getMinnum(int[] arr) {
		int minnum = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (minnum > arr[index])
				minnum = arr[index];
		}
		return minnum;
	}

	int getPositiveNumCount(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				count++;
		}
		return count;
	}

	int getSumOfPositiveNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				sum = sum + arr[index];
		}
		return sum;
	}

	int getSumOfEvenPositiveNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0 && arr[index] % 2 == 0)
				sum = sum + arr[index];
		}
		return sum;
	}

	int getAvgofAllNumbers(int[] arr) {
		int sum = 0;
		int count = 0;
		int avg = 0;
		for (int index = 0; index < arr.length; index++) {
			count++;
			sum = sum + arr[index];
			avg = sum / count;
		}
		return avg;
	}

	String getMaxString(String[] arr) {
		int maxString = arr[0].length();
		String maxStr = " ";
		for (int index = 1; index < arr.length; index++) {
			if (maxString < arr[index].length()) {
				maxString = arr[index].length();
				maxStr = arr[index];
			}
		}
		return maxStr;
	}

	public static void main(String[] args) {
		A15_ArrayOperation a15 = new A15_ArrayOperation();
		int[] arr = { 100, -11, 99, -4, 88, 115, 45, 99, -55 };
		String[] arr1 = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		int max = a15.getMaxnum(arr);
		System.out.println("Maximum number from give array :" + max);
		System.out.println("-------------------------------------");
		int min = a15.getMinnum(arr);
		System.out.println("Minimum number from given array :" + min);
		System.out.println("-------------------------------------");
		int cnt = a15.getPositiveNumCount(arr);
		System.out.println("Count of positive numbers from given array :" + cnt);
		System.out.println("-------------------------------------");
		int sum = a15.getSumOfPositiveNum(arr);
		System.out.println("Sum of positive numbers from given array :" + sum);
		System.out.println("-------------------------------------");
		int evenSum = a15.getSumOfEvenPositiveNum(arr);
		System.out.println("Sum of all even positive numbers from given array :" + evenSum);
		System.out.println("-------------------------------------");
		int avg = a15.getAvgofAllNumbers(arr);
		System.out.println("Average of all numbers in array :" + avg);
		System.out.println("-------------------------------------");
		String str = a15.getMaxString(arr1);
		System.out.println("Name having maximum length from given :" + str);

	}

}
