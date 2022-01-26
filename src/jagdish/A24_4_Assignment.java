package jagdish;
/*Program 4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"*/

public class A24_4_Assignment {
	String reversename(String input) {
		String rev = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			rev = rev + ch;
		}

		return rev;
	}

	void splitnamereverse(String name) {
		String[] arr = name.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + reversename(arr[index]);

		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		A24_4_Assignment a24 = new A24_4_Assignment();
		a24.splitnamereverse("Hi techno hello");
	}

}
