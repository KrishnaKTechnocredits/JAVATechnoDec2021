package yogeshNimbalkar;

//maximum word length from a given statement.
public class Test6_Program2 {

	String maxWordLength(String str) {
		String[] words = str.split(" ");
		int maxlength = 0;
		String result="";
		for(int index=0; index<words.length; index++) {
			if(maxlength < words[index].length()) {
				maxlength = words[index].length();
				result = words[index];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String input = "good morning technocredits hi hello";
		Test6_Program2 program2 = new Test6_Program2();
		System.out.println("Max length word is : " + program2.maxWordLength(input));
	}
}
