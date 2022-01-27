package archana;

public class Test4_Program2_PrimeLengthString {

	void getPrimeLengthStringInArray(String strName) {

		String[] arr = strName.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int wordLength = arr[i].length();
			if (isPrime(wordLength))
				System.out.println(arr[i] + " ");
		}

	}

	boolean isPrime(int num) {
		boolean flag = true;
		if (num == 1)
			return false;

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		Test4_Program2_PrimeLengthString test4 = new Test4_Program2_PrimeLengthString();
		String str = "I love my India";
		test4.getPrimeLengthStringInArray(str);

		System.out.println("--------------------------------");
		String str2 = "I would like to have a cup of tea";
		test4.getPrimeLengthStringInArray(str2);

	}
}
