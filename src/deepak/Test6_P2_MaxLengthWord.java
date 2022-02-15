// Test 6 Program 2 - Time Taken- 8 mins
package deepak;

public class Test6_P2_MaxLengthWord {

	String maxLengthWord(String input) {
		String[] tempArr = input.split(" ");
		String output = "";
		int templength = 0;
		for (int index = 0; index < tempArr.length; index++) {
			if (templength < tempArr[index].length()) {
				templength = tempArr[index].length();
			}
			if (tempArr[index].length() == templength) {
				output = tempArr[index];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Test6_P2_MaxLengthWord maxLengthWord = new Test6_P2_MaxLengthWord();
		System.out.print("Word in the statement with maximum length is: ");
		System.out.println(maxLengthWord.maxLengthWord("good morning technocredits hi hello"));

	}

}
