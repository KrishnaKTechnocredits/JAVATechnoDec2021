package sham;

public class A29_AdditionFromSentence {
//WAP to find out the total sum of all the numbers present in the given string without using Character class method.
	
	void returnNumberFromString(String sentence) {
		int num = 0, sum = 0;
		String words[] = sentence.split(" ");//splitted the sentence

		for (int i = 0; i < words.length; i++) {
			try {
				num = Integer.parseInt(words[i]);// converting the String numbers to digit
				sum = sum + num;//Adding the number
			} catch (NumberFormatException e) {
				//System.out.println("Number Format Exception catched");
			}

		}
		System.out.println("Sum of the numbers from String :"+sum);
	}

	public static void main(String[] args) {
		A29_AdditionFromSentence st = new A29_AdditionFromSentence();
		String sentence = "i have 15 years and 3 months experience";

		st.returnNumberFromString(sentence);
	}

}
