package jagdish;
/*Program 5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"*/

public class A24_5_Assignment {

	String firstCharCap(String name) {
		String rev = "";
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (index == 0)
				ch = Character.toUpperCase(ch);
			rev = rev + ch;
		}
		return rev;
	}

	void spiltWordsInString(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + firstCharCap(arr[index]);
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		A24_5_Assignment a24 = new A24_5_Assignment();
		a24.spiltWordsInString("anvit harsh dipali");
	}

}
