package jagdish;

/*Program 3. WAP to retuen array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"
*/
public class A24_3_Assignment {

	void onlyDigit(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}
		System.out.println(temp);
	}

	void spiltnumber(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			onlyDigit(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_3_Assignment a24 = new A24_3_Assignment();
		a24.spiltnumber("Te1c2h C94re3");

	}

}
