package apurva;

public class A17_ArrayVowelNumber {
	void displayConsecutiveNumbers(int[] arr) {

		for (int index = 0; index < arr.length - 2; index++) {
			if (arr[index] + 1 == arr[index + 1] && arr[index] + 2 == arr[index + 2]) {
				System.out.println(arr[index] + " -----> " + (arr[index] + 1) + " -----> " + (arr[index] + 2));
			}
		}
	}

	String displayMaximumVowelArray(String[] arr) {
		int maxCount = 0;
		String maxVowelName = "";

		for (int index = 0; index < arr.length; index++) {
			String a = arr[index];
			int currentCount = 0;

			for (int temp = 0; temp < a.length(); temp++) {		
				char ch = a.charAt(temp); 
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					currentCount++;
			}
			System.out.println(a + " ------> " + currentCount);
			if (currentCount > maxCount) {
				maxCount = currentCount;
				maxVowelName = a;
			}

		}

		System.out.println("Name with highest count of vowel is: " + maxVowelName + " ------> " + maxCount);
		return maxVowelName;
	}

	public static void main(String[] args) {
		System.out.println("List of 3 consecutive number is: " +"\n");
		int[] arr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };
		new A17_ArrayVowelNumber().displayConsecutiveNumbers(arr);

		System.out.println("\n"+"-----------------------------------" +"\n");

		String[] names = { "hi", "priyanka", "sandip", "aakanksha", "pallavi", "apurva" };
		new A17_ArrayVowelNumber().displayMaximumVowelArray(names);

	}

}
