package pranoti;

public class T4_P2_StringOperations {

	boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		if (num == 1) {
			return false;
		}
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	void findString(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int len = arr[index].length();
			if (isPrimeNumber(len))
				System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		T4_P2_StringOperations test4 = new T4_P2_StringOperations();
		String str = "I would like to have a cup of tea";
		test4.findString(str);
	}
}
