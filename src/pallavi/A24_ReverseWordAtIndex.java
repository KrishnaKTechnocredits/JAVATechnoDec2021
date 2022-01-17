/*IMPORTANT
Program 4. WAP to reverse each word on the same index
Input    : "Hi techno hello"
Output : "iH onhcet olleh"

Program 5. WAP to convert first character of word with capital letter
Input    : "anvit harsh dipali"
Output : "Anvit Harsh Dipali"

Program 6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"

*/

package pallavi;

public class A24_ReverseWordAtIndex {

	String reverseString(String input) {
		String revStr = "";
		for (int i = input.length() - 1; i >= 0; i--)
			revStr += input.charAt(i) + "";
		return revStr;
	}

	String firstCapital(String str) {
		char firstChar = str.charAt(0);
		char ch = Character.toUpperCase(firstChar);
		String temstr = str.replaceFirst(String.valueOf(firstChar), String.valueOf(ch));
		return temstr;
	}

	// Program 4. WAP to reverse each word on the same index
	void reverseStringAtIndex(String str) {
		String[] input1 = str.split(" ");
		String tempstr = "";
		for (int index = 0; index < input1.length; index++)
			tempstr += reverseString(input1[index]) + " ";
		System.out.println("Output :- " + tempstr);
	}

	// Program 5. WAP to convert first character of word with capital letter
	void firstCapitalRevStr(String str) {
		String[] arr = str.split(" ");
		String output = "";

		for (int index = 0; index < arr.length; index++) {
			output += firstCapital(arr[index]) + " ";
		}
		System.out.println("Output :-" + output);
	}

	// Program 6. WAP to reverse each word and convert first letter of each word
	// into capital
	void reverseAndCapital(String str) {
		String[] arr = str.split(" ");
		String tempStr = "";
		String output = "";

		for (int index = 0; index < arr.length; index++) {
			tempStr = reverseString(arr[index]);
			output += firstCapital(tempStr) + " ";
		}
		System.out.println("Output :- " + output);
	}

	public static void main(String[] arr) {
		A24_ReverseWordAtIndex a24_ReverseWordAtIndex = new A24_ReverseWordAtIndex();

		System.out.println("----Prog4------");
		String input = "Hi techno hello";
		System.out.println("Input :-" + input);
		a24_ReverseWordAtIndex.reverseStringAtIndex(input);

		System.out.println("----Prog5------");
		input = "anvit harsh dipali";
		System.out.println("Input :-" + input);
		a24_ReverseWordAtIndex.firstCapitalRevStr(input);

		System.out.println("----Prog6------");
		input = "Vrushali Sagar Shital";
		System.out.println("Input :-" + input);
		a24_ReverseWordAtIndex.reverseAndCapital(input);
	}

}
