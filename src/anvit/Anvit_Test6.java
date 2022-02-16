package anvit;

public class Anvit_Test6 {
	
	void firstNonRepeatingCharInCap(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				if (Character.isUpperCase(ch)) {
					System.out.println("Output : " + ch);
					break;
				}
			}
		}

	}

	void maxLengthInGivenString(String str) {
		String[] arr = str.split(" ");
		int max = arr[0].length();
		String word = arr[0];
		for (int index = 1; index < arr.length; index++) {
			int strLength = arr[index].length();
			if (max < strLength) {
				max = strLength;
				word = arr[index];
			}
		}
		System.out.println("Output : " + word);
	}

	int sumOfDigitsInString(String str) {
		String[] arr = str.split(" ");
		int sum = 0;

		for (int index = 0; index < arr.length; index++) {
			sum += Integer.parseInt(arr[index]);

		}
		return sum;
	}

	public static void main(String[] args) {
		String str = "tEChNoCrEdits";
		System.out.println("Input : " + str);
		new Anvit_Test6().firstNonRepeatingCharInCap(str);
		System.out.println();
		
		String str1 = "good morning technocredits hi hello";
		System.out.println("Input : " + str1);
		new Anvit_Test6().maxLengthInGivenString(str1);
		System.out.println();
		
		String str2 = "10 10 20 30";
		System.out.println("Input : " + str2);
		int sum = new Anvit_Test6().sumOfDigitsInString(str2);
		System.out.println("Output : " + sum);
	}
}
