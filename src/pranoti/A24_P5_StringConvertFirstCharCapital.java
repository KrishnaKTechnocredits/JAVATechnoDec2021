package pranoti;

public class A24_P5_StringConvertFirstCharCapital {

	void ConvertFirstCharToUppercase(String input) {
		String[] arr = input.split(" ");
		String temp = " ";
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			char ch = arr[index].charAt(0);
			ch = Character.toUpperCase(ch);
			word = ch + word.substring(1);
			temp = temp + word + " ";
		}
		System.out.println(temp.trim());
	}

	public static void main(String[] args) {
		A24_P5_StringConvertFirstCharCapital StringConvertFirstCharCapital = new A24_P5_StringConvertFirstCharCapital();
		StringConvertFirstCharCapital.ConvertFirstCharToUppercase("anvit harsh dipali");
	}
}
