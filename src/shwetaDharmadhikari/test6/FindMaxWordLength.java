/*2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits
 */
package shwetaDharmadhikari.test6;

public class FindMaxWordLength {

	String maxWordLength(String input) {
		String[] arr = input.split(" ");
		int maxWordLength = 0;
		String maxWord = "";
		for (int index = 0; index < arr.length; index++) {
			if (maxWordLength < arr[index].length()) {
				maxWord = arr[index];
				maxWordLength = arr[index].length();
			}
		}
		return maxWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "good morning technocredits hi hello";
		System.out.println("output: " + new FindMaxWordLength().maxWordLength(input));
	}
}
