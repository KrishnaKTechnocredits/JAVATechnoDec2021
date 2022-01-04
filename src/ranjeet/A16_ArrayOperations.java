package ranjeet;

public class A16_ArrayOperations {

	void printVowelsFromGivenStringOfArray(String[] str) {
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			int count = 0;
			for (int j = 0; j < str[i].length(); j++) {
				String s = str[i];
				if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o'
						|| s.charAt(j) == 'u') {
					// System.out.println("Vowels from " + str[i] + " is " + s.charAt(j));
					count++;
				}
			}
			sum = sum + count;
			System.out.println(str[i] + " -> " + count);

		}
		System.out.println("Vowels total count " + sum);
	}

	public static void main(String[] args) {
		A16_ArrayOperations a1 = new A16_ArrayOperations();
		String[] arr = { "priyanka", "swati", "acharya", "hevin" };
		A16_ArrayOperations a = new A16_ArrayOperations();
		a.printVowelsFromGivenStringOfArray(arr);
	}
}
