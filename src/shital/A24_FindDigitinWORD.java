package shital;
import java.util.Arrays;

public class A24_FindDigitinWORD {

	String[]  getDigitFromString(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String temp = "";
			for (int Index2 = 0; Index2 < wordLength; Index2++) {
				char ch = word.charAt(Index2);
				if (Character.isDigit(ch))
					temp += ch;
			}
			arr[index] = temp;
		}
		return arr;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_FindDigitinWORD findDigitinWORD=new A24_FindDigitinWORD();
		String[] arr = findDigitinWORD.getDigitFromString("ATe1c2h C94re3");
		System.out.println(Arrays.toString(arr));
	}

}
