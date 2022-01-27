package pradeep;

public class Exam4Prog2 {
	boolean isPrimeNum(int num) {
		if ((num == 1))
			return false;
		else {
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0)
					return false;
			}
		}
		return true;
	}

	String returnDesiredString(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		
		for (int index = 0; index < arr.length; index++) {
			int len = arr[index].length();
			System.out.println("len: " + len);
			boolean islenPrime = isPrimeNum(len);

			if (islenPrime == true) {
				temp += arr[index] + " ";
			}
		}

		return temp.trim();
	}

	public static void main(String[] args) {
		Exam4Prog2 exam4Prog2 = new Exam4Prog2();
		String input = "I love my India";
		System.out.println("Input: " + input);
		String output = exam4Prog2.returnDesiredString(input);
		System.out.println("Output: " + output);
	}
}
