package hevin;

public class Test6 {

	String firstCap = "";
	
	void nonRepeatingChar(String input){
		for (int index = 0; index < input.length(); index++) {
			String temp = "";
			char ch = input.charAt(index);
			if ((input.indexOf(ch) == input.lastIndexOf(ch)) && Character.isUpperCase(ch)) {
				temp += ch;
				firstCap = temp;
				break;
			}
		}
		System.out.println("First Non repeating Capital Character is : " + firstCap);
	}
	
	void getMaximumLengthWord(String str) {
		String[] input = str.split(" ");
		String maxLengthWord = "";
		
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() >= maxLengthWord.length()) {
				maxLengthWord = input[i];
			}
		}
		System.out.println("Maximum length word is : "+maxLengthWord);
	}
	
	 void getSum(String statement) {
		String[] str = statement.split(" ");
		int sum = 0;
		int num = str.length;
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(str[i]);
				sum = sum + arr[i];
		}
		System.out.println("Sum of Given Statement : "+sum);
	}
	
	public static void main(String[] args) {
		Test6 test = new Test6();
		String input = "tEChNoCrEdits";
		test.nonRepeatingChar(input);
		String input1 = "good morning technocredits hi hello";
		test.getMaximumLengthWord(input1);
		String input2 = "10 10 20 30";
		System.out.println();
		System.out.println("Given Statement : "+input2);
		test.getSum(input2);
	}
}
		