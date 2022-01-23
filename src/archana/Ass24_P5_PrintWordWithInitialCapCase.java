package archana;

public class Ass24_P5_PrintWordWithInitialCapCase {
	String stringWithInitialInCaps(String input) {
		String reverseCase = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == 0)
				ch = Character.toUpperCase(ch);
			reverseCase = reverseCase + ch;
		}
		return reverseCase;
	}

	void spiltString(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + stringWithInitialInCaps(arr[index]);
		}
		System.out.println("First Initial Capital Letter : "+temp.trim());
	}

	public static void main(String[] args) {
		Ass24_P5_PrintWordWithInitialCapCase ass24 = new Ass24_P5_PrintWordWithInitialCapCase();
		ass24.spiltString("anvit harsh dipali");
	}
}
