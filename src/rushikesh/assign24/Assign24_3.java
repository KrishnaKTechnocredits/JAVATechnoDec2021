package rushikesh.assign24;

import java.util.Arrays;
//Program 3. WAP to retuen array of words containing only digits.
//Input    : "Te1c2h C94re3"
//Output : "12" "943"

public class Assign24_3 {
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
		Assign24_3 assign24_3=new Assign24_3();
		String[] s = assign24_3.getDigitArray("Te1c2h C94re3");
		System.out.println(Arrays.toString(s));
	}
}
