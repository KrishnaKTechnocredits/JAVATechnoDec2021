package swati.Swati_Assignment24;
import java.util.Arrays;

public class TotalVowels {

	public static void main(String[] args) {

		TotalWords t = new TotalWords();
		String str = "aashvi technocredits";
		String arr[] = str.split(" ");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			System.out.println("Total Length of words " + arr[i].length());
			for (int j = 0; j < arr[i].length(); j++) {
				char c = arr[i].charAt(j);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}

			}
			System.out.println("Total Vowels in " + count);
		}

	}

}
