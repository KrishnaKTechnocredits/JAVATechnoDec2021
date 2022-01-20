package omkar;

public class A24_Program3 {

	String isDigit(String str) {
		String temp = " ";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}
		return temp;
	}

	void arrayOfDigit(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String[] output = new String[arr.length];
			output[index] = isDigit(arr[index]);
			System.out.println(output[index]);
		}
	}

	public static void main(String[] args) {
		A24_Program3 p3 = new A24_Program3();
		String input = "Te1c2h C94re3";
		p3.arrayOfDigit(input);
	}

}
