package yogiraj;

public class Assignment15 {
	int max, min;

	public int returnMax(int[] arr) {
		int i = 0;

		max = arr[i];
		for (; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public int returnMin(int[] arr) {
		int i = 0;

		min = arr[i];
		for (; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public int returnSumOfPositive() {
		int[] arr = { 10, 20, -33, -55, 2 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	public int returnSumOfEvenPositive() {
		int[] arr = { 10, 13, -14, -20, 22, 3 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] % 2 == 0) {
				sum = sum + arr[i];
			}
		}

		return sum;
	}

	public String returnMaxlength() {

		String[] arr = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };

		int nameLenght;

		int i = 0;

		nameLenght = arr[i].length();

		String name = arr[i];

		for (; i < arr.length; i++) {
			if (arr[i].length() > nameLenght) {
				nameLenght = arr[i].length();

				name = arr[i];
			}
		}
		return name;
	}

	public static void main(String[] args) {
		int[] arr = { 12, -11, 99, 11, 23, -44 };

		Assignment15 a = new Assignment15();

		System.out.println("Maximum number is \t" + a.returnMax(arr));

		System.out.println("Maximum number is \t" + a.returnMin(arr));

		System.out.println("Sum of all positive numbers is \t" + a.returnSumOfPositive());

		System.out.println("Sum of all positive numbers is \t" + a.returnSumOfEvenPositive());

		System.out.println("Name with MaxLength is " + a.returnMaxlength());

	}

}
