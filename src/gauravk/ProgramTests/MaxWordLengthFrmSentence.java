package gauravk.ProgramTests;
/*
 *  Programming Test - 6
1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N

2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits

3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70

Expected time to complete all 3 program is 1 hr 15 mins (max)
 */
//Time taken: 16 min
public class MaxWordLengthFrmSentence {
	
	String findMaxWordLength(String str) {
		String[] str1 = str.split(" ");
		int maxLength=0, position=0;
		for(int i=0; i<str1.length; i++) {
			if(str1[i].length()>maxLength) {
				maxLength = str1[i].length();
				position=i;
			}
		}
		return str1[position];
	}
	
	public static void main(String[] args) {
		String sentence = "good morning technocredits hi hello";
		MaxWordLengthFrmSentence mx = new MaxWordLengthFrmSentence();
		System.out.println("Maximum word length from the below statement:\n"+sentence+"\nMax length word is: "+mx.findMaxWordLength(sentence));
	}
}
