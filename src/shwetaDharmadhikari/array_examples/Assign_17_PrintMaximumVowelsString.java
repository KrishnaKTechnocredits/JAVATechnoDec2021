/*Assignment - 17 : 1st Jan'2021
 * Program 2: return String having maximum vowels from given array.
Sample input : String[] arr = {"hi","priyanka", "sandip", "aakanksha", "pallavi", "apurva"};
output : aakanksha
 */
package shwetaDharmadhikari.array_examples;

public class Assign_17_PrintMaximumVowelsString {

	String displayMaxVowelsString(String[] arr) {
		String name = " ";
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			String input = arr[index];
			int vowelCnt = 0;
			for (int innerindex = 0; innerindex < input.length(); innerindex++) {
				char ch = input.charAt(innerindex);
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
						|| ch == 'o' || ch == 'u')
					vowelCnt++;
			}
			if (vowelCnt > count) {
				count = vowelCnt;
				name = input;
			}
		}
		return name;
	}

	public static void main(String[] args) {
		String[] arr = { "hi", "priyanka", "sandip", "Aakanksha", "pallavi", "apurva" };
		Assign_17_PrintMaximumVowelsString assign_18_PrintMaximumVowelsString = new Assign_17_PrintMaximumVowelsString();
		System.out.println("Output  : " + assign_18_PrintMaximumVowelsString.displayMaxVowelsString(arr));
	}

}
