package archana;

public class Ass24_P3_FindDigitsFromString {
	
	void findDigitinString(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}
		System.out.println(temp);
	}

	void spiltString(String input) {
		String[] arr = input.split(" ");
		
		for (int index = 0; index < arr.length; index++) {
			
			findDigitinString(arr[index]);
		}
	}

	public static void main(String[] args) {
		Ass24_P3_FindDigitsFromString ass24 = new Ass24_P3_FindDigitsFromString();
		ass24.spiltString("Te1c2h C94re3");
	}
}
