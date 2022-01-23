/*
WAP to tOGGLE each word in string?
input : this is javatpoint
output : tHIS iS jAVATPOINT

*/


package vaibhav.Practice.StringProgramming;

public class ToggleEachWord {
	
	String toggleWord(String str) {
		String temp = "";
		temp =Character.toString(str.charAt(0)).toLowerCase() + str.substring(1).toUpperCase();
		return temp;
	}
	
	void toggleWholeString(String inputStr) {
		System.out.println("Input		: "+ inputStr);
		String [] strArr = inputStr.split(" ");
		String output = "";
		for(String word: strArr) {
			output = output + " " + toggleWord(word);
		}
		System.out.println("Expected output : " + output.trim());
	}
	
	public static void main(String[] args) {
		ToggleEachWord toggleEachWord = new ToggleEachWord();
		String inputStr = "this is javatpoint";
		toggleEachWord.toggleWholeString(inputStr);
	}
}
