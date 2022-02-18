package nehaPandey;

//1.  Write a method to return the first non repeating Capital character.
//Input : tEChNoCrEdits
//Output : N

//2. Find maximum word length from a given statement.
//input = "good morning technocredits hi hello";
//output : technocredits

//3. sum of all numbers in a given statement.
//input = "10 10 20 30";
//output : 70

public class Exam_6 {

	void firstNonRepeatingCapitalCharacter(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				if (Character.isUpperCase(ch)) {
					System.out.println("The first non repeating Capital Character is : " + ch);
					System.out.println();
					break;
				}
			}
		}

	}

	void findMaxWordLength(String str) {
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
		System.out.println("Maximum word length from a given statement is : " + word);
		System.out.println();

	}

	int sumOfDigitsInString(String str) {
		String[] arr = str.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Exam_6 exam6 = new Exam_6();
		exam6.firstNonRepeatingCapitalCharacter("tEChNoCrEdits");
		exam6.findMaxWordLength("good morning technocredits hi hello");
		String input = "10 10 20 30";
		System.out.println("Sum of all numbers in a given statement : " + exam6.sumOfDigitsInString(input));

	}

}
