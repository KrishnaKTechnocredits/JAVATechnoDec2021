package jagdish;

public class Assignment_17 {
	int count = 0;

	// Print all triplets in which all 3 numbers are consecutive.
	void triplets(int[] num) {
		System.out.println("The  triplets  number's are :- ");
		for (int index = 0; index < num.length - 2; index++) {
			if (num[index] + 1 == num[index + 1] && (num[index] + 2 == num[index + 2])) {
				System.out.println(num[index] + "-> " + num[index + 1] + "-->" + num[index + 2]);
			}

		}

	}

	// return String having maximum vowels from given array.
	int findCountfromString(String name) {
		int cnt = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')

				cnt++;
		}
		return cnt;

	}

	String getMaxVowelString(String[] arr) {
		System.out.println("The maximum vowels from given array is: ");
		int maxcount = 0;
		String maxVowelString = "";
		for (int index = 0; index < arr.length; index++) {
			String currentName = arr[index];
			int currentVowelCount = findCountfromString(arr[index]);
			if (currentVowelCount > maxcount) {
				maxcount = currentVowelCount;
				maxVowelString = currentName;
			}
		}
		return maxVowelString;
	}

	public static void main(String[] args) {
		Assignment_17 sequence = new Assignment_17();
		int[] numbers = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		sequence.triplets(numbers);
		System.out.println("");
		String[] name = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		System.out.println(sequence.getMaxVowelString(name));

	}
}
