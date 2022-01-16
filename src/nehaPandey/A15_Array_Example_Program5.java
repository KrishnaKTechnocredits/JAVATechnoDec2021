package nehaPandey;

public class A15_Array_Example_Program5 {
	int[] arr = { 10, 13, -14, -20, 22, 3 };
	int sum = 0;

	int sumOfEvenPositiveNumber() {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 0 && arr[index] % 2 == 0) {
				sum = sum + arr[index];

			}
		}
		return sum;

	}

	public static void main(String[] args) {
		A15_Array_Example_Program5 array = new A15_Array_Example_Program5();
		int EvenNumber = array.sumOfEvenPositiveNumber();
		System.out.println("Sum of all even positive numbers from given array: " + EvenNumber);

	}

}
