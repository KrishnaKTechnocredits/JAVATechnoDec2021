package vishakha;

public class A15_Array {
	int numMax_GivenArray(int[] arr) {
		int maximum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maximum)
				maximum = arr[i];
		}
		return maximum;
	}

	int numMin_GivenArray(int[] arr) {
		int minimum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minimum)
				minimum = arr[i];
		}
		return minimum;
	}

	int return_NumPositive(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				count++;
		}
		return count;
	}

	void positiveNum_Sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				sum = sum + arr[i];
		}
		System.out.println("Sum of Positive Number is : " + sum);
	}

	void evenPositiveNum_Sum(int[] arr) {
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				if (arr[i] > 0)
					sum1 = sum1 + arr[i];
		}
		System.out.println("Sum of even positive numbers is:" + sum1);
	}

	void lenMaximum_GivenArray(String[] name) {
		String maximum = name[0] + " ";
		for (int i = 0; i < name.length; i++) {
			if (name[i].length() > maximum.length())
				maximum = name[i];
		}
		System.out.println("Name with maximum length in provided array:" + maximum);
	}

	public static void main(String[] args) {
		int num[] = { 5, -10, -15, 20, 4, 6, -20 };
		int n = num.length;
		A15_Array a15 = new A15_Array();
		System.out.println("Max number in Array" + a15.numMax_GivenArray(num));
		System.out.println("Min Number in Array" + a15.numMin_GivenArray(num));
		a15.positiveNum_Sum(num);
		a15.evenPositiveNum_Sum(num);

		String name[] = { "Karan", "Shweta", "Pallavi", "Abhishek", "Sagar" };
		int findStr = name.length;
		a15.lenMaximum_GivenArray(name);

	}
}
