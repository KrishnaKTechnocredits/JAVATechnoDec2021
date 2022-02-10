package nasir;
/*Programming Test - 6
1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N

2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits

3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70*/

public class Test6 {
	char findNonRepeatingLetter(String input) {
		char temp = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			String s = ch + " ";
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				if (Character.isUpperCase(ch)) {
					temp = ch;
				}
			}
		}
		return temp;
	}
		void findMaxWordLength(String input) {
			int maxLength=0;
			String maxWord=" ";
			String[] output= input.split(" ");
			for(int index=0;index<output.length;index++) {
				if(maxLength<output[index].length()) {
					maxWord=output[index];	
					maxLength=output[index].length();								
				}
			}
			System.out.println("Maximum length of word is "+maxWord);
			
		}
		 void sumOfAllNumbers(String num) {
			 int total=0;
			 String[] output=num.split(" ");
			 for(int index=0;index<output.length;index++) {
				 total=total+Integer.parseInt(output[index]);
			 }
			 System.out.println("Total Length is "+total);
		 }
	public static void main(String[] args) {
		Test6 test6 = new Test6();
		char ans = test6.findNonRepeatingLetter("tEChNoCrEdits");
		System.out.println("Non Repeating character capital :" + ans);
		String input="good morning technocredits hi hello";
		test6.findMaxWordLength(input);
		String number ="10 10 20 30";
		test6.sumOfAllNumbers(number);
	}

}
