package jagdish;

public class A24_2_Assignment {

	void printvowel(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
					|| ch == 'U' || ch == 'u') {
				count++;
			}
		}
		System.out.println(input + "-->" + count);
	}

	void spiltWordsInString(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			printvowel(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_2_Assignment a24 = new A24_2_Assignment();
		a24.spiltWordsInString("aashvi technocredits");
	}
}
