package saurav;

public class CodingTest_6 {
	
	void firstNonRepetingChar(String input) {
		for(int index=0; index<=input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				System.out.println("first non repeting char = "+ch);
				break;
			}
		}
	}
	
	
	void maxWordLength(String input1) {
		String[] words = input1.split(" ");
		//System.out.println(words);
		String longestWord = " ";
		for(int index =0; index<words.length; index++) {
			if(words[index].length()>= longestWord.length()) {
				longestWord = words[index];
			}
		}
		System.out.println("Longest String = "+longestWord);
	}
	
	void sumOfNums(String input2) {
		String []numArray = input2.split(" ");
		//System.out.println(numArray);
		 int sum =0;
		for (int index=0; index<numArray.length; index++) {
			int convert = Integer.parseInt(numArray[index]);
			sum = sum+convert;
		}
		System.out.println("sum of numbers = "+sum);

	}
	
	public static void main(String[] args) {
		CodingTest_6 program1 = new CodingTest_6();
		program1.firstNonRepetingChar("tEChNoCrEdits");
		System.out.println();
		String input1 = "good morning technocredits hi hello";
		program1.maxWordLength(input1);
		System.out.println();
		String input2 = "10 10 20 30";
		program1.sumOfNums(input2);
	}
}
