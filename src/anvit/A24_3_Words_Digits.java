package anvit;

import java.util.Arrays;

public class A24_3_Words_Digits {
	
	String[] getDigitArray(String str) {
		String[] arr = str.split(" ");
		String[] s = new String[arr.length];
		for (int index = 0; index < arr.length; index++) {
			s[index] = getDigit(arr[index]);
		}
		return s;
	}

	String getDigit(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A24_3_Words_Digits a24_3_Words_Digits = new A24_3_Words_Digits();
		String[] s = a24_3_Words_Digits.getDigitArray("Te1c2h C94re3");
		System.out.println(Arrays.toString(s));
	}
}
